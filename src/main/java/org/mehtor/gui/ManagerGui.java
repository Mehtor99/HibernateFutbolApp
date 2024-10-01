package org.mehtor.gui;

import org.mehtor.entity.Manager;
import org.mehtor.entity.Player;
import org.mehtor.entity.Team;
import org.mehtor.model.ControllerModel;
import org.mehtor.model.TeamModel;
import org.mehtor.repository.ManagerRepository;
import org.mehtor.repository.TeamRepository;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;



public class ManagerGui {
	private static ControllerModel controllerModel;
	private static Optional<Manager> activeManager = Optional.empty();  // aktif menajer bilgisini burada tutuyoruz
	private static final Scanner scanner = new Scanner(System.in);
	private static final ManagerRepository managerRepository = new ManagerRepository();
	private static final TeamRepository teamRepository = new TeamRepository();
	
	public static void menajerModule(ControllerModel cModel) {
		controllerModel = cModel;
		
		int opt;
		do {
			
			
			opt =menajerGirisMenuOpsiyonlari(menajerGirisMenu());
		} while (opt != 0);
	}
	
	private static Optional<Manager> girisYap() {
		
		while (true) {
			System.out.println("lütfen menajer ID giriniz");
			Long id = scanner.nextLong();
			scanner.nextLine();
			System.out.println("lütfen menajer sifrenizi giriniz");
			String sifre = scanner.nextLine();
			Optional<Manager> menager = controllerModel.managerController.findManagerByIdAndPassword(id, sifre);
			
			if (menager.isPresent()) {
				activeManager = menager;
				System.out.println("başarılı bir şekilde giriş yaptınız");
				return menager;
			}
			else {
				System.out.println("giriş yapılamadı.Lütfen tekrar deneyiniz");
			}
			
		}
	}
	
	private static int menajerGirisMenu() {
		System.out.println("-----Menajer Giris Menu-----");
		System.out.println("1-Giris Yap");
		System.out.println("2-Kayıt Ol");
		System.out.println("0-Geri dön");
		System.out.print("seciminiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int menajerGirisMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				girisYap();
				menajerMenuOpsiyonlari(menajerMenu());
				break;
			}
			case 2: {
				register();
				break;
			}
			case 0: {
				System.out.println("Ust menuye donuluyor ");
				break;
			}
		}
		return opt;
		
	}
	
	private static void register() {
		Scanner scanner = new Scanner(System.in);
		
		String username;
		boolean isRegisteredUser;
		String name, surname;
		
		do{
			System.out.print("Adınızı giriniz: ");
			name = scanner.nextLine();
			
			System.out.print("Soyadınızı giriniz: ");
			surname = scanner.nextLine();
			
			System.out.print("Username giriniz: ");
			username = scanner.nextLine();
			
			isRegisteredUser = !managerRepository.existsByUserName(username);
			if (!isRegisteredUser) {
				System.out.println("Bu username zaten alınmış, lütfen başka bir username deneyin.");
			}
		}while (!isRegisteredUser);
		
		System.out.print("Password giriniz: ");
		String password = scanner.nextLine();
		
		LocalDate dtarih;
		while (true) {
			System.out.print("Doğum tarihinizi giriniz (yyyy-MM-dd formatında): ");
			String dateInput = scanner.nextLine();
			
			try {
				dtarih = LocalDate.parse(dateInput);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Geçersiz tarih formatı, lütfen yyyy-MM-dd formatında bir tarih giriniz.");
			}
		}
		List<Team> teamList= teamRepository.findAll();
		Long secilenTakimID=takimSec(teamList);
		
		activeManager = controllerModel.managerController.findByTeamId(secilenTakimID);
		if (activeManager.isPresent()) {
			Manager oldManager = activeManager.get();
			oldManager.setManagerName(oldManager.getManagerName());
			oldManager.setManagerSurname(oldManager.getManagerSurname());
			oldManager.setUserName(oldManager.getUserName());
			oldManager.setManagerPassword(oldManager.getManagerPassword());
			oldManager.setDateOfBirth(oldManager.getDateOfBirth());
			oldManager.setTeamID(0L);
			
			managerRepository.update(oldManager);
			System.out.println("Menajer guncellendi");
		}
		
		Manager manager = new Manager();
		manager.setManagerName(name);
		manager.setManagerSurname(surname);
		manager.setUserName(username);
		manager.setManagerPassword(password);
		manager.setDateOfBirth(dtarih);
		manager.setTeamID(secilenTakimID);
		
		managerRepository.save(manager);
		System.out.println("Kayıt başarıyla tamamlandı!");
	}
	
	private static Long takimSec(List<Team> teamList) {
		System.out.println("Lütfen takımınızı seciniz");
		
		for (int i = 0; i < teamList.size(); i++) {
			System.out.println((i+1) + ". " + teamList.get(i).getTeamName());
		}
		
		System.out.print("Takim numarasını giriniz: ");
		int takimSec= scanner.nextInt();scanner.nextLine();
		
		while (takimSec<1||takimSec>teamList.size()) {
			System.out.println("Gecersiz secim lütfen tekrar deneyiniz: ");
			takimSec= scanner.nextInt();scanner.nextLine();
			
		}
		Long secilenTakimId = teamList.get(takimSec - 1).getId();
		
		activeManager = controllerModel.managerController.findByTeamId(secilenTakimId);
		if (activeManager.isPresent()){
			activeManager.get().setTeamID(0L);
			managerRepository.update(activeManager.get());
		}else {
			System.out.println("Aktif menajer bulunamadı");
		}
		return secilenTakimId;
	}
	
	private static int menajerMenu() {
		
		System.out.println("-----Menajer Menu-----");
		System.out.println("1-Takimimin detaylarını goruntuleyin");
		System.out.println("2-Takimimin futbolcularımı goruntuleyin");
		System.out.println("3-Diğer takimlarin özet bilgilerini goruntuleyin");
		System.out.println("4-Transfer İşlemleri");
		System.out.println("0-Cıkıs yap");
		System.out.print("seciminiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int menajerMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				kulubumunDetaylariniGoruntule();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 2: {
				kulubumunFutbolculariniGoruntule();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 3: {
				takimlerinOzetBilgileriniGoruntule();
				takimIdyeGoreFutbolcularOzetBilgi();
				menajerMenuOpsiyonlari( menajerMenu());
				break;
			}
			case 4: {
				TransferOfferGui.transferGui(controllerModel, activeManager);
				break;
			}
			case 0: {
				System.out.println("Ust menuye donuluyor");
			}
			default:
				System.out.println("Geçerli bir seçim yapınız!!");
		}
		return opt;
	}
	
	private static void takimIdyeGoreFutbolcularOzetBilgi() {
		
		System.out.println("Futbolcularini goruntulemek istediginiz takimi seciniz:");
		Long teamID = scanner.nextLong();
		scanner.nextLine();
		List<Player> playerList = controllerModel.playerController.findPlayerByTeamID(teamID);
		playerList.forEach(player -> System.out.println(player.toStringOzet()));
	}
	
	private static void takimlerinOzetBilgileriniGoruntule() {
		TeamModel teamModel=new TeamModel();
		teamModel.takimlerinOzetBilgileriniGoruntule();
	}
	
	private static void kulubumunDetaylariniGoruntule() {
		
		if (activeManager.isEmpty()) {
			System.out.println("lütfen giriş yapınız");
		}
		controllerModel.managerController.findTeamIdByManagerId(activeManager.get().getTeamID());
	}
	
	private static void kulubumunFutbolculariniGoruntule() {
		
		
		if (activeManager.isEmpty()) {
			System.out.println("lütfen giriş yapınız");
		}
		List<Player> takiminFutbolculari = controllerModel.playerController.findPlayerByTeamID(activeManager.get().getTeamID());
		takiminFutbolculari.forEach(System.out::println);
	}
}