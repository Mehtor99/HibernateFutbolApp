package org.mehtor.utility;

import org.mehtor.entity.*;
import org.mehtor.enums.ECluster;
import org.mehtor.enums.EColours;
import org.mehtor.enums.EPosition;
import org.mehtor.enums.ERegion;
import org.mehtor.repository.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DataGenerator {
	PlayerRepository playerRepository;
	TeamRepository teamRepository;
	LeagueRepository leagueRepository;
	StadiumRepository stadiumRepository;
	ManagerRepository managerRepository;
	
	
	public DataGenerator() {
			this.playerRepository = new PlayerRepository();
			this.teamRepository = new TeamRepository();
			this.leagueRepository = new LeagueRepository();
			this.managerRepository = new ManagerRepository();
			this.stadiumRepository = new StadiumRepository();
		}
		
		public void createGenerateData () {
			createTeams();
			createPlayers();
			createManager();
			createStadium();
			createLeague();
			
			
		}
		
		private void createPlayers () {
			
			List<Player> players = new ArrayList<>();
			
			// Kaleciler
			players.add(Player.builder().name("Fernando").surname("Muslera").birthday(LocalDate.of(1986, 6, 16))
			                  .position(EPosition.GOALKEEPER).contractFee(1400000L).teamID(1L).build());
			
			players.add(Player.builder().name("Günay").surname("Güvenç").birthday(LocalDate.of(1991, 6, 25))
			                  .position(EPosition.GOALKEEPER).contractFee(600000L).teamID(1L).build());
			
			players.add(Player.builder().name("Batuhan").surname("Şen").birthday(LocalDate.of(1999, 2, 3))
			                  .position(EPosition.GOALKEEPER).contractFee(425000L).teamID(1L).build());
			
			// Defans oyuncuları
			players.add(Player.builder().name("Davinson").surname("Sánchez").birthday(LocalDate.of(1996, 6, 12))
			                  .position(EPosition.DEFENCE).contractFee(18000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Victor").surname("Nelsson").birthday(LocalDate.of(1998, 10, 14))
			                  .position(EPosition.DEFENCE).contractFee(17000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Abdülkerim").surname("Bardakcı").birthday(LocalDate.of(1994, 9, 7))
			                  .position(EPosition.DEFENCE).contractFee(9000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Kaan").surname("Ayhan").birthday(LocalDate.of(1994, 11, 10))
			                  .position(EPosition.DEFENCE).contractFee(4700000L).teamID(1L).build());
			
			players.add(Player.builder().name("Metehan").surname("Baltacı").birthday(LocalDate.of(2002, 11, 3))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Ali").surname("Yeşilyurt").birthday(LocalDate.of(2005, 7, 30))
			                  .position(EPosition.DEFENCE).contractFee(75000L).teamID(1L).build());
			
			players.add(Player.builder().name("Ismail").surname("Jakobs").birthday(LocalDate.of(1999, 8, 17))
			                  .position(EPosition.DEFENCE).contractFee(8000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Elias").surname("Jelert").birthday(LocalDate.of(2003, 6, 12))
			                  .position(EPosition.DEFENCE).contractFee(5500000L).teamID(1L).build());
			
			// Orta saha oyuncuları
			players.add(Player.builder().name("Lucas").surname("Torreira").birthday(LocalDate.of(1996, 2, 11))
			                  .position(EPosition.MIDFIELD).contractFee(15000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Efe").surname("Akman").birthday(LocalDate.of(2006, 3, 20))
			                  .position(EPosition.MIDFIELD).contractFee(500000L).teamID(1L).build());
			
			players.add(Player.builder().name("Gabriel").surname("Sara").birthday(LocalDate.of(1999, 6, 26))
			                  .position(EPosition.MIDFIELD).contractFee(18000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Kerem").surname("Demirbay").birthday(LocalDate.of(1993, 7, 3))
			                  .position(EPosition.MIDFIELD).contractFee(4800000L).teamID(1L).build());
			
			players.add(Player.builder().name("Berkan").surname("Kutlu").birthday(LocalDate.of(1998, 1, 25))
			                  .position(EPosition.MIDFIELD).contractFee(3800000L).teamID(1L).build());
			
			players.add(Player.builder().name("Eyüp").surname("Aydın").birthday(LocalDate.of(2004, 8, 2))
			                  .position(EPosition.MIDFIELD).contractFee(1300000L).teamID(1L).build());
			
			players.add(Player.builder().name("Gökdeniz").surname("Gürpüz").birthday(LocalDate.of(2006, 2, 25))
			                  .position(EPosition.MIDFIELD).contractFee(300000L).teamID(1L).build());
			
			// Forvet oyuncuları
			players.add(Player.builder().name("Barış Alper").surname("Yılmaz").birthday(LocalDate.of(2000, 5, 23))
			                  .position(EPosition.OFFENCE).contractFee(20000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Roland").surname("Sallai").birthday(LocalDate.of(1997, 5, 22))
			                  .position(EPosition.OFFENCE).contractFee(15000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Hakim").surname("Ziyech").birthday(LocalDate.of(1993, 3, 19))
			                  .position(EPosition.OFFENCE).contractFee(9000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Yunus").surname("Akgün").birthday(LocalDate.of(2000, 7, 10))
			                  .position(EPosition.OFFENCE).contractFee(5000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Demir").birthday(LocalDate.of(2003, 6, 2))
			                  .position(EPosition.OFFENCE).contractFee(2700000L).teamID(1L).build());
			
			players.add(Player.builder().name("Dries").surname("Mertens").birthday(LocalDate.of(1987, 5, 6))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(1L).build());
			
			players.add(Player.builder().name("Mauro").surname("Icardi").birthday(LocalDate.of(1993, 2, 19))
			                  .position(EPosition.OFFENCE).contractFee(17000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Victor").surname("Osimhen").birthday(LocalDate.of(1998, 12, 29))
			                  .position(EPosition.OFFENCE).contractFee(100000000L).teamID(1L).build());
			
			players.add(Player.builder().name("Michy").surname("Batshuayi").birthday(LocalDate.of(1993, 10, 2))
			                  .position(EPosition.OFFENCE).contractFee(8500000L).teamID(1L).build());
			
			
			// Kaleciler
			players.add(Player.builder().name("Dominik").surname("Livakovic").birthday(LocalDate.of(1995, 1, 9))
			                  .position(EPosition.GOALKEEPER).contractFee(11000000L).teamID(2L).build());
			
			players.add(Player.builder().name("İrfan Can").surname("Eğribayat").birthday(LocalDate.of(1998, 6, 30))
			                  .position(EPosition.GOALKEEPER).contractFee(1500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Ertuğrul").surname("Çetin").birthday(LocalDate.of(2003, 4, 21))
			                  .position(EPosition.GOALKEEPER).contractFee(550000L).teamID(2L).build());
			
			// Defans oyuncuları
			players.add(Player.builder().name("Çağlar").surname("Söyüncü").birthday(LocalDate.of(1996, 5, 23))
			                  .position(EPosition.DEFENCE).contractFee(10000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Alexander").surname("Djiku").birthday(LocalDate.of(1994, 8, 9))
			                  .position(EPosition.DEFENCE).contractFee(9000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Rodrigo").surname("Becão").birthday(LocalDate.of(1996, 1, 19))
			                  .position(EPosition.DEFENCE).contractFee(8000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Samet").surname("Akaydin").birthday(LocalDate.of(1994, 3, 13))
			                  .position(EPosition.DEFENCE).contractFee(2500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Serdar").surname("Aziz").birthday(LocalDate.of(1990, 10, 23))
			                  .position(EPosition.DEFENCE).contractFee(600000L).teamID(2L).build());
			
			players.add(Player.builder().name("Jayden").surname("Oosterwolde").birthday(LocalDate.of(2001, 4, 26))
			                  .position(EPosition.DEFENCE).contractFee(13000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Levent").surname("Mercan").birthday(LocalDate.of(2000, 12, 10))
			                  .position(EPosition.DEFENCE).contractFee(3000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Bright").surname("Osayi-Samuel").birthday(LocalDate.of(1997, 12, 31))
			                  .position(EPosition.DEFENCE).contractFee(8500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Mert").surname("Müldür").birthday(LocalDate.of(1999, 4, 3))
			                  .position(EPosition.DEFENCE).contractFee(6000000L).teamID(2L).build());
			
			// Orta saha oyuncuları
			players.add(Player.builder().name("Sofyan").surname("Amrabat").birthday(LocalDate.of(1996, 8, 21))
			                  .position(EPosition.MIDFIELD).contractFee(22000000L).teamID(2L).build());
			
			players.add(Player.builder().name("İsmail").surname("Yüksek").birthday(LocalDate.of(1999, 1, 26))
			                  .position(EPosition.MIDFIELD).contractFee(12000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Bartuğ").surname("Elmaz").birthday(LocalDate.of(2003, 2, 19))
			                  .position(EPosition.MIDFIELD).contractFee(1500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Fred").surname("Fred").birthday(LocalDate.of(1993, 3, 5))
			                  .position(EPosition.MIDFIELD).contractFee(17000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Filip").surname("Kostić").birthday(LocalDate.of(1992, 11, 1))
			                  .position(EPosition.MIDFIELD).contractFee(6500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Sebastian").surname("Szymański").birthday(LocalDate.of(1999, 5, 10))
			                  .position(EPosition.MIDFIELD).contractFee(19000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Mert Hakan").surname("Yandaş").birthday(LocalDate.of(1994, 8, 19))
			                  .position(EPosition.MIDFIELD).contractFee(1300000L).teamID(2L).build());
			
			// Kanat oyuncuları
			players.add(Player.builder().name("Allan").surname("Saint-Maximin").birthday(LocalDate.of(1997, 3, 12))
			                  .position(EPosition.OFFENCE).contractFee(18000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Dusan").surname("Tadic").birthday(LocalDate.of(1988, 11, 20))
			                  .position(EPosition.OFFENCE).contractFee(3500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Ryan").surname("Kent").birthday(LocalDate.of(1996, 11, 11))
			                  .position(EPosition.OFFENCE).contractFee(3500000L).teamID(2L).build());
			
			players.add(Player.builder().name("Cengiz").surname("Ünder").birthday(LocalDate.of(1997, 7, 14))
			                  .position(EPosition.OFFENCE).contractFee(14000000L).teamID(2L).build());
			
			players.add(Player.builder().name("İrfan Can").surname("Kahveci").birthday(LocalDate.of(1995, 7, 15))
			                  .position(EPosition.OFFENCE).contractFee(10000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Oğuz").surname("Aydın").birthday(LocalDate.of(2000, 10, 27))
			                  .position(EPosition.OFFENCE).contractFee(4300000L).teamID(2L).build());
			
			players.add(Player.builder().name("Burak").surname("Kapacak").birthday(LocalDate.of(1999, 12, 8))
			                  .position(EPosition.OFFENCE).contractFee(400000L).teamID(2L).build());
			
			// Forvet oyuncuları
			players.add(Player.builder().name("Youssef").surname("En-Nesyri").birthday(LocalDate.of(1997, 6, 1))
			                  .position(EPosition.OFFENCE).contractFee(20000000L).teamID(2L).build());
			
			players.add(Player.builder().name("Edin").surname("Dzeko").birthday(LocalDate.of(1986, 3, 17))
			                  .position(EPosition.OFFENCE).contractFee(2700000L).teamID(2L).build());
			
			players.add(Player.builder().name("Cenk").surname("Tosun").birthday(LocalDate.of(1991, 6, 7))
			                  .position(EPosition.OFFENCE).contractFee(2000000L).teamID(2L).build());
			
			
			// Kaleciler
			players.add(Player.builder().name("Ersin").surname("Destanoğlu").birthday(LocalDate.of(2001, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(2000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Mert").surname("Günok").birthday(LocalDate.of(1989, 3, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(1200000L).teamID(3L).build());
			
			players.add(Player.builder().name("Göktuğ").surname("Baytekin").birthday(LocalDate.of(2004, 11, 20))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(3L).build());
			
			players.add(Player.builder().name("Emir").surname("Yaşar").birthday(LocalDate.of(2006, 1, 16))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(3L).build());
			
			// Defans oyuncuları
			players.add(Player.builder().name("Felix").surname("Uduokhai").birthday(LocalDate.of(1997, 9, 9))
			                  .position(EPosition.DEFENCE).contractFee(7000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Emirhan").surname("Topçu").birthday(LocalDate.of(2000, 10, 11))
			                  .position(EPosition.DEFENCE).contractFee(4300000L).teamID(3L).build());
			
			players.add(Player.builder().name("Tayyip Talha").surname("Sanuç").birthday(LocalDate.of(1999, 12, 17))
			                  .position(EPosition.DEFENCE).contractFee(3000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Gabriel").surname("Paulista").birthday(LocalDate.of(1990, 11, 26))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Necip").surname("Uysal").birthday(LocalDate.of(1991, 1, 24))
			                  .position(EPosition.DEFENCE).contractFee(750000L).teamID(3L).build());
			
			players.add(Player.builder().name("Arthur").surname("Masuaku").birthday(LocalDate.of(1993, 11, 7))
			                  .position(EPosition.DEFENCE).contractFee(4200000L).teamID(3L).build());
			
			players.add(Player.builder().name("Emrecan").surname("Terzi").birthday(LocalDate.of(2004, 1, 5))
			                  .position(EPosition.DEFENCE).contractFee(300000L).teamID(3L).build());
			
			players.add(Player.builder().name("Onur").surname("Bulut").birthday(LocalDate.of(1994, 4, 16))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Jonas").surname("Svensson").birthday(LocalDate.of(1993, 3, 6))
			                  .position(EPosition.DEFENCE).contractFee(1700000L).teamID(3L).build());
			
			players.add(Player.builder().name("Arda Berk").surname("Özüarap").birthday(LocalDate.of(2005, 6, 9))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(3L).build());
			
			// Orta saha oyuncuları
			players.add(Player.builder().name("Moatasem").surname("Al-Musrati").birthday(LocalDate.of(1996, 4, 6))
			                  .position(EPosition.MIDFIELD).contractFee(14000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Jean").surname("Onana").birthday(LocalDate.of(2000, 1, 8))
			                  .position(EPosition.MIDFIELD).contractFee(4000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Gedson").surname("Fernandes").birthday(LocalDate.of(1999, 1, 9))
			                  .position(EPosition.MIDFIELD).contractFee(15000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Alex").surname("Oxlade-Chamberlain").birthday(LocalDate.of(1993, 8, 15))
			                  .position(EPosition.MIDFIELD).contractFee(4200000L).teamID(3L).build());
			
			players.add(Player.builder().name("Salih").surname("Uçan").birthday(LocalDate.of(1994, 1, 6))
			                  .position(EPosition.MIDFIELD).contractFee(4000000L).teamID(3L).build());
			
			players.add(Player.builder().name("João").surname("Mário").birthday(LocalDate.of(1993, 1, 19))
			                  .position(EPosition.MIDFIELD).contractFee(4000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Cher").surname("Ndour").birthday(LocalDate.of(2004, 7, 27))
			                  .position(EPosition.MIDFIELD).contractFee(4000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Fahri").surname("Ay").birthday(LocalDate.of(2005, 1, 1))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(3L).build());
			
			// Forvet oyuncuları
			players.add(Player.builder().name("Ernest").surname("Muci").birthday(LocalDate.of(2001, 3, 19))
			                  .position(EPosition.OFFENCE).contractFee(13000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Bakhtiyor").surname("Zaynutdinov").birthday(LocalDate.of(1998, 4, 2))
			                  .position(EPosition.OFFENCE).contractFee(5000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Semih").surname("Kılıçsoy").birthday(LocalDate.of(2005, 8, 15))
			                  .position(EPosition.OFFENCE).contractFee(12000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Arda").surname("Kılıç").birthday(LocalDate.of(2005, 1, 4))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(3L).build());
			
			players.add(Player.builder().name("Milot").surname("Rashica").birthday(LocalDate.of(1996, 6, 28))
			                  .position(EPosition.OFFENCE).contractFee(7500000L).teamID(3L).build());
			
			players.add(Player.builder().name("Can").surname("Keleş").birthday(LocalDate.of(2001, 9, 2))
			                  .position(EPosition.OFFENCE).contractFee(2000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Rafa").surname("Rafa").birthday(LocalDate.of(1993, 5, 17))
			                  .position(EPosition.OFFENCE).contractFee(14000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Ciro").surname("Immobile").birthday(LocalDate.of(1990, 2, 20))
			                  .position(EPosition.OFFENCE).contractFee(4000000L).teamID(3L).build());
			
			players.add(Player.builder().name("Mustafa").surname("Hekimoğlu").birthday(LocalDate.of(2007, 4, 22))
			                  .position(EPosition.OFFENCE).contractFee(400000L).teamID(3L).build());
			
			players.add(Player.builder().name("Uğurcan").surname("Çakır").birthday(LocalDate.of(1996, 4, 5))
			                  .position(EPosition.GOALKEEPER).contractFee(8000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Onuralp").surname("Çevikkan").birthday(LocalDate.of(2006, 1, 2))
			                  .position(EPosition.GOALKEEPER).contractFee(1500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Taha").surname("Tepe").birthday(LocalDate.of(2001, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(150000L).teamID(4L).build());
			
			players.add(Player.builder().name("Ahmet").surname("Yıldırım").birthday(LocalDate.of(2006, 11, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(4L).build());
			
			players.add(Player.builder().name("Serdar").surname("Saatçı").birthday(LocalDate.of(2003, 2, 14))
			                  .position(EPosition.DEFENCE).contractFee(5000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Stefano").surname("Denswil").birthday(LocalDate.of(1993, 5, 7))
			                  .position(EPosition.DEFENCE).contractFee(2800000L).teamID(4L).build());
			
			players.add(Player.builder().name("Stefan").surname("Savic").birthday(LocalDate.of(1991, 1, 8))
			                  .position(EPosition.DEFENCE).contractFee(2500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Arseniy").surname("Batagov").birthday(LocalDate.of(2002, 3, 5))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Hüseyin").surname("Türkmen").birthday(LocalDate.of(1998, 1, 1))
			                  .position(EPosition.DEFENCE).contractFee(275000L).teamID(4L).build());
			
			players.add(Player.builder().name("Ali Şahin").surname("Yılmaz").birthday(LocalDate.of(2004, 1, 1))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(4L).build());
			
			players.add(Player.builder().name("Eren").surname("Elmalı").birthday(LocalDate.of(2000, 7, 7))
			                  .position(EPosition.DEFENCE).contractFee(4000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Borna").surname("Barisic").birthday(LocalDate.of(1992, 11, 10))
			                  .position(EPosition.DEFENCE).contractFee(3500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Arif").surname("Boşluk").birthday(LocalDate.of(2003, 6, 6))
			                  .position(EPosition.DEFENCE).contractFee(300000L).teamID(4L).build());
			
			players.add(Player.builder().name("Pedro").surname("Malheiro").birthday(LocalDate.of(2001, 1, 21))
			                  .position(EPosition.DEFENCE).contractFee(4000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Serkan").surname("Asan").birthday(LocalDate.of(1999, 4, 28))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(4L).build());
			
			players.add(Player.builder().name("Batista").surname("Mendy").birthday(LocalDate.of(2000, 1, 12))
			                  .position(EPosition.MIDFIELD).contractFee(9500000L).teamID(4L).build());
			
			players.add(Player.builder().name("John").surname("Lundstram").birthday(LocalDate.of(1994, 2, 18))
			                  .position(EPosition.MIDFIELD).contractFee(5000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Okay").surname("Yokuşlu").birthday(LocalDate.of(1994, 3, 9))
			                  .position(EPosition.MIDFIELD).contractFee(3000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Salih").surname("Malkoçoğlu").birthday(LocalDate.of(2005, 2, 23))
			                  .position(EPosition.MIDFIELD).contractFee(100000L).teamID(4L).build());
			
			players.add(Player.builder().name("Umut").surname("Güneş").birthday(LocalDate.of(2000, 3, 16))
			                  .position(EPosition.MIDFIELD).contractFee(3000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Ozan").surname("Tufan").birthday(LocalDate.of(1995, 3, 23))
			                  .position(EPosition.MIDFIELD).contractFee(2800000L).teamID(4L).build());
			
			players.add(Player.builder().name("Enis").surname("Bardhi").birthday(LocalDate.of(1995, 7, 2))
			                  .position(EPosition.OFFENCE).contractFee(6500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Muhammed").surname("Cham").birthday(LocalDate.of(2000, 9, 26))
			                  .position(EPosition.OFFENCE).contractFee(6000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Mislav").surname("Orsic").birthday(LocalDate.of(1992, 12, 29))
			                  .position(EPosition.OFFENCE).contractFee(2500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Anthony").surname("Nwakaeme").birthday(LocalDate.of(1989, 3, 21))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Cihan").surname("Çanak").birthday(LocalDate.of(2005, 1, 24))
			                  .position(EPosition.OFFENCE).contractFee(3500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Edin").surname("Visca").birthday(LocalDate.of(1990, 2, 17))
			                  .position(EPosition.OFFENCE).contractFee(2500000L).teamID(4L).build());
			
			players.add(Player.builder().name("Simon").surname("Banza").birthday(LocalDate.of(1996, 8, 13))
			                  .position(EPosition.OFFENCE).contractFee(18000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Enis").surname("Destan").birthday(LocalDate.of(2002, 6, 15))
			                  .position(EPosition.OFFENCE).contractFee(4800000L).teamID(4L).build());
			
			players.add(Player.builder().name("Denis").surname("Drăguș").birthday(LocalDate.of(1999, 7, 6))
			                  .position(EPosition.OFFENCE).contractFee(4000000L).teamID(4L).build());
			
			players.add(Player.builder().name("Umut").surname("Bozok").birthday(LocalDate.of(1996, 9, 19))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(4L).build());
			
			players.add(Player.builder().name("Poyraz").surname("Yıldırım").birthday(LocalDate.of(2005, 1, 15))
			                  .position(EPosition.OFFENCE).contractFee(400000L).teamID(4L).build());
			
			players.add(Player.builder().name("Muhammed").surname("Şengezer").birthday(LocalDate.of(1997, 1, 5))
			                  .position(EPosition.GOALKEEPER).contractFee(1700000L).teamID(5L).build());
			
			players.add(Player.builder().name("Deniz").surname("Dilmen").birthday(LocalDate.of(2005, 6, 5))
			                  .position(EPosition.GOALKEEPER).contractFee(300000L).teamID(5L).build());
			
			players.add(Player.builder().name("Volkan").surname("Babacan").birthday(LocalDate.of(1988, 8, 11))
			                  .position(EPosition.GOALKEEPER).contractFee(100000L).teamID(5L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Yılmaz").birthday(LocalDate.of(2006, 4, 29))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(5L).build());
			
			players.add(Player.builder().name("Léo").surname("Duarte").birthday(LocalDate.of(1996, 7, 17))
			                  .position(EPosition.DEFENCE).contractFee(3000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Ousseynou").surname("Ba").birthday(LocalDate.of(1995, 11, 11))
			                  .position(EPosition.DEFENCE).contractFee(2600000L).teamID(5L).build());
			
			players.add(Player.builder().name("Jerome").surname("Opoku").birthday(LocalDate.of(1998, 10, 14))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Hamza").surname("Güreler").birthday(LocalDate.of(2006, 4, 10))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(5L).build());
			
			players.add(Player.builder().name("Lucas").surname("Lima").birthday(LocalDate.of(1991, 10, 10))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Emre").surname("Kaplan").birthday(LocalDate.of(2001, 1, 12))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(5L).build());
			
			players.add(Player.builder().name("Eren").surname("Karaağaç").birthday(LocalDate.of(2004, 5, 24))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(5L).build());
			
			players.add(Player.builder().name("Ömer Ali").surname("Şahiner").birthday(LocalDate.of(1992, 1, 2))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(5L).build());
			
			players.add(Player.builder().name("Burak Sefa").surname("Kavraz").birthday(LocalDate.of(2005, 5, 5))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(5L).build());
			
			players.add(Player.builder().name("Berat").surname("Özdemir").birthday(LocalDate.of(1998, 5, 23))
			                  .position(EPosition.MIDFIELD).contractFee(6000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Onur").surname("Ergün").birthday(LocalDate.of(1992, 11, 15))
			                  .position(EPosition.MIDFIELD).contractFee(500000L).teamID(5L).build());
			
			players.add(Player.builder().name("Berkay").surname("Özcan").birthday(LocalDate.of(1998, 2, 15))
			                  .position(EPosition.MIDFIELD).contractFee(4200000L).teamID(5L).build());
			
			players.add(Player.builder().name("Miguel").surname("Crespo").birthday(LocalDate.of(1996, 9, 11))
			                  .position(EPosition.MIDFIELD).contractFee(4000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Olivier").surname("Kemen").birthday(LocalDate.of(1996, 7, 20))
			                  .position(EPosition.MIDFIELD).contractFee(2500000L).teamID(5L).build());
			
			players.add(Player.builder().name("Emre").surname("Karaal").birthday(LocalDate.of(2003, 1, 15))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(5L).build());
			
			players.add(Player.builder().name("Dimitrios").surname("Pelkas").birthday(LocalDate.of(1993, 10, 26))
			                  .position(EPosition.OFFENCE).contractFee(2000000L).teamID(5L).build());
			
			players.add(Player.builder().name("Matchoi").surname("Djaló").birthday(LocalDate.of(2003, 4, 10))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(5L).build());
			
			players.add(Player.builder().name("Ömer").surname("Beyaz").birthday(LocalDate.of(2003, 8, 29))
			                  .position(EPosition.OFFENCE).contractFee(650000L).teamID(5L).build());
			
			players.add(Player.builder().name("Davidson").surname("").birthday(LocalDate.of(1991, 3, 5))
			                  .position(EPosition.OFFENCE).contractFee(850000L).teamID(5L).build());
			
			players.add(Player.builder().name("Serdar").surname("Gürler").birthday(LocalDate.of(1991, 9, 14))
			                  .position(EPosition.OFFENCE).contractFee(800000L).teamID(5L).build());
			
			players.add(Player.builder().name("Deniz").surname("Türüç").birthday(LocalDate.of(1993, 1, 29))
			                  .position(EPosition.OFFENCE).contractFee(1700000L).teamID(5L).build());
			
			players.add(Player.builder().name("Patryk").surname("Szysz").birthday(LocalDate.of(1998, 4, 1))
			                  .position(EPosition.OFFENCE).contractFee(800000L).teamID(5L).build());
			
			players.add(Player.builder().name("Krzysztof").surname("Piatek").birthday(LocalDate.of(1995, 7, 1))
			                  .position(EPosition.OFFENCE).contractFee(6000000L).teamID(5L).build());
			
			players.add(Player.builder().name("João").surname("Figueiredo").birthday(LocalDate.of(1996, 5, 27))
			                  .position(EPosition.OFFENCE).contractFee(2300000L).teamID(5L).build());
			
			players.add(Player.builder().name("Philippe").surname("Keny").birthday(LocalDate.of(1999, 5, 18))
			                  .position(EPosition.OFFENCE).contractFee(1600000L).teamID(5L).build());
			
			players.add(Player.builder().name("Mert").surname("Bayram").birthday(LocalDate.of(2005, 1, 2))
			                  .position(EPosition.GOALKEEPER).contractFee(100000L).teamID(6L).build());
			
			players.add(Player.builder().name("Ertuğrul").surname("Taşkıran").birthday(LocalDate.of(1989, 11, 5))
			                  .position(EPosition.GOALKEEPER).contractFee(75000L).teamID(6L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Karagöz").birthday(LocalDate.of(1999, 10, 5))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(6L).build());
			
			players.add(Player.builder().name("Furkan").surname("Bayır").birthday(LocalDate.of(2000, 2, 9))
			                  .position(EPosition.DEFENCE).contractFee(2300000L).teamID(6L).build());
			
			players.add(Player.builder().name("Fatih").surname("Aksoy").birthday(LocalDate.of(1997, 11, 6))
			                  .position(EPosition.DEFENCE).contractFee(2300000L).teamID(6L).build());
			
			players.add(Player.builder().name("Fidan").surname("Aliti").birthday(LocalDate.of(1993, 10, 3))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(6L).build());
			
			players.add(Player.builder().name("Nuno").surname("Lima").birthday(LocalDate.of(2001, 3, 16))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(6L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Özdemir").birthday(LocalDate.of(2001, 1, 10))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(6L).build());
			
			players.add(Player.builder().name("Jure").surname("Balkovec").birthday(LocalDate.of(1994, 9, 9))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(6L).build());
			
			players.add(Player.builder().name("Florent").surname("Hadergjonaj").birthday(LocalDate.of(1994, 7, 31))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(6L).build());
			
			players.add(Player.builder().name("Richard").surname("").birthday(LocalDate.of(1994, 2, 18))
			                  .position(EPosition.MIDFIELD).contractFee(950000L).teamID(6L).build());
			
			players.add(Player.builder().name("Gaius").surname("Makouta").birthday(LocalDate.of(1997, 7, 25))
			                  .position(EPosition.MIDFIELD).contractFee(3000000L).teamID(6L).build());
			
			players.add(Player.builder().name("Nicolas").surname("Janvier").birthday(LocalDate.of(1998, 8, 11))
			                  .position(EPosition.MIDFIELD).contractFee(500000L).teamID(6L).build());
			
			players.add(Player.builder().name("Buluthan").surname("Bulut").birthday(LocalDate.of(2002, 7, 21))
			                  .position(EPosition.MIDFIELD).contractFee(50000L).teamID(6L).build());
			
			players.add(Player.builder().name("Efecan").surname("Karaca").birthday(LocalDate.of(1989, 11, 16))
			                  .position(EPosition.OFFENCE).contractFee(500000L).teamID(6L).build());
			
			players.add(Player.builder().name("Eren").surname("Altıntaş").birthday(LocalDate.of(2004, 3, 30))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(6L).build());
			
			players.add(Player.builder().name("Emin").surname("Sarıgül").birthday(LocalDate.of(2005, 7, 12))
			                  .position(EPosition.OFFENCE).contractFee(25000L).teamID(6L).build());
			
			players.add(Player.builder().name("Loide").surname("Augusto").birthday(LocalDate.of(2000, 2, 26))
			                  .position(EPosition.OFFENCE).contractFee(900000L).teamID(6L).build());
			
			players.add(Player.builder().name("Bera").surname("Çeken").birthday(LocalDate.of(2005, 8, 18))
			                  .position(EPosition.OFFENCE).contractFee(0L).teamID(6L).build());
			
			players.add(Player.builder().name("Rony").surname("Lopes").birthday(LocalDate.of(1995, 12, 28))
			                  .position(EPosition.OFFENCE).contractFee(2500000L).teamID(6L).build());
			
			players.add(Player.builder().name("Juan").surname("Christian").birthday(LocalDate.of(2001, 3, 10))
			                  .position(EPosition.OFFENCE).contractFee(450000L).teamID(6L).build());
			
			players.add(Player.builder().name("Ui-jo").surname("Hwang").birthday(LocalDate.of(1992, 8, 28))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(6L).build());
			
			players.add(Player.builder().name("Sergio").surname("Córdova").birthday(LocalDate.of(1997, 8, 9))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(6L).build());
			
			players.add(Player.builder().name("Serdar").surname("Dursun").birthday(LocalDate.of(1991, 10, 19))
			                  .position(EPosition.OFFENCE).contractFee(750000L).teamID(6L).build());
			
			players.add(Player.builder().name("Arda").surname("Usluoğlu").birthday(LocalDate.of(2006, 10, 12))
			                  .position(EPosition.OFFENCE).contractFee(125000L).teamID(6L).build());
			
			players.add(Player.builder().name("Kenan").surname("Piric").birthday(LocalDate.of(1994, 7, 7))
			                  .position(EPosition.GOALKEEPER).contractFee(800000L).teamID(7L).build());
			
			players.add(Player.builder().name("Abdullah").surname("Yiğiter").birthday(LocalDate.of(2000, 2, 20))
			                  .position(EPosition.GOALKEEPER).contractFee(200000L).teamID(7L).build());
			
			players.add(Player.builder().name("Kağan").surname("Arıcan").birthday(LocalDate.of(2006, 3, 10))
			                  .position(EPosition.GOALKEEPER).contractFee(100000L).teamID(7L).build());
			
			players.add(Player.builder().name("Doğukan").surname("Özkan").birthday(LocalDate.of(2000, 2, 4))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(7L).build());
			players.add(Player.builder().name("Emrecan").surname("Uzunhan").birthday(LocalDate.of(2001, 2, 26))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(7L).build());
			
			players.add(Player.builder().name("Thalisson").surname("").birthday(LocalDate.of(1998, 5, 7))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(7L).build());
			
			players.add(Player.builder().name("Bahadır").surname("Öztürk").birthday(LocalDate.of(1995, 10, 1))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(7L).build());
			
			players.add(Player.builder().name("Amar").surname("Gerxhaliu").birthday(LocalDate.of(2002, 4, 26))
			                  .position(EPosition.DEFENCE).contractFee(275000L).teamID(7L).build());
			
			players.add(Player.builder().name("Veysel").surname("Sarı").birthday(LocalDate.of(1988, 7, 25))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(7L).build());
			
			players.add(Player.builder().name("Harun").surname("Toprak").birthday(LocalDate.of(2005, 4, 29))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(7L).build());
			
			players.add(Player.builder().name("Güray").surname("Vural").birthday(LocalDate.of(1988, 6, 11))
			                  .position(EPosition.DEFENCE).contractFee(225000L).teamID(7L).build());
			
			players.add(Player.builder().name("Abdurrahim").surname("Dursun").birthday(LocalDate.of(1998, 12, 1))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(7L).build());
			
			players.add(Player.builder().name("Efecan").surname("Gülerce").birthday(LocalDate.of(2002, 3, 7))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(7L).build());
			
			players.add(Player.builder().name("Bünyamin").surname("Balcı").birthday(LocalDate.of(2000, 5, 31))
			                  .position(EPosition.DEFENCE).contractFee(3000000L).teamID(7L).build());
			
			players.add(Player.builder().name("Erdoğan").surname("Yeşilyurt").birthday(LocalDate.of(1993, 11, 6))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(7L).build());
			
			players.add(Player.builder().name("Mert").surname("Yılmaz").birthday(LocalDate.of(1999, 3, 8))
			                  .position(EPosition.DEFENCE).contractFee(75000L).teamID(7L).build());
			players.add(Player.builder().name("Jakub").surname("Kaluzinski").birthday(LocalDate.of(2002, 10, 31))
			                  .position(EPosition.MIDFIELD).contractFee(2100000L).teamID(7L).build());
			
			players.add(Player.builder().name("Oleksandr").surname("Petrusenko").birthday(LocalDate.of(1998, 3, 26))
			                  .position(EPosition.MIDFIELD).contractFee(1000000L).teamID(7L).build());
			
			players.add(Player.builder().name("Soner").surname("Dikmen").birthday(LocalDate.of(1993, 9, 1))
			                  .position(EPosition.MIDFIELD).contractFee(1700000L).teamID(7L).build());
			
			players.add(Player.builder().name("Erdal").surname("Rakip").birthday(LocalDate.of(1996, 2, 13))
			                  .position(EPosition.MIDFIELD).contractFee(850000L).teamID(7L).build());
			
			players.add(Player.builder().name("Mevlüt Han").surname("Ekelik").birthday(LocalDate.of(2004, 12, 16))
			                  .position(EPosition.MIDFIELD).contractFee(100000L).teamID(7L).build());
			
			players.add(Player.builder().name("Burak").surname("İngenç").birthday(LocalDate.of(2006, 4, 14))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(7L).build());
			
			players.add(Player.builder().name("Ramzi").surname("Safuri").birthday(LocalDate.of(1995, 10, 21))
			                  .position(EPosition.OFFENCE).contractFee(1600000L).teamID(7L).build());
			
			players.add(Player.builder().name("Sander").surname("van de Streek").birthday(LocalDate.of(1993, 3, 24))
			                  .position(EPosition.OFFENCE).contractFee(1300000L).teamID(7L).build());
			
			players.add(Player.builder().name("Deni").surname("Milosevic").birthday(LocalDate.of(1995, 3, 9))
			                  .position(EPosition.OFFENCE).contractFee(300000L).teamID(7L).build());
			
			players.add(Player.builder().name("Moussa").surname("Djenepo").birthday(LocalDate.of(1998, 6, 15))
			                  .position(EPosition.OFFENCE).contractFee(3000000L).teamID(7L).build());
			
			players.add(Player.builder().name("Sam").surname("Larsson").birthday(LocalDate.of(1993, 4, 10))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(7L).build());
			
			players.add(Player.builder().name("Braian").surname("Samudio").birthday(LocalDate.of(1995, 12, 23))
			                  .position(EPosition.OFFENCE).contractFee(1000000L).teamID(7L).build());
			
			players.add(Player.builder().name("Andros").surname("Townsend").birthday(LocalDate.of(1991, 7, 16))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(7L).build());
			
			players.add(Player.builder().name("Emre").surname("Uzun").birthday(LocalDate.of(2005, 6, 20))
			                  .position(EPosition.OFFENCE).contractFee(900000L).teamID(7L).build());
			
			players.add(Player.builder().name("Adolfo").surname("Gaich").birthday(LocalDate.of(1999, 2, 26))
			                  .position(EPosition.OFFENCE).contractFee(1700000L).teamID(7L).build());
			
			players.add(Player.builder().name("Jakub").surname("Slowik").birthday(LocalDate.of(1991, 8, 31))
			                  .position(EPosition.GOALKEEPER).contractFee(700000L).teamID(8L).build());
			
			players.add(Player.builder().name("Deniz").surname("Ertaş").birthday(LocalDate.of(2005, 3, 20))
			                  .position(EPosition.GOALKEEPER).contractFee(350000L).teamID(8L).build());
			
			players.add(Player.builder().name("Yavuz").surname("Aygün").birthday(LocalDate.of(1996, 6, 27))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(8L).build());
			
			players.add(Player.builder().name("Egemen").surname("Aydın").birthday(LocalDate.of(2007, 5, 12))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(8L).build());
			players.add(Player.builder().name("Riechedly").surname("Bazoer").birthday(LocalDate.of(1996, 10, 12))
			                  .position(EPosition.DEFENCE).contractFee(4000000L).teamID(8L).build());
			
			players.add(Player.builder().name("Adil").surname("Demirbağ").birthday(LocalDate.of(1997, 12, 10))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(8L).build());
			
			players.add(Player.builder().name("Filip").surname("Damjanovic").birthday(LocalDate.of(1998, 7, 2))
			                  .position(EPosition.DEFENCE).contractFee(1400000L).teamID(8L).build());
			
			players.add(Player.builder().name("Josip").surname("Calusic").birthday(LocalDate.of(1993, 10, 11))
			                  .position(EPosition.DEFENCE).contractFee(1300000L).teamID(8L).build());
			
			players.add(Player.builder().name("Uğurcan").surname("Yazğılı").birthday(LocalDate.of(1999, 4, 9))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(8L).build());
			
			players.add(Player.builder().name("Guilherme").surname("").birthday(LocalDate.of(1990, 4, 1))
			                  .position(EPosition.DEFENCE)  // Sol bek
			                  .contractFee(700000L).teamID(8L).build());
			
			players.add(Player.builder().name("Yasir").surname("Subaşı").birthday(LocalDate.of(1996, 1, 1))
			                  .position(EPosition.DEFENCE)  // Sol bek
			                  .contractFee(100000L).teamID(8L).build());
			
			players.add(Player.builder().name("Nikola").surname("Boranijasevic").birthday(LocalDate.of(1992, 5, 19))
			                  .position(EPosition.DEFENCE)  // Sağ bek
			                  .contractFee(200000L).teamID(8L).build());
			
			players.add(Player.builder().name("Ufuk").surname("Akyol").birthday(LocalDate.of(1997, 8, 27))
			                  .position(EPosition.MIDFIELD)  // Ön libero
			                  .contractFee(800000L).teamID(8L).build());
			
			players.add(Player.builder().name("Oğulcan").surname("Ülgün").birthday(LocalDate.of(1998, 5, 11))
			                  .position(EPosition.MIDFIELD)  // Ön libero
			                  .contractFee(800000L).teamID(8L).build());
			
			players.add(Player.builder().name("Niko").surname("Rak").birthday(LocalDate.of(2003, 7, 26))
			                  .position(EPosition.MIDFIELD)  // Ön libero
			                  .contractFee(750000L).teamID(8L).build());
			
			players.add(Player.builder().name("Marko").surname("Jevtovic").birthday(LocalDate.of(1993, 7, 24))
			                  .position(EPosition.MIDFIELD)  // Ön libero
			                  .contractFee(650000L).teamID(8L).build());
			
			players.add(Player.builder().name("Adem").surname("Eren Kabak").birthday(LocalDate.of(2000, 12, 12))
			                  .position(EPosition.MIDFIELD)  // Ön libero
			                  .contractFee(250000L).teamID(8L).build());
			
			players.add(Player.builder().name("Emmanuel").surname("Boateng").birthday(LocalDate.of(1997, 6, 17))
			                  .position(EPosition.MIDFIELD)  // Merkez orta saha
			                  .contractFee(850000L).teamID(8L).build());
			
			players.add(Player.builder().name("Danijel").surname("Aleksic").birthday(LocalDate.of(1991, 4, 30))
			                  .position(EPosition.MIDFIELD)  // On numara
			                  .contractFee(850000L).teamID(8L).build());
			
			players.add(Player.builder().name("Melih").surname("İbrahimoğlu").birthday(LocalDate.of(2000, 7, 17))
			                  .position(EPosition.MIDFIELD)  // On numara
			                  .contractFee(325000L).teamID(8L).build());
			
			players.add(Player.builder().name("Pedrinho").surname("").birthday(LocalDate.of(1996, 12, 19))
			                  .position(EPosition.OFFENCE)  // Sol kanat
			                  .contractFee(750000L).teamID(8L).build());
			
			players.add(Player.builder().name("Hamidou").surname("Keyta").birthday(LocalDate.of(1994, 12, 17))
			                  .position(EPosition.OFFENCE)  // Sol kanat
			                  .contractFee(700000L).teamID(8L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Erdoğan").birthday(LocalDate.of(1992, 8, 7))
			                  .position(EPosition.OFFENCE)  // Sol kanat
			                  .contractFee(500000L).teamID(8L).build());
			
			players.add(Player.builder().name("Louka").surname("Prip").birthday(LocalDate.of(1997, 6, 29))
			                  .position(EPosition.OFFENCE)  // Sağ kanat
			                  .contractFee(1600000L).teamID(8L).build());
			
			players.add(Player.builder().name("Alassane").surname("Ndao").birthday(LocalDate.of(1996, 12, 20))
			                  .position(EPosition.OFFENCE)  // Sağ kanat
			                  .contractFee(1300000L).teamID(8L).build());
			
			players.add(Player.builder().name("Tunahan").surname("Taşçı").birthday(LocalDate.of(2002, 4, 29))
			                  .position(EPosition.OFFENCE)  // Sağ kanat
			                  .contractFee(300000L).teamID(8L).build());
			
			players.add(Player.builder().name("Umut").surname("Nayir").birthday(LocalDate.of(1993, 6, 28))
			                  .position(EPosition.OFFENCE)  // Santrafor
			                  .contractFee(900000L).teamID(8L).build());
			
			players.add(Player.builder().name("Melih").surname("Bostan").birthday(LocalDate.of(2004, 4, 8))
			                  .position(EPosition.OFFENCE)  // Santrafor
			                  .contractFee(600000L).teamID(8L).build());
			
			players.add(Player.builder().name("Blaz").surname("Kramer").birthday(LocalDate.of(1996, 6, 1)) // 1 Haziran
			                  // 1996
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(500000L) // 500 bin €
			                  .teamID(8L) // Konyaspor'un takım ID'si
			                  .build());
			
			players.add(Player.builder().name("Djordje").surname("Nikolic")
			                  .birthday(LocalDate.of(1997, 4, 13)) // 13 Nisan 1997
			                  .position(EPosition.GOALKEEPER) // Kaleci
			                  .contractFee(250000L) // 250 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Ali").surname("Şaşal Vural")
			                  .birthday(LocalDate.of(1990, 7, 10)) // 10 Temmuz 1990
			                  .position(EPosition.GOALKEEPER) // Kaleci
			                  .contractFee(250000L) // 250 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Hüseyin").surname("Arslan")
			                  .birthday(LocalDate.of(1999, 10, 18)) // 18 Ekim 1999
			                  .position(EPosition.GOALKEEPER) // Kaleci
			                  .contractFee(75000L) // 75 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Serkan Kaan").surname("Sarman")
			                  .birthday(LocalDate.of(2006, 6, 24)) // 24 Haziran 2006
			                  .position(EPosition.GOALKEEPER) // Kaleci
			                  .contractFee(0L) // -
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Noah").surname("Sonko Sundberg")
			                  .birthday(LocalDate.of(1996, 6, 6)) // 6 Haziran 1996
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(1500000L) // 1.50 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Uros").surname("Radakovic")
			                  .birthday(LocalDate.of(1994, 3, 31)) // 31 Mart 1994
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(800000L) // 800 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Achilleas").surname("Poungouras")
			                  .birthday(LocalDate.of(1995, 12, 13)) // 13 Aralık 1995
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(800000L) // 800 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Samba").surname("Camara")
			                  .birthday(LocalDate.of(1992, 11, 14)) // 14 Kasım 1992
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(400000L) // 400 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Emirhan").surname("Başyiğit")
			                  .birthday(LocalDate.of(2005, 4, 25)) // 25 Nisan 2005
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(150000L) // 150 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Mehmet").surname("Albayrak")
			                  .birthday(LocalDate.of(2004, 1, 5)) // 5 Ocak 2004
			                  .position(EPosition.DEFENCE) // Stoper
			                  .contractFee(75000L) // 75 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Uğur").surname("Çiftçi")
			                  .birthday(LocalDate.of(1992, 5, 4)) // 4 Mayıs 1992
			                  .position(EPosition.DEFENCE) // Sol Bek
			                  .contractFee(1300000L) // 1.30 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Ziya").surname("Erdal").birthday(LocalDate.of(1988, 1, 5)) // 5 Ocak 1988
			                  .position(EPosition.DEFENCE) // Sol Bek
			                  .contractFee(50000L) // 50 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Murat").surname("Paluli")
			                  .birthday(LocalDate.of(1994, 8, 9)) // 9 Ağustos 1994
			                  .position(EPosition.DEFENCE) // Sağ Bek
			                  .contractFee(800000L) // 800 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Alaaddin").surname("Okumuş")
			                  .birthday(LocalDate.of(1995, 8, 23)) // 23 Ağustos 1995
			                  .position(EPosition.DEFENCE) // Sağ Bek
			                  .contractFee(300000L) // 300 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Jan").surname("Bieganski")
			                  .birthday(LocalDate.of(2002, 12, 4)) // 4 Aralık 2002
			                  .position(EPosition.MIDFIELD) // Ön Libero
			                  .contractFee(350000L) // 350 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Özkan").surname("Yiğiter")
			                  .birthday(LocalDate.of(2000, 1, 7)) // 7 Ocak 2000
			                  .position(EPosition.MIDFIELD) // Ön Libero
			                  .contractFee(200000L) // 200 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Erdem").surname("Güleç")
			                  .birthday(LocalDate.of(2007, 3, 6)) // 6 Mart 2007
			                  .position(EPosition.MIDFIELD) // Ön Libero
			                  .contractFee(0L) // -
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Samuel").surname("Moutoussamy")
			                  .birthday(LocalDate.of(1996, 8, 12)) // 12 Ağustos 1996
			                  .position(EPosition.MIDFIELD) // Merkez Orta Saha
			                  .contractFee(3000000L) // 3.00 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Charilaos").surname("Charisis")
			                  .birthday(LocalDate.of(1995, 1, 12)) // 12 Ocak 1995
			                  .position(EPosition.MIDFIELD) // Merkez Orta Saha
			                  .contractFee(1000000L) // 1.00 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Azizbek").surname("Turgunboev")
			                  .birthday(LocalDate.of(1994, 10, 1)) // 1 Ekim 1994
			                  .position(EPosition.MIDFIELD) // Merkez Orta Saha
			                  .contractFee(1000000L) // 1.00 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Eymen").surname("Yurdcu")
			                  .birthday(LocalDate.of(2009, 7, 20)) // 20 Temmuz 2009
			                  .position(EPosition.MIDFIELD) // Merkez Orta Saha
			                  .contractFee(0L) // -
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Talha").surname("Şeker").birthday(LocalDate.of(2006, 4, 10)) // 10 Nisan
			                  // 2006
			                  .position(EPosition.MIDFIELD) // Merkez Orta Saha
			                  .contractFee(0L) // -
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Alex").surname("Pritchard")
			                  .birthday(LocalDate.of(1993, 5, 3)) // 3 Mayıs 1993
			                  .position(EPosition.MIDFIELD) // On Numara
			                  .contractFee(1500000L) // 1.50 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Queensy").surname("Menig")
			                  .birthday(LocalDate.of(1995, 8, 19)) // 19 Ağustos 1995
			                  .position(EPosition.DEFENCE) // Sol Kanat
			                  .contractFee(1700000L) // 1.70 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Garry").surname("Rodrigues")
			                  .birthday(LocalDate.of(1990, 11, 27)) // 27 Kasım 1990
			                  .position(EPosition.DEFENCE) // Sol Kanat
			                  .contractFee(1100000L) // 1.10 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Sinan").surname("Kaya").birthday(LocalDate.of(2006, 7, 25)) // 25 Temmuz
			                  // 2006
			                  .position(EPosition.DEFENCE) // Sol Kanat
			                  .contractFee(0L) // -
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Emre").surname("Gökay")
			                  .birthday(LocalDate.of(2006, 2, 18)) // 18 Şubat 2006
			                  .position(EPosition.DEFENCE) // Sağ Kanat
			                  .contractFee(1500000L) // 1.50 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Emrah").surname("Başsan")
			                  .birthday(LocalDate.of(1992, 4, 17)) // 17 Nisan 1992
			                  .position(EPosition.DEFENCE) // Sağ Kanat
			                  .contractFee(700000L) // 700 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Rey").surname("Manaj")
			                  .birthday(LocalDate.of(1997, 2, 24)) // 24 Şubat 1997
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(5000000L) // 5.00 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Keita").surname("Baldé")
			                  .birthday(LocalDate.of(1995, 3, 8)) // 8 Mart 1995
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(1200000L) // 1.20 mil. €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Bekir Turaç").surname("Böke")
			                  .birthday(LocalDate.of(1999, 6, 21)) // 21 Haziran 1999
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(175000L) // 175 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Fodé").surname("Koita")
			                  .birthday(LocalDate.of(1990, 10, 21)) // 21 Ekim 1990
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(150000L) // 150 bin €
			                  .teamID(9L).build());
			
			players.add(Player.builder().name("Ivo").surname("Grbic").birthday(LocalDate.of(1996, 1, 18))
			                  .position(EPosition.GOALKEEPER).contractFee(3500000L).teamID(10L).build());
			
			players.add(Player.builder().name("Tarık").surname("Çetin").birthday(LocalDate.of(1997, 1, 8))
			                  .position(EPosition.GOALKEEPER).contractFee(325000L).teamID(10L).build());
			
			players.add(Player.builder().name("Canberk").surname("Yurdakul").birthday(LocalDate.of(2001, 4, 30))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(10L).build());
			
			players.add(Player.builder().name("Attila").surname("Mocsi").birthday(LocalDate.of(2000, 5, 29))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(10L).build());
			
			players.add(Player.builder().name("Khusniddin").surname("Alikulov").birthday(LocalDate.of(1999, 4, 4))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(10L).build());
			
			players.add(Player.builder().name("Ayberk").surname("Karapo").birthday(LocalDate.of(2004, 7, 21))
			                  .position(EPosition.DEFENCE).contractFee(1100000L).teamID(10L).build());
			
			players.add(Player.builder().name("Anıl").surname("Yaşar").birthday(LocalDate.of(2002, 7, 1))
			                  .position(EPosition.DEFENCE).contractFee(325000L).teamID(10L).build());
			
			players.add(Player.builder().name("Habil").surname("Özbakır").birthday(LocalDate.of(2005, 2, 6))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(10L).build());
			
			players.add(Player.builder().name("Casper").surname("Højer").birthday(LocalDate.of(1994, 11, 20))
			                  .position(EPosition.DEFENCE).contractFee(1700000L).teamID(10L).build());
			
			players.add(Player.builder().name("İbrahim").surname("Pehlivan").birthday(LocalDate.of(1993, 8, 21))
			                  .position(EPosition.DEFENCE).contractFee(375000L).teamID(10L).build());
			
			players.add(Player.builder().name("Taha").surname("Şahin").birthday(LocalDate.of(2000, 10, 22))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(10L).build());
			
			players.add(Player.builder().name("Eray").surname("Korkmaz").birthday(LocalDate.of(2003, 6, 8))
			                  .position(EPosition.DEFENCE).contractFee(350000L).teamID(10L).build());
			
			players.add(Player.builder().name("Amir").surname("Hadziahmetovic").birthday(LocalDate.of(1997, 3, 8))
			                  .position(EPosition.MIDFIELD).contractFee(6500000L).teamID(10L).build());
			
			players.add(Player.builder().name("Giannis").surname("Papanikolaou").birthday(LocalDate.of(1998, 11, 18))
			                  .position(EPosition.MIDFIELD).contractFee(2000000L).teamID(10L).build());
			
			players.add(Player.builder().name("Efe").surname("Geçim").birthday(LocalDate.of(2004, 10, 23))
			                  .position(EPosition.MIDFIELD).contractFee(25000L).teamID(10L).build());
			
			players.add(Player.builder().name("Ibrahim").surname("Olawoyin").birthday(LocalDate.of(1997, 12, 1))
			                  .position(EPosition.MIDFIELD).contractFee(1800000L).teamID(10L).build());
			
			players.add(Player.builder().name("Mithat").surname("Pala").birthday(LocalDate.of(2000, 8, 15))
			                  .position(EPosition.MIDFIELD).contractFee(1000000L).teamID(10L).build());
			
			players.add(Player.builder().name("Muhamed").surname("Buljubasic").birthday(LocalDate.of(2004, 7, 4))
			                  .position(EPosition.MIDFIELD).contractFee(800000L).teamID(10L).build());
			
			players.add(Player.builder().name("Ali Kemal").surname("Aslankaya").birthday(LocalDate.of(2007, 1, 3))
			                  .position(EPosition.MIDFIELD).contractFee(50000L).teamID(10L).build());
			
			players.add(Player.builder().name("Dal").surname("Varesanovic").birthday(LocalDate.of(2001, 5, 23))
			                  .position(EPosition.MIDFIELD).contractFee(2400000L).teamID(10L).build());
			
			players.add(Player.builder().name("Altin").surname("Zeqiri").birthday(LocalDate.of(2000, 7, 18))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(10L).build());
			
			players.add(Player.builder().name("Benhur").surname("Keser").birthday(LocalDate.of(1996, 10, 29))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(10L).build());
			
			players.add(Player.builder().name("Emrecan").surname("Bulut").birthday(LocalDate.of(2002, 11, 26))
			                  .position(EPosition.DEFENCE).contractFee(275000L).teamID(10L).build());
			
			players.add(Player.builder().name("Doğanay").surname("Avcı").birthday(LocalDate.of(2006, 2, 7))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(10L).build());
			
			players.add(Player.builder().name("Rachid").surname("Ghezzal").birthday(LocalDate.of(1992, 5, 9))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(10L).build());
			
			players.add(Player.builder().name("David").surname("Akintola").birthday(LocalDate.of(1996, 1, 13))
			                  .position(EPosition.DEFENCE).contractFee(1600000L).teamID(10L).build());
			
			players.add(Player.builder().name("Martin").surname("Minchev").birthday(LocalDate.of(2001, 4, 22))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(10L).build());
			
			players.add(Player.builder().name("Ali").surname("Sowe").birthday(LocalDate.of(1994, 6, 14))
			                  .position(EPosition.OFFENCE).contractFee(1700000L).teamID(10L).build());
			
			players.add(Player.builder().name("Vaclav").surname("Jurecka").birthday(LocalDate.of(1994, 6, 26))
			                  .position(EPosition.OFFENCE).contractFee(1700000L).teamID(10L).build());
			
			players.add(Player.builder().name("Sokratis").surname("Dioudis").birthday(LocalDate.of(1993, 2, 3))
			                  .position(EPosition.GOALKEEPER).contractFee(450000L).teamID(11L).build());
			
			players.add(Player.builder().name("Burak").surname("Bozan").birthday(LocalDate.of(2000, 8, 23))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(11L).build());
			
			players.add(Player.builder().name("Halil").surname("Bağcı").birthday(LocalDate.of(2003, 4, 4))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(11L).build());
			
			players.add(Player.builder().name("Bruno").surname("Viana").birthday(LocalDate.of(1995, 2, 5))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(11L).build());
			
			players.add(Player.builder().name("Arda").surname("Kızıldağ").birthday(LocalDate.of(1998, 10, 15))
			                  .position(EPosition.DEFENCE).contractFee(750000L).teamID(11L).build());
			
			players.add(Player.builder().name("Ertuğrul").surname("Ersoy").birthday(LocalDate.of(1997, 2, 13))
			                  .position(EPosition.DEFENCE).contractFee(650000L).teamID(11L).build());
			
			players.add(Player.builder().name("Enric").surname("Saborit").birthday(LocalDate.of(1992, 4, 27))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(11L).build());
			
			players.add(Player.builder().name("Godfrey").surname("Stephen").birthday(LocalDate.of(2000, 8, 22))
			                  .position(EPosition.DEFENCE).contractFee(400000L).teamID(11L).build());
			
			players.add(Player.builder().name("Emre").surname("Taşdemir").birthday(LocalDate.of(1995, 8, 8))
			                  .position(EPosition.DEFENCE).contractFee(125000L).teamID(11L).build());
			
			players.add(Player.builder().name("Salem").surname("M'Bakata").birthday(LocalDate.of(1998, 4, 19))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(11L).build());
			
			players.add(Player.builder().name("Ömürcan").surname("Artan").birthday(LocalDate.of(1999, 7, 27))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(11L).build());
			
			players.add(Player.builder().name("Ogün").surname("Özçiçek").birthday(LocalDate.of(1999, 1, 24))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(11L).build());
			
			players.add(Player.builder().name("Cyril").surname("Mandouki").birthday(LocalDate.of(1991, 8, 21))
			                  .position(EPosition.DEFENCE).contractFee(350000L).teamID(11L).build());
			
			players.add(Player.builder().name("Bahadır").surname("Gölgeli").birthday(LocalDate.of(2003, 7, 1))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(11L).build());
			
			players.add(Player.builder().name("Kacper").surname("Kozlowski").birthday(LocalDate.of(2003, 10, 16))
			                  .position(EPosition.MIDFIELD).contractFee(5000000L).teamID(11L).build());
			
			players.add(Player.builder().name("Furkan").surname("Soyalp").birthday(LocalDate.of(1995, 6, 12))
			                  .position(EPosition.MIDFIELD).contractFee(800000L).teamID(11L).build());
			
			players.add(Player.builder().name("Badou").surname("Ndiaye").birthday(LocalDate.of(1990, 10, 27))
			                  .position(EPosition.MIDFIELD).contractFee(700000L).teamID(11L).build());
			
			players.add(Player.builder().name("Quentin").surname("Daubin").birthday(LocalDate.of(1995, 7, 3))
			                  .position(EPosition.MIDFIELD).contractFee(600000L).teamID(11L).build());
			
			players.add(Player.builder().name("Eren").surname("Cakir").birthday(LocalDate.of(2004, 2, 18))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(11L).build());
			
			players.add(Player.builder().name("Alexandru").surname("Maxim").birthday(LocalDate.of(1990, 7, 8))
			                  .position(EPosition.MIDFIELD).contractFee(1000000L).teamID(11L).build());
			
			players.add(Player.builder().name("Burak Enes").surname("Yıkıcı").birthday(LocalDate.of(2004, 3, 29))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(11L).build());
			
			players.add(Player.builder().name("Christopher").surname("Lungoyi").birthday(LocalDate.of(2000, 7, 4))
			                  .position(EPosition.MIDFIELD).contractFee(600000L).teamID(11L).build());
			
			players.add(Player.builder().name("Mirza").surname("Cihan").birthday(LocalDate.of(2000, 10, 26))
			                  .position(EPosition.MIDFIELD).contractFee(200000L).teamID(11L).build());
			
			players.add(Player.builder().name("Mehmet").surname("Kuzucu").birthday(LocalDate.of(2003, 9, 20))
			                  .position(EPosition.OFFENCE).contractFee(50000L).teamID(11L).build());
			
			players.add(Player.builder().name("Mustafa").surname("Eskihellaç").birthday(LocalDate.of(1997, 5, 5))
			                  .position(EPosition.OFFENCE).contractFee(1400000L).teamID(11L).build());
			
			players.add(Player.builder().name("Deian").surname("Sorescu").birthday(LocalDate.of(1997, 8, 29))
			                  .position(EPosition.OFFENCE).contractFee(1000000L).teamID(11L).build());
			
			players.add(Player.builder().name("Eren").surname("Erdoğan").birthday(LocalDate.of(2001, 5, 22))
			                  .position(EPosition.OFFENCE).contractFee(150000L).teamID(11L).build());
			
			players.add(Player.builder().name("Ali Mevran").surname("Ablak").birthday(LocalDate.of(2003, 7, 27))
			                  .position(EPosition.OFFENCE).contractFee(0L).teamID(11L).build());
			
			players.add(Player.builder().name("David").surname("Okereke").birthday(LocalDate.of(1997, 8, 29))
			                  .position(EPosition.OFFENCE).contractFee(2400000L).teamID(11L).build());
			
			players.add(Player.builder().name("Kenan").surname("Kodro").birthday(LocalDate.of(1993, 8, 19))
			                  .position(EPosition.OFFENCE).contractFee(1200000L).teamID(11L).build());
			
			players.add(Player.builder().name("Halil").surname("Dervişoğlu").birthday(LocalDate.of(1999, 12, 8))
			                  .position(EPosition.OFFENCE).contractFee(1000000L).teamID(11L).build());
			
			players.add(Player.builder().name("İlker").surname("Karakaş").birthday(LocalDate.of(1999, 1, 11))
			                  .position(EPosition.OFFENCE).contractFee(250000L).teamID(11L).build());
			
			players.add(Player.builder().name("Murat").surname("Eser").birthday(LocalDate.of(2005, 6, 4))
			                  .position(EPosition.GOALKEEPER).contractFee(75000L).teamID(12L).build());
			
			players.add(Player.builder().name("Vedat").surname("Karakuş").birthday(LocalDate.of(1998, 2, 28))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(12L).build());
			
			players.add(Player.builder().name("Deniz").surname("Dönmezer").birthday(LocalDate.of(2008, 9, 21))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(12L).build());
			
			players.add(Player.builder().name("Andreaw").surname("Gravillon").birthday(LocalDate.of(1998, 2, 8))
			                  .position(EPosition.DEFENCE).contractFee(3700000L).teamID(12L).build());
			
			players.add(Player.builder().name("Semih").surname("Güler").birthday(LocalDate.of(1994, 11, 30))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(12L).build());
			
			players.add(Player.builder().name("Jovan").surname("Manev").birthday(LocalDate.of(2001, 1, 25))
			                  .position(EPosition.DEFENCE).contractFee(600000L).teamID(12L).build());
			
			players.add(Player.builder().name("Tolga").surname("Kalender").birthday(LocalDate.of(2001, 8, 17))
			                  .position(EPosition.DEFENCE).contractFee(150000L).teamID(12L).build());
			
			players.add(Player.builder().name("Abdulsamet").surname("Burak").birthday(LocalDate.of(1996, 5, 13))
			                  .position(EPosition.DEFENCE).contractFee(75000L).teamID(12L).build());
			
			players.add(Player.builder().name("Burhan").surname("Ersoy").birthday(LocalDate.of(2003, 6, 13))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(12L).build());
			
			players.add(Player.builder().name("Kadir").surname("Karayiğit").birthday(LocalDate.of(2005, 10, 31))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(12L).build());
			
			players.add(Player.builder().name("Maestro").surname("").birthday(LocalDate.of(2003, 8, 4))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(12L).build());
			
			players.add(Player.builder().name("Tayfun").surname("Aydoğan").birthday(LocalDate.of(1996, 5, 29))
			                  .position(EPosition.MIDFIELD).contractFee(250000L).teamID(12L).build());
			
			players.add(Player.builder().name("Aksel").surname("Aktaş").birthday(LocalDate.of(1999, 7, 15))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(12L).build());
			
			players.add(Player.builder().name("İzzet").surname("Çelik").birthday(LocalDate.of(2004, 6, 20))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(12L).build());
			
			players.add(Player.builder().name("Bünyamin").surname("Balat").birthday(LocalDate.of(1997, 1, 5))
			                  .position(EPosition.MIDFIELD).contractFee(50000L).teamID(12L).build());
			
			players.add(Player.builder().name("Florent").surname("Shehu").birthday(LocalDate.of(2002, 5, 17))
			                  .position(EPosition.MIDFIELD).contractFee(50000L).teamID(12L).build());
			
			players.add(Player.builder().name("Nabil").surname("Alioui").birthday(LocalDate.of(1999, 2, 18))
			                  .position(EPosition.OFFENCE).contractFee(3200000L).teamID(12L).build());
			
			players.add(Player.builder().name("Arda").surname("Kurtulan").birthday(LocalDate.of(2002, 11, 19))
			                  .position(EPosition.OFFENCE).contractFee(200000L).teamID(12L).build());
			
			players.add(Player.builder().name("Motez").surname("Nourani").birthday(LocalDate.of(2002, 1, 11))
			                  .position(EPosition.OFFENCE).contractFee(175000L).teamID(12L).build());
			
			players.add(Player.builder().name("Ali Yavuz").surname("Kol").birthday(LocalDate.of(2001, 1, 29))
			                  .position(EPosition.OFFENCE).contractFee(175000L).teamID(12L).build());
			
			players.add(Player.builder().name("Salih").surname("Kavrazlı").birthday(LocalDate.of(2002, 3, 16))
			                  .position(EPosition.OFFENCE).contractFee(150000L).teamID(12L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Sarı").birthday(LocalDate.of(1998, 11, 20))
			                  .position(EPosition.OFFENCE).contractFee(5500000L).teamID(12L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Barası").birthday(LocalDate.of(2003, 3, 31))
			                  .position(EPosition.OFFENCE).contractFee(950000L).teamID(12L).build());
			
			players.add(Player.builder().name("Abat").surname("Aymbetov").birthday(LocalDate.of(1995, 8, 7))
			                  .position(EPosition.OFFENCE).contractFee(700000L).teamID(12L).build());
			
			players.add(Player.builder().name("Ozan").surname("Demirbağ").birthday(LocalDate.of(2008, 2, 12))
			                  .position(EPosition.OFFENCE).contractFee(100000L).teamID(12L).build());
			
			players.add(Player.builder().name("Breyton").surname("Fougeu").birthday(LocalDate.of(2004, 1, 6))
			                  .position(EPosition.OFFENCE).contractFee(50000L).teamID(12L).build());
			
			players.add(Player.builder().name("Berke").surname("Özer").birthday(LocalDate.of(2000, 5, 25))
			                  .position(EPosition.GOALKEEPER).contractFee(1500000L).teamID(13L).build());
			
			players.add(Player.builder().name("Birkan").surname("Tetik").birthday(LocalDate.of(1995, 10, 19))
			                  .position(EPosition.GOALKEEPER).contractFee(125000L).teamID(13L).build());
			
			players.add(Player.builder().name("Alp").surname("Köseer").birthday(LocalDate.of(2003, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(13L).build());
			
			players.add(Player.builder().name("Rúben").surname("Vezo").birthday(LocalDate.of(1994, 4, 25))
			                  .position(EPosition.DEFENCE).contractFee(1500000L).teamID(13L).build());
			
			players.add(Player.builder().name("Robin").surname("Yalçın").birthday(LocalDate.of(1994, 1, 25))
			                  .position(EPosition.DEFENCE).contractFee(600000L).teamID(13L).build());
			
			players.add(Player.builder().name("Luccas").surname("Claro").birthday(LocalDate.of(1991, 10, 2))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(13L).build());
			
			players.add(Player.builder().name("Berkay").surname("Dogan").birthday(LocalDate.of(2002, 5, 18))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(13L).build());
			
			players.add(Player.builder().name("Mustafa Eren").surname("Damar").birthday(LocalDate.of(2004, 3, 7))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(13L).build());
			
			players.add(Player.builder().name("Umut").surname("Meraş").birthday(LocalDate.of(1995, 12, 20))
			                  .position(EPosition.DEFENCE).contractFee(375000L).teamID(13L).build());
			
			players.add(Player.builder().name("Caner").surname("Erkin").birthday(LocalDate.of(1988, 10, 4))
			                  .position(EPosition.DEFENCE).contractFee(225000L).teamID(13L).build());
			
			players.add(Player.builder().name("Léo").surname("Dubois").birthday(LocalDate.of(1994, 9, 14))
			                  .position(EPosition.DEFENCE).contractFee(3500000L).teamID(13L).build());
			
			players.add(Player.builder().name("Tayfur").surname("Bingöl").birthday(LocalDate.of(1993, 1, 11))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(13L).build());
			
			players.add(Player.builder().name("Erdem").surname("Gökçe").birthday(LocalDate.of(2003, 8, 20))
			                  .position(EPosition.DEFENCE).contractFee(100000L).teamID(13L).build());
			
			players.add(Player.builder().name("Abdülkadir").surname("Aydın").birthday(LocalDate.of(2002, 5, 24))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(13L).build());
			
			players.add(Player.builder().name("Taşkın").surname("İlter").birthday(LocalDate.of(1994, 7, 5))
			                  .position(EPosition.MIDFIELD).contractFee(300000L).teamID(13L).build());
			
			players.add(Player.builder().name("Jonjo").surname("Shelvey").birthday(LocalDate.of(1992, 2, 27))
			                  .position(EPosition.MIDFIELD).contractFee(2600000L).teamID(13L).build());
			
			players.add(Player.builder().name("Dorukhan").surname("Toköz").birthday(LocalDate.of(1996, 5, 21))
			                  .position(EPosition.MIDFIELD).contractFee(2100000L).teamID(13L).build());
			
			players.add(Player.builder().name("Fredrik").surname("Midtsjø").birthday(LocalDate.of(1993, 8, 11))
			                  .position(EPosition.MIDFIELD).contractFee(2000000L).teamID(13L).build());
			
			players.add(Player.builder().name("Melih").surname("Kabasakal").birthday(LocalDate.of(1996, 2, 18))
			                  .position(EPosition.MIDFIELD).contractFee(400000L).teamID(13L).build());
			
			players.add(Player.builder().name("Emre").surname("Akbaba").birthday(LocalDate.of(1992, 10, 4))
			                  .position(EPosition.MIDFIELD).contractFee(1300000L).teamID(13L).build());
			
			players.add(Player.builder().name("Recep").surname("Niyaz").birthday(LocalDate.of(1995, 8, 2))
			                  .position(EPosition.MIDFIELD).contractFee(750000L).teamID(13L).build());
			
			players.add(Player.builder().name("Samu").surname("Saiz").birthday(LocalDate.of(1991, 1, 22))
			                  .position(EPosition.MIDFIELD).contractFee(400000L).teamID(13L).build());
			
			players.add(Player.builder().name("Mame").surname("Thiam").birthday(LocalDate.of(1992, 10, 9))
			                  .position(EPosition.OFFENCE).contractFee(3000000L).teamID(13L).build());
			
			players.add(Player.builder().name("Prince").surname("Ampem").birthday(LocalDate.of(1998, 4, 13))
			                  .position(EPosition.OFFENCE).contractFee(1900000L).teamID(13L).build());
			
			players.add(Player.builder().name("Anastasios").surname("Chatzigiovanis")
			                  .birthday(LocalDate.of(1997, 5, 31)).position(EPosition.OFFENCE).contractFee(1800000L)
			                  .teamID(13L).build());
			
			players.add(Player.builder().name("Emre").surname("Mor").birthday(LocalDate.of(1997, 7, 24))
			                  .position(EPosition.OFFENCE).contractFee(2000000L).teamID(13L).build());
			
			players.add(Player.builder().name("Ahmed").surname("Kutucu").birthday(LocalDate.of(2000, 3, 1))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(13L).build());
			
			players.add(Player.builder().name("Halil").surname("Akbunar").birthday(LocalDate.of(1993, 11, 9))
			                  .position(EPosition.OFFENCE).contractFee(1400000L).teamID(13L).build());
			
			players.add(Player.builder().name("Sinan").surname("Gümüş").birthday(LocalDate.of(1994, 1, 15))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(13L).build());
			
			players.add(Player.builder().name("Gianni").surname("Bruno").birthday(LocalDate.of(1991, 8, 19))
			                  .position(EPosition.OFFENCE).contractFee(800000L).teamID(13L).build());
			
			players.add(Player.builder().name("Andreas").surname("Gianniotis").birthday(LocalDate.of(1992, 12, 18))
			                  .position(EPosition.GOALKEEPER).contractFee(500000L).teamID(14L).build());
			
			players.add(Player.builder().name("Ali Emre").surname("Yanar").birthday(LocalDate.of(1998, 5, 15))
			                  .position(EPosition.GOALKEEPER).contractFee(300000L).teamID(14L).build());
			
			players.add(Player.builder().name("Ege").surname("Albayrak").birthday(LocalDate.of(2007, 8, 20))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(14L).build());
			
			players.add(Player.builder().name("Şant").surname("Kazancı").birthday(LocalDate.of(2008, 12, 18))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(14L).build());
			
			players.add(Player.builder().name("Yasin").surname("Özcan").birthday(LocalDate.of(2006, 4, 20))
			                  .position(EPosition.DEFENCE).contractFee(4500000L).teamID(14L).build());
			
			players.add(Player.builder().name("Kenneth").surname("Omeruo").birthday(LocalDate.of(1993, 10, 17))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(14L).build());
			
			players.add(Player.builder().name("Nicholas").surname("Opoku").birthday(LocalDate.of(1997, 8, 11))
			                  .position(EPosition.DEFENCE).contractFee(900000L).teamID(14L).build());
			
			players.add(Player.builder().name("Taylan").surname("Aydın").birthday(LocalDate.of(2006, 2, 10))
			                  .position(EPosition.DEFENCE).contractFee(250000L).teamID(14L).build());
			
			players.add(Player.builder().name("Sadık").surname("Çiftpınar").birthday(LocalDate.of(1993, 1, 1))
			                  .position(EPosition.DEFENCE).contractFee(225000L).teamID(14L).build());
			
			players.add(Player.builder().name("Yunus Emre").surname("Atakaya").birthday(LocalDate.of(2004, 4, 27))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(14L).build());
			
			players.add(Player.builder().name("Kévin").surname("Rodrigues").birthday(LocalDate.of(1994, 3, 5))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(14L).build());
			
			players.add(Player.builder().name("Adnan").surname("Aktaş").birthday(LocalDate.of(2006, 11, 10))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(14L).build());
			
			players.add(Player.builder().name("Jhon").surname("Espinoza").birthday(LocalDate.of(1999, 2, 24))
			                  .position(EPosition.DEFENCE).contractFee(800000L).teamID(14L).build());
			
			players.add(Player.builder().name("Cláudio").surname("Winck").birthday(LocalDate.of(1994, 4, 15))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(14L).build());
			
			players.add(Player.builder().name("Gökhan").surname("Gül").birthday(LocalDate.of(1998, 7, 17))
			                  .position(EPosition.DEFENCE).contractFee(2000000L).teamID(14L).build());
			
			players.add(Player.builder().name("Loret").surname("Sadiku").birthday(LocalDate.of(1991, 7, 28))
			                  .position(EPosition.DEFENCE).contractFee(375000L).teamID(14L).build());
			
			players.add(Player.builder().name("Driess").surname("Saddiki").birthday(LocalDate.of(1996, 8, 9))
			                  .position(EPosition.DEFENCE).contractFee(325000L).teamID(14L).build());
			
			players.add(Player.builder().name("Aytaç").surname("Kara").birthday(LocalDate.of(1993, 3, 23))
			                  .position(EPosition.MIDFIELD).contractFee(1200000L).teamID(14L).build());
			
			players.add(Player.builder().name("Cafú").surname("Cafú").birthday(LocalDate.of(1993, 2, 26))
			                  .position(EPosition.MIDFIELD).contractFee(400000L).teamID(14L).build());
			
			players.add(Player.builder().name("Yaman").surname("Suakar").birthday(LocalDate.of(2009, 2, 25))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(14L).build());
			
			players.add(Player.builder().name("Antonín").surname("Barák").birthday(LocalDate.of(1994, 12, 3))
			                  .position(EPosition.MIDFIELD).contractFee(4500000L).teamID(14L).build());
			
			players.add(Player.builder().name("Haris").surname("Hajradinovic").birthday(LocalDate.of(1994, 2, 18))
			                  .position(EPosition.MIDFIELD).contractFee(2700000L).teamID(14L).build());
			
			players.add(Player.builder().name("Josip").surname("Brekalo").birthday(LocalDate.of(1998, 6, 23))
			                  .position(EPosition.OFFENCE).contractFee(3500000L).teamID(14L).build());
			
			players.add(Player.builder().name("Mortadha").surname("Ben Ouanes").birthday(LocalDate.of(1994, 7, 2))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(14L).build());
			
			players.add(Player.builder().name("Erdem").surname("Çetinkaya").birthday(LocalDate.of(2001, 3, 29))
			                  .position(EPosition.OFFENCE).contractFee(350000L).teamID(14L).build());
			
			players.add(Player.builder().name("Berat").surname("Kalkan").birthday(LocalDate.of(2003, 3, 2))
			                  .position(EPosition.OFFENCE).contractFee(200000L).teamID(14L).build());
			
			players.add(Player.builder().name("Mamadou").surname("Fall").birthday(LocalDate.of(1991, 12, 31))
			                  .position(EPosition.OFFENCE).contractFee(1200000L).teamID(14L).build());
			
			players.add(Player.builder().name("Emirhan").surname("Yiğit").birthday(LocalDate.of(2006, 4, 30))
			                  .position(EPosition.OFFENCE).contractFee(100000L).teamID(14L).build());
			
			players.add(Player.builder().name("Nuno").surname("Da Costa").birthday(LocalDate.of(1991, 2, 10))
			                  .position(EPosition.OFFENCE).contractFee(800000L).teamID(14L).build());
			
			players.add(Player.builder().name("Sarp").surname("Yavrucu").birthday(LocalDate.of(2005, 3, 17))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(14L).build());
			
			players.add(Player.builder().name("Ali").surname("Demirel").birthday(LocalDate.of(2003, 1, 2))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(14L).build());
			
			players.add(Player.builder().name("Bilal").surname("Bayazıt").birthday(LocalDate.of(1999, 4, 8))
			                  .position(EPosition.GOALKEEPER).contractFee(2800000L).teamID(15L).build());
			
			players.add(Player.builder().name("Onurcan").surname("Piri").birthday(LocalDate.of(1994, 9, 28))
			                  .position(EPosition.GOALKEEPER).contractFee(225000L).teamID(15L).build());
			
			players.add(Player.builder().name("Şamil").surname("Öztürk").birthday(LocalDate.of(2005, 5, 9))
			                  .position(EPosition.GOALKEEPER).contractFee(100000L).teamID(15L).build());
			
			players.add(Player.builder().name("Majid").surname("Hosseini").birthday(LocalDate.of(1996, 6, 20))
			                  .position(EPosition.DEFENCE).contractFee(2200000L).teamID(15L).build());
			
			players.add(Player.builder().name("Arif").surname("Kocaman").birthday(LocalDate.of(2003, 9, 14))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(15L).build());
			
			players.add(Player.builder().name("Julian").surname("Jeanvier").birthday(LocalDate.of(1992, 3, 31))
			                  .position(EPosition.DEFENCE).contractFee(750000L).teamID(15L).build());
			
			players.add(Player.builder().name("Joseph").surname("Attamah").birthday(LocalDate.of(1994, 5, 22))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(15L).build());
			
			players.add(Player.builder().name("Dimitrios").surname("Kolovetsios").birthday(LocalDate.of(1991, 10, 16))
			                  .position(EPosition.DEFENCE).contractFee(350000L).teamID(15L).build());
			
			players.add(Player.builder().name("Bilal").surname("Ceylan").birthday(LocalDate.of(2004, 8, 14))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(15L).build());
			
			players.add(Player.builder().name("Lionel").surname("Carole").birthday(LocalDate.of(1991, 4, 12))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(15L).build());
			
			players.add(Player.builder().name("Hasan Ali").surname("Kaldırım").birthday(LocalDate.of(1989, 12, 9))
			                  .position(EPosition.DEFENCE).contractFee(100000L).teamID(15L).build());
			
			players.add(Player.builder().name("Gökhan").surname("Sazdağı").birthday(LocalDate.of(1994, 9, 20))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(15L).build());
			
			players.add(Player.builder().name("Anthony").surname("Uzodimma").birthday(LocalDate.of(1999, 4, 17))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(15L).build());
			
			players.add(Player.builder().name("Kartal").surname("Yılmaz").birthday(LocalDate.of(2000, 11, 4))
			                  .position(EPosition.DEFENCE).contractFee(2700000L).teamID(15L).build());
			
			players.add(Player.builder().name("Yaw").surname("Ackah").birthday(LocalDate.of(1999, 6, 1))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(15L).build());
			
			players.add(Player.builder().name("Baran").surname("Geze").birthday(LocalDate.of(2005, 8, 26))
			                  .position(EPosition.DEFENCE).contractFee(400000L).teamID(15L).build());
			
			players.add(Player.builder().name("Mehdi").surname("Bourabia").birthday(LocalDate.of(1991, 8, 7))
			                  .position(EPosition.MIDFIELD).contractFee(1000000L).teamID(15L).build());
			
			players.add(Player.builder().name("Ali").surname("Karimi").birthday(LocalDate.of(1994, 2, 11))
			                  .position(EPosition.MIDFIELD).contractFee(800000L).teamID(15L).build());
			
			players.add(Player.builder().name("Miguel").surname("Cardoso").birthday(LocalDate.of(1994, 6, 19))
			                  .position(EPosition.MIDFIELD).contractFee(2500000L).teamID(15L).build());
			
			players.add(Player.builder().name("Eray").surname("Özbek").birthday(LocalDate.of(2003, 1, 9))
			                  .position(EPosition.MIDFIELD).contractFee(125000L).teamID(15L).build());
			
			players.add(Player.builder().name("Carlos").surname("Mané").birthday(LocalDate.of(1994, 3, 11))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(15L).build());
			
			players.add(Player.builder().name("Ramazan").surname("Civelek").birthday(LocalDate.of(1996, 1, 22))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(15L).build());
			
			players.add(Player.builder().name("Nurettin").surname("Korkmaz").birthday(LocalDate.of(2002, 6, 27))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(15L).build());
			
			players.add(Player.builder().name("Aylton").surname("Boa Morte").birthday(LocalDate.of(1993, 9, 23))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(15L).build());
			
			players.add(Player.builder().name("Duckens").surname("Nazon").birthday(LocalDate.of(1994, 4, 7))
			                  .position(EPosition.OFFENCE).contractFee(1600000L).teamID(15L).build());
			
			players.add(Player.builder().name("Stéphane").surname("Bahoken").birthday(LocalDate.of(1992, 5, 28))
			                  .position(EPosition.OFFENCE).contractFee(950000L).teamID(15L).build());
			
			players.add(Player.builder().name("Talha").surname("Sarıarslan").birthday(LocalDate.of(2004, 1, 18))
			                  .position(EPosition.OFFENCE).contractFee(200000L).teamID(15L).build());
			
			players.add(Player.builder().name("Okan").surname("Kocuk").birthday(LocalDate.of(1995, 7, 27))
			                  .position(EPosition.GOALKEEPER).contractFee(1000000L).teamID(16L).build());
			
			players.add(Player.builder().name("Halil").surname("Yeral").birthday(LocalDate.of(2000, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(16L).build());
			
			players.add(Player.builder().name("Taha").surname("Tosun").birthday(LocalDate.of(2005, 4, 28))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(16L).build());
			
			players.add(Player.builder().name("Muammer").surname("Yıldırım").birthday(LocalDate.of(1990, 9, 14))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(16L).build());
			
			players.add(Player.builder().name("Efe Berat").surname("Törüz").birthday(LocalDate.of(2006, 9, 8))
			                  .position(EPosition.GOALKEEPER).contractFee(0L).teamID(16L).build());
			
			players.add(Player.builder().name("Rick").surname("van Drongelen").birthday(LocalDate.of(1998, 12, 20))
			                  .position(EPosition.DEFENCE).contractFee(1400000L).teamID(16L).build());
			
			players.add(Player.builder().name("Lubomir").surname("Satka").birthday(LocalDate.of(1995, 12, 2))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(16L).build());
			
			players.add(Player.builder().name("Yunus Emre").surname("Çift").birthday(LocalDate.of(2003, 9, 1))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(16L).build());
			
			players.add(Player.builder().name("Bedirhan").surname("Çetin").birthday(LocalDate.of(2006, 6, 29))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(16L).build());
			
			players.add(Player.builder().name("Elano").surname("Yegen").birthday(LocalDate.of(2002, 10, 8))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(16L).build());
			
			players.add(Player.builder().name("Marc").surname("Bola").birthday(LocalDate.of(1997, 12, 9))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(16L).build());
			
			players.add(Player.builder().name("Soner").surname("Gönül").birthday(LocalDate.of(1997, 6, 11))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(16L).build());
			
			players.add(Player.builder().name("Enes").surname("Albak").birthday(LocalDate.of(2005, 5, 16))
			                  .position(EPosition.DEFENCE).contractFee(125000L).teamID(16L).build());
			
			players.add(Player.builder().name("Nanu").surname("Nanu").birthday(LocalDate.of(1994, 5, 17))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(16L).build());
			
			players.add(Player.builder().name("Mustafa").surname("Tan").birthday(LocalDate.of(2005, 4, 27))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(16L).build());
			
			players.add(Player.builder().name("Zeki").surname("Yavru").birthday(LocalDate.of(1991, 9, 5))
			                  .position(EPosition.DEFENCE).contractFee(300000L).teamID(16L).build());
			
			players.add(Player.builder().name("Youssef").surname("Aït Bennasser").birthday(LocalDate.of(1996, 7, 7))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(16L).build());
			
			players.add(Player.builder().name("Flavien").surname("Tait").birthday(LocalDate.of(1993, 2, 2))
			                  .position(EPosition.MIDFIELD).contractFee(2000000L).teamID(16L).build());
			
			players.add(Player.builder().name("Celil").surname("Yüksel").birthday(LocalDate.of(1998, 1, 1))
			                  .position(EPosition.MIDFIELD).contractFee(700000L).teamID(16L).build());
			
			players.add(Player.builder().name("Muhammet Ali").surname("Özbaskıcı").birthday(LocalDate.of(2005, 9, 27))
			                  .position(EPosition.MIDFIELD).contractFee(300000L).teamID(16L).build());
			
			players.add(Player.builder().name("Soner").surname("Aydoğdu").birthday(LocalDate.of(1991, 1, 5))
			                  .position(EPosition.MIDFIELD).contractFee(125000L).teamID(16L).build());
			
			players.add(Player.builder().name("Alper Efe").surname("Pazar").birthday(LocalDate.of(2005, 2, 8))
			                  .position(EPosition.MIDFIELD).contractFee(0L).teamID(16L).build());
			
			players.add(Player.builder().name("Carlo").surname("Holse").birthday(LocalDate.of(1999, 6, 2))
			                  .position(EPosition.MIDFIELD).contractFee(3200000L).teamID(16L).build());
			
			players.add(Player.builder().name("Olivier").surname("Ntcham").birthday(LocalDate.of(1996, 2, 9))
			                  .position(EPosition.MIDFIELD).contractFee(2800000L).teamID(16L).build());
			
			players.add(Player.builder().name("Emre").surname("Kılınç").birthday(LocalDate.of(1994, 8, 23))
			                  .position(EPosition.MIDFIELD).contractFee(2000000L).teamID(16L).build());
			
			players.add(Player.builder().name("Arbnor").surname("Muja").birthday(LocalDate.of(1998, 11, 29))
			                  .position(EPosition.MIDFIELD).contractFee(4500000L).teamID(16L).build());
			
			players.add(Player.builder().name("Kingsley").surname("Schindler").birthday(LocalDate.of(1993, 7, 12))
			                  .position(EPosition.MIDFIELD).contractFee(500000L).teamID(16L).build());
			
			players.add(Player.builder().name("Moussa").surname("Guel").birthday(LocalDate.of(1999, 6, 23))
			                  .position(EPosition.MIDFIELD).contractFee(150000L).teamID(16L).build());
			
			players.add(Player.builder().name("Landry").surname("Dimata").birthday(LocalDate.of(1997, 9, 1))
			                  .position(EPosition.MIDFIELD).contractFee(1800000L).teamID(16L).build());
			
			players.add(Player.builder().name("Ercan").surname("Kara").birthday(LocalDate.of(1996, 1, 3))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(16L).build());
			
			players.add(Player.builder().name("Marius").surname("Mouandilmadji").birthday(LocalDate.of(1998, 1, 22))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(16L).build());
			
			players.add(Player.builder().name("Gaëtan").surname("Laura").birthday(LocalDate.of(1995, 8, 6))
			                  .position(EPosition.OFFENCE).contractFee(500000L).teamID(16L).build());
			
			players.add(Player.builder().name("Berhan").surname("Deniz").birthday(LocalDate.of(2004, 11, 25))
			                  .position(EPosition.OFFENCE).contractFee(75000L).teamID(16L).build());
			
			players.add(Player.builder().name("Mateusz").surname("Lis").birthday(LocalDate.of(1997, 2, 27))
			                  .position(EPosition.GOALKEEPER).contractFee(1600000L).teamID(17L).build());
			
			players.add(Player.builder().name("Arda").surname("Özçimen").birthday(LocalDate.of(2002, 1, 8))
			                  .position(EPosition.GOALKEEPER).contractFee(275000L).teamID(17L).build());
			
			players.add(Player.builder().name("Yiğit").surname("Yıldız").birthday(LocalDate.of(2004, 4, 20))
			                  .position(EPosition.GOALKEEPER).contractFee(25000L).teamID(17L).build());
			
			players.add(Player.builder().name("Emircan").surname("Seçgin").birthday(LocalDate.of(2002, 4, 3))
			                  .position(EPosition.GOALKEEPER).contractFee(25000L).teamID(17L).build());
			
			players.add(Player.builder().name("Taha").surname("Altıkardeş").birthday(LocalDate.of(2003, 8, 22))
			                  .position(EPosition.DEFENCE).contractFee(2800000L).teamID(17L).build());
			
			players.add(Player.builder().name("Malcom").surname("Bokele").birthday(LocalDate.of(2000, 2, 12))
			                  .position(EPosition.DEFENCE).contractFee(1800000L).teamID(17L).build());
			
			players.add(Player.builder().name("Koray").surname("Günter").birthday(LocalDate.of(1994, 8, 16))
			                  .position(EPosition.DEFENCE).contractFee(850000L).teamID(17L).build());
			
			players.add(Player.builder().name("Novatus").surname("Miroshi").birthday(LocalDate.of(2002, 9, 2))
			                  .position(EPosition.DEFENCE).contractFee(700000L).teamID(17L).build());
			
			players.add(Player.builder().name("Héliton").surname("Héliton").birthday(LocalDate.of(1995, 11, 13))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(17L).build());
			
			players.add(Player.builder().name("Lasse").surname("Nielsen").birthday(LocalDate.of(1988, 1, 8))
			                  .position(EPosition.DEFENCE).contractFee(75000L).teamID(17L).build());
			
			players.add(Player.builder().name("Ege").surname("Yıldırım").birthday(LocalDate.of(2007, 4, 18))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(17L).build());
			
			players.add(Player.builder().name("Djalma").surname("Silva").birthday(LocalDate.of(1994, 9, 19))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(17L).build());
			
			players.add(Player.builder().name("İsmail").surname("Köybaşı").birthday(LocalDate.of(1989, 7, 10))
			                  .position(EPosition.DEFENCE).contractFee(50000L).teamID(17L).build());
			
			players.add(Player.builder().name("Ogün").surname("Bayrak").birthday(LocalDate.of(1998, 10, 10))
			                  .position(EPosition.DEFENCE).contractFee(750000L).teamID(17L).build());
			
			players.add(Player.builder().name("Nazım").surname("Sangaré").birthday(LocalDate.of(1994, 5, 30))
			                  .position(EPosition.DEFENCE).contractFee(300000L).teamID(17L).build());
			
			players.add(Player.builder().name("Anthony").surname("Dennis").birthday(LocalDate.of(2004, 6, 21))
			                  .position(EPosition.DEFENCE).contractFee(500000L).teamID(17L).build());
			
			players.add(Player.builder().name("Doğan").surname("Erdoğan").birthday(LocalDate.of(1996, 8, 22))
			                  .position(EPosition.DEFENCE).contractFee(400000L).teamID(17L).build());
			
			players.add(Player.builder().name("Isaac").surname("Solet").birthday(LocalDate.of(2001, 6, 16))
			                  .position(EPosition.DEFENCE).contractFee(100000L).teamID(17L).build());
			
			players.add(Player.builder().name("Kuryu").surname("Matsuki").birthday(LocalDate.of(2003, 4, 30))
			                  .position(EPosition.MIDFIELD).contractFee(1500000L).teamID(17L).build());
			
			players.add(Player.builder().name("Yalçın").surname("Kayan").birthday(LocalDate.of(1999, 1, 30))
			                  .position(EPosition.MIDFIELD).contractFee(1100000L).teamID(17L).build());
			
			players.add(Player.builder().name("Ahmed").surname("Ildız").birthday(LocalDate.of(1996, 11, 28))
			                  .position(EPosition.MIDFIELD).contractFee(350000L).teamID(17L).build());
			
			players.add(Player.builder().name("Tuğbey").surname("Akgün").birthday(LocalDate.of(2003, 4, 9))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(17L).build());
			
			players.add(Player.builder().name("Furkan").surname("Malak").birthday(LocalDate.of(2005, 1, 14))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(17L).build());
			
			players.add(Player.builder().name("Victor").surname("Hugo").birthday(LocalDate.of(2004, 5, 11))
			                  .position(EPosition.OFFENCE).contractFee(5000000L).teamID(17L).build());
			
			players.add(Player.builder().name("David").surname("Tijanic").birthday(LocalDate.of(1997, 7, 16))
			                  .position(EPosition.OFFENCE).contractFee(900000L).teamID(17L).build());
			
			players.add(Player.builder().name("Emir Enes").surname("Araz").birthday(LocalDate.of(2006, 8, 7))
			                  .position(EPosition.OFFENCE).contractFee(0L).teamID(17L).build());
			
			players.add(Player.builder().name("David Datro").surname("Fofana").birthday(LocalDate.of(2002, 12, 22))
			                  .position(EPosition.OFFENCE).contractFee(12000000L).teamID(17L).build());
			
			players.add(Player.builder().name("Rômulo").surname("Rômulo").birthday(LocalDate.of(2002, 2, 8))
			                  .position(EPosition.OFFENCE).contractFee(2200000L).teamID(17L).build());
			
			players.add(Player.builder().name("Juan").surname("Juan").birthday(LocalDate.of(2002, 3, 7))
			                  .position(EPosition.OFFENCE).contractFee(800000L).teamID(17L).build());
			
			players.add(Player.builder().name("Kubilay").surname("Kanatsızkuş").birthday(LocalDate.of(1997, 3, 28))
			                  .position(EPosition.OFFENCE).contractFee(275000L).teamID(17L).build());
			
			
			players.add(Player.builder().name("Erce").surname("Kardeşler").birthday(LocalDate.of(1994, 3, 14))
			                  .position(EPosition.GOALKEEPER).contractFee(425000L).teamID(18L).build());
			
			players.add(Player.builder().name("Visar").surname("Bekaj").birthday(LocalDate.of(1997, 5, 24))
			                  .position(EPosition.GOALKEEPER).contractFee(350000L).teamID(18L).build());
			
			players.add(Player.builder().name("Emir").surname("Dadük").birthday(LocalDate.of(2008, 2, 13))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(18L).build());
			
			players.add(Player.builder().name("Demir").surname("Sarıcalı").birthday(LocalDate.of(2005, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(50000L).teamID(18L).build());
			
			players.add(Player.builder().name("Francisco").surname("Calvo").birthday(LocalDate.of(1992, 7, 8))
			                  .position(EPosition.DEFENCE).contractFee(1500000L).teamID(18L).build());
			
			players.add(Player.builder().name("Guy-Marcelin").surname("Kilama").birthday(LocalDate.of(1999, 5, 30))
			                  .position(EPosition.DEFENCE).contractFee(1300000L).teamID(18L).build());
			
			players.add(Player.builder().name("Cengiz").surname("Demir").birthday(LocalDate.of(2001, 4, 18))
			                  .position(EPosition.DEFENCE).contractFee(300000L).teamID(18L).build());
			
			players.add(Player.builder().name("Burak").surname("Yılmaz").birthday(LocalDate.of(1995, 11, 27))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(18L).build());
			
			players.add(Player.builder().name("Cemali").surname("Sertel").birthday(LocalDate.of(2000, 1, 6))
			                  .position(EPosition.DEFENCE).contractFee(1200000L).teamID(18L).build());
			
			players.add(Player.builder().name("Oğuzhan").surname("Matur").birthday(LocalDate.of(1999, 8, 19))
			                  .position(EPosition.DEFENCE).contractFee(150000L).teamID(18L).build());
			
			players.add(Player.builder().name("Kerim").surname("Alıcı").birthday(LocalDate.of(1997, 6, 24))
			                  .position(EPosition.DEFENCE).contractFee(250000L).teamID(18L).build());
			
			players.add(Player.builder().name("Kamil Ahmet").surname("Çörekçi").birthday(LocalDate.of(1992, 2, 1))
			                  .position(EPosition.DEFENCE).contractFee(225000L).teamID(18L).build());
			
			players.add(Player.builder().name("Massanga").surname("Matondo").birthday(LocalDate.of(1999, 8, 17))
			                  .position(EPosition.MIDFIELD).contractFee(1300000L).teamID(18L).build());
			
			players.add(Player.builder().name("Lamine").surname("Diack").birthday(LocalDate.of(2000, 11, 15))
			                  .position(EPosition.MIDFIELD).contractFee(1200000L).teamID(18L).build());
			
			players.add(Player.builder().name("Selimcan").surname("Temel").birthday(LocalDate.of(2000, 5, 27))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(18L).build());
			
			players.add(Player.builder().name("Görkem").surname("Sağlam").birthday(LocalDate.of(1998, 4, 11))
			                  .position(EPosition.MIDFIELD).contractFee(850000L).teamID(18L).build());
			
			players.add(Player.builder().name("Abdulkadir").surname("Parmak").birthday(LocalDate.of(1994, 12, 28))
			                  .position(EPosition.MIDFIELD).contractFee(250000L).teamID(18L).build());
			
			players.add(Player.builder().name("Ali").surname("Yıldız").birthday(LocalDate.of(2007, 3, 12))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(18L).build());
			
			players.add(Player.builder().name("Rui").surname("Pedro").birthday(LocalDate.of(1998, 3, 20))
			                  .position(EPosition.MIDFIELD) // Changed to MIDFIELDER
			                  .contractFee(650000L).teamID(18L).build());
			
			players.add(Player.builder().name("Baran").surname("Sarka").birthday(LocalDate.of(2001, 6, 11))
			                  .position(EPosition.MIDFIELD) // Changed to MIDFIELDER
			                  .contractFee(125000L).teamID(18L).build());
			
			players.add(Player.builder().name("Rigoberto").surname("Rivas").birthday(LocalDate.of(1998, 7, 31))
			                  .position(EPosition.OFFENCE).contractFee(1900000L).teamID(18L).build());
			
			players.add(Player.builder().name("Joelson").surname("Fernandes").birthday(LocalDate.of(2003, 2, 28))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(18L).build());
			
			players.add(Player.builder().name("Berkay").surname("İrşad Göç").birthday(LocalDate.of(2001, 7, 27))
			                  .position(EPosition.OFFENCE) // Changed to FORWARD
			                  .contractFee(0L) // Adjust as necessary
			                  .teamID(18L).build());
			
			players.add(Player.builder().name("Bilal").surname("Boutobba").birthday(LocalDate.of(1998, 8, 29))
			                  .position(EPosition.OFFENCE).contractFee(1800000L).teamID(18L).build());
			
			players.add(Player.builder().name("Funsho").surname("Bamgboye").birthday(LocalDate.of(1999, 1, 9))
			                  .position(EPosition.OFFENCE).contractFee(900000L).teamID(18L).build());
			
			players.add(Player.builder().name("Vincent").surname("Aboubakar").birthday(LocalDate.of(1992, 1, 22))
			                  .position(EPosition.OFFENCE).contractFee(3400000L).teamID(18L).build());
			
			players.add(Player.builder().name("Carlos").surname("Strandberg").birthday(LocalDate.of(1996, 4, 14))
			                  .position(EPosition.OFFENCE).contractFee(2200000L).teamID(18L).build());
			
			players.add(Player.builder().name("Jonathan").surname("Okoronkwo").birthday(LocalDate.of(2003, 9, 13))
			                  .position(EPosition.OFFENCE).contractFee(1000000L).teamID(18L).build());
			
			players.add(Player.builder().name("Gökhan").surname("Akkan").birthday(LocalDate.of(1995, 1, 1))
			                  .position(EPosition.GOALKEEPER).contractFee(1600000L).teamID(19L).build());
			
			players.add(Player.builder().name("Diogo").surname("Sousa").birthday(LocalDate.of(1998, 9, 16))
			                  .position(EPosition.GOALKEEPER).contractFee(1000000L).teamID(19L).build());
			
			players.add(Player.builder().name("Rüzgar").surname("Adıyaman").birthday(LocalDate.of(2006, 11, 23))
			                  .position(EPosition.GOALKEEPER).contractFee(25000L).teamID(19L).build());
			
			players.add(Player.builder().name("Kerem").surname("Ersunar").birthday(LocalDate.of(2003, 6, 9))
			                  .position(EPosition.GOALKEEPER).contractFee(25000L).teamID(19L).build());
			
			players.add(Player.builder().name("Christophe").surname("Hérelle").birthday(LocalDate.of(1992, 8, 22))
			                  .position(EPosition.DEFENCE).contractFee(1500000L).teamID(19L).build());
			
			players.add(Player.builder().name("Arlind").surname("Ajeti").birthday(LocalDate.of(1993, 9, 25))
			                  .position(EPosition.DEFENCE).contractFee(1000000L).teamID(19L).build());
			
			players.add(Player.builder().name("Ali").surname("Aytemur").birthday(LocalDate.of(1996, 4, 3))
			                  .position(EPosition.DEFENCE).contractFee(550000L).teamID(19L).build());
			
			players.add(Player.builder().name("Süleyman").surname("Özdamar").birthday(LocalDate.of(1993, 2, 25))
			                  .position(EPosition.DEFENCE).contractFee(125000L).teamID(19L).build());
			
			players.add(Player.builder().name("Ondrej").surname("Celustka").birthday(LocalDate.of(1989, 6, 18))
			                  .position(EPosition.DEFENCE).contractFee(75000L).teamID(19L).build());
			
			players.add(Player.builder().name("Murat").surname("Sipahioğlu").birthday(LocalDate.of(2002, 2, 2))
			                  .position(EPosition.DEFENCE).contractFee(0L).teamID(19L).build());
			
			players.add(Player.builder().name("Cenk").surname("Şen").birthday(LocalDate.of(2000, 10, 2))
			                  .position(EPosition.DEFENCE).contractFee(600000L).teamID(19L).build());
			
			players.add(Player.builder().name("Üzeyir").surname("Ergün").birthday(LocalDate.of(1992, 11, 4))
			                  .position(EPosition.DEFENCE).contractFee(275000L).teamID(19L).build());
			
			players.add(Player.builder().name("Musah").surname("Mohammed").birthday(LocalDate.of(2002, 1, 5))
			                  .position(EPosition.DEFENCE).contractFee(750000L).teamID(19L).build());
			
			players.add(Player.builder().name("Ahmet").surname("Aslan").birthday(LocalDate.of(2001, 6, 29))
			                  .position(EPosition.DEFENCE).contractFee(450000L).teamID(19L).build());
			
			players.add(Player.builder().name("Yusuf").surname("Sertkaya").birthday(LocalDate.of(2005, 8, 20))
			                  .position(EPosition.DEFENCE).contractFee(200000L).teamID(19L).build());
			
			players.add(Player.builder().name("Erkan").surname("Değişmez").birthday(LocalDate.of(1986, 8, 27))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(19L).build());
			
			players.add(Player.builder().name("Gabriel").surname("Obekpa").birthday(LocalDate.of(2004, 5, 24))
			                  .position(EPosition.DEFENCE).contractFee(25000L).teamID(19L).build());
			
			players.add(Player.builder().name("Taylan").surname("Antalyalı").birthday(LocalDate.of(1995, 1, 8))
			                  .position(EPosition.MIDFIELD).contractFee(1600000L).teamID(19L).build());
			
			players.add(Player.builder().name("Samet").surname("Yalçın").birthday(LocalDate.of(1994, 3, 3))
			                  .position(EPosition.MIDFIELD).contractFee(400000L).teamID(19L).build());
			
			players.add(Player.builder().name("Mustafa").surname("Erdilman").birthday(LocalDate.of(2004, 1, 1))
			                  .position(EPosition.MIDFIELD).contractFee(125000L).teamID(19L).build());
			
			players.add(Player.builder().name("Enes").surname("Öğrüce").birthday(LocalDate.of(2007, 5, 3))
			                  .position(EPosition.MIDFIELD).contractFee(100000L).teamID(19L).build());
			
			players.add(Player.builder().name("Tunahan").surname("Akpınar").birthday(LocalDate.of(2001, 7, 23))
			                  .position(EPosition.MIDFIELD).contractFee(50000L).teamID(19L).build());
			
			players.add(Player.builder().name("Fredy").surname("Fredy").birthday(LocalDate.of(1990, 3, 27))
			                  .position(EPosition.MIDFIELD).contractFee(500000L).teamID(19L).build());
			
			players.add(Player.builder().name("Zdravko").surname("Dimitrov").birthday(LocalDate.of(1998, 8, 24))
			                  .position(EPosition.MIDFIELD).contractFee(450000L).teamID(19L).build());
			
			players.add(Player.builder().name("Kenan").surname("Özer").birthday(LocalDate.of(1987, 8, 16))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(19L).build());
			
			players.add(Player.builder().name("Ege").surname("Bilsel").birthday(LocalDate.of(2004, 1, 4))
			                  .position(EPosition.MIDFIELD).contractFee(75000L).teamID(19L).build());
			
			players.add(Player.builder().name("Gökdeniz").surname("Bayrakdar").birthday(LocalDate.of(2001, 11, 23))
			                  .position(EPosition.MIDFIELD).contractFee(2500000L).teamID(19L).build());
			
			players.add(Player.builder().name("Pedro").surname("Brazão").birthday(LocalDate.of(2002, 12, 30))
			                  .position(EPosition.MIDFIELD).contractFee(700000L).teamID(19L).build());
			
			players.add(Player.builder().name("Taulant").surname("Seferi").birthday(LocalDate.of(1996, 11, 15))
			                  .position(EPosition.OFFENCE).contractFee(3500000L).teamID(19L).build());
			
			players.add(Player.builder().name("George").surname("Pușcaș").birthday(LocalDate.of(1996, 4, 8))
			                  .position(EPosition.OFFENCE).contractFee(1500000L).teamID(19L).build());
			
			players.add(Player.builder().name("Haqi").surname("Osman").birthday(LocalDate.of(2002, 4, 11))
			                  .position(EPosition.OFFENCE) // Santrafor
			                  .contractFee(400000L).teamID(19L).build());
			
			players.add(Player.builder().name("Celal").surname("Dumanlı").birthday(LocalDate.of(1994, 4, 28))
			                  .position(EPosition.OFFENCE).contractFee(300000L).teamID(19L).build());

//		for (Player player : players) {
//			playerRepository.save(player);
//		}
			playerRepository.saveAll(players);
		}
	
	
	private void createManager() {
		List<Manager> managerList = new ArrayList<>();
		final String sifre = "12345678";
		
		
		managerList.add(Manager.builder().teamID(1L).managerName("Okan").managerSurname("Buruk").userName("OkanBuruk").managerPassword(sifre).dateOfBirth(LocalDate.of(1974, 6, 10)).build());
		
		managerList.add(Manager.builder().teamID(2L).managerName("Jose").managerSurname("Mourinho").userName("JoseMorinho").managerPassword(sifre).dateOfBirth(LocalDate.of(1963, 1, 26)).build());
		
		managerList.add(Manager.builder().teamID(3L).managerName("Giovanni").managerSurname("Bronckhorst").userName("GiovanniBronckhorst").managerPassword(sifre).dateOfBirth(LocalDate.of(1975, 2, 5)).build());
		
		managerList.add(Manager.builder().teamID(4L).managerName("Şenol").managerSurname("Güneş").managerPassword(sifre).userName("ŞenolGüneş").dateOfBirth(LocalDate.of(1952, 6, 1)).build());
		
		managerList.add(Manager.builder().teamID(5L).managerName("Çağdaş").managerSurname("Atan").managerPassword(sifre).userName("ÇağdaşAtan").dateOfBirth(LocalDate.of(1980, 2, 28)).build());
		
		managerList.add(Manager.builder().teamID(6L).managerName("Fatih").managerSurname("Tekke").managerPassword(sifre).userName("FatihTekke").dateOfBirth(LocalDate.of(1977, 9, 9)).build());
		
		managerList.add(Manager.builder().teamID(7L).managerName("Alex").managerSurname("Souza").managerPassword(sifre).userName("AlexSouza").dateOfBirth(LocalDate.of(1977, 9, 14)).build());
		
		managerList.add(Manager.builder().teamID(8L).managerName("Ali").managerSurname("Çamdalı").managerPassword(sifre).userName("AliÇamdalı").dateOfBirth(LocalDate.of(1984, 8, 16)).build());
		
		managerList.add(Manager.builder().teamID(9L).managerName("İlhan").managerSurname("Palut").managerPassword(sifre).userName("İlhanPalut").dateOfBirth(LocalDate.of(1976, 11, 12)).build());
		
		managerList.add(Manager.builder().teamID(10L).managerName("Selçuk").managerSurname("İnan").managerPassword(sifre).userName("Selçukİnan").dateOfBirth(LocalDate.of(1985, 2, 28)).build());
		
		managerList.add(Manager.builder().teamID(11L).managerName("Serkan").managerSurname("Damla").managerPassword(sifre).userName("SerkanDamla").dateOfBirth(LocalDate.of(1974, 8, 15)).build());
		
		managerList.add(Manager.builder().teamID(12L).managerName("Ahmet").managerSurname("Damla").managerPassword(sifre).userName("AhmetDamla").dateOfBirth(LocalDate.of(1981, 1, 4)).build());
		
		managerList.add(Manager.builder().teamID(13L).managerName("Arda").managerSurname("Turan").managerPassword(sifre).userName("ArdaTurna").dateOfBirth(LocalDate.of(1987, 1, 30)).build());
		
		managerList.add(Manager.builder().teamID(14L).managerName("Sami").managerSurname("Uğurlu").managerPassword(sifre).userName("SamiUğurlu").dateOfBirth(LocalDate.of(1978, 4, 27)).build());
		
		managerList.add(Manager.builder().teamID(15L).managerName("Çağdaş").managerSurname("Atan").managerPassword(sifre).userName("ÇağdaşAtan").dateOfBirth(LocalDate.of(1980, 10, 27)).build());
		
		managerList.add(Manager.builder().teamID(16L).managerName("Thomas").managerSurname("Reis").managerPassword(sifre).userName("ThomasReis").dateOfBirth(LocalDate.of(1969, 6, 12)).build());
		
		managerList.add(Manager.builder().teamID(17L).managerName("Stanimir").managerSurname("Stoilov").managerPassword(sifre).userName("StanimirStoilov").dateOfBirth(LocalDate.of(1964, 6, 1)).build());
		
		managerList.add(Manager.builder().teamID(18L).managerName("Volkan").managerSurname("Demirel").managerPassword(sifre).userName("VolkanDemirel").dateOfBirth(LocalDate.of(1977, 2, 18)).build());
		
		managerList.add(Manager.builder().teamID(19L).managerName("İsmet").managerSurname("Taşdemir").managerPassword(sifre).userName("İsmetTaşdemir").dateOfBirth(LocalDate.of(1974, 1, 21)).build());
		
		managerRepository.saveAll(managerList);
		
	}
		
		private void createTeams () {
			List<Team> teamList = new ArrayList<>();
			
			teamList.add(Team.builder().teamName("Galatasaray").presidentName("Dursun Özbek")
			                 .colour(EColours.RED_YELLOW).stadiumID(1L).foundationDate("1905").build());
			teamList.add(Team.builder().teamName("Fenerbahçe").presidentName("Ali Koç").colour(EColours.YELLOW_BLUE)
			                 .stadiumID(2L).foundationDate("1907").build());
			teamList.add(Team.builder().teamName("Beşiktaş").presidentName("Hasan Arat").colour(EColours.BLACK_WHITE)
			                 .stadiumID(3L).foundationDate("1903").build());
			teamList.add(Team.builder().teamName("Trabzonspor").presidentName("Ahmet Ağaoğlu")
			                 .colour(EColours.BURGUNDY_BLUE).stadiumID(4L).foundationDate("1967").build());
			teamList.add(Team.builder().teamName("İstanbul Başakşehir FK").presidentName("Göksel Gümüşdağ")
			                 .colour(EColours.DOUBLE_RED).stadiumID(5L).foundationDate("2014").build());
			teamList.add(Team.builder().teamName("Alanyaspor").presidentName("Hasan Çavuşoğlı")
			                 .colour(EColours.ORANGE_BLUE).stadiumID(6L).foundationDate("1948").build());
			teamList.add(Team.builder().teamName("Antalyaspor").presidentName("Aziz Çetin").colour(EColours.STRIPED_RED)
			                 .stadiumID(7L).foundationDate("1966").build());
			teamList.add(Team.builder().teamName("Konyaspor").presidentName("Hilmi Kullukçu")
			                 .colour(EColours.GREEN_WHITE).stadiumID(8L).foundationDate("1922").build());
			teamList.add(Team.builder().teamName("Sivasspor").presidentName("Mecnun Otyakmaz")
			                 .colour(EColours.RED_WHITE).stadiumID(9L).foundationDate("1967").build());
			teamList.add(Team.builder().teamName("Çaykur Rizespor").presidentName("İbrahim Turgut")
			                 .colour(EColours.GREEN_BLUE).stadiumID(10L).foundationDate("1953").build());
			teamList.add(Team.builder().teamName("Gaziantep FK").presidentName("Adil Kürükçü")
			                 .colour(EColours.DOUBLE_RED).stadiumID(11L).foundationDate("1969").build());
			teamList.add(Team.builder().teamName("Adana Demirspor").presidentName("Murat Sancak")
			                 .colour(EColours.BURGUNDY_BLUE).stadiumID(12L).foundationDate("1940").build());
			teamList.add(Team.builder().teamName("Eyüpspor").presidentName("Murat Özkaya")//############
			                 .colour(EColours.YELLOW_BLUE).stadiumID(13L).foundationDate("1919").build());
			teamList.add(Team.builder().teamName("Kasımpaşa").presidentName("Mehmet Fatih Saraç")
			                 .colour(EColours.RED_BLACK).stadiumID(14L).foundationDate("1921").build());
			teamList.add(Team.builder().teamName("Kayserispor").presidentName("Berna Gözbaşı")
			                 .colour(EColours.RED_YELLOW).stadiumID(15L).foundationDate("1966").build());
			teamList.add(Team.builder().teamName("Samsunspor").presidentName("Yüksel Yıldırım")
			                 .colour(EColours.GREEN_BLACK).stadiumID(16L).foundationDate("1965").build());
			teamList.add(Team.builder().teamName("Göztepe").presidentName("Mehmet Sepil").colour(EColours.RED_YELLOW)
			                 .stadiumID(17L).foundationDate("1925").build());
			teamList.add(Team.builder().teamName("Hatayspor").presidentName("Ali İpek").colour(EColours.DOUBLE_RED)
			                 .stadiumID(18L).foundationDate("1966").build());
			teamList.add(Team.builder().teamName("Bodrum FK").presidentName("Fikret Öztürk")
			                 .colour(EColours.GREEN_WHITE).stadiumID(19L).foundationDate("1931").build());
			
			teamRepository.saveAll(teamList);
		}
		
		
		private void createStadium () {
			List<Stadium> stadiumList = new ArrayList<>();
			Stadium galatasarayStadium =
					Stadium.builder().stadiumName("Türk Telekom Stadyumu").location("İstanbul").capacity(52500).build();
			stadiumList.add(galatasarayStadium);
			
			Stadium fenerbahceStadium =
					Stadium.builder().stadiumName("Ülker Stadyumu").location("İstanbul").capacity(50000).build();
			stadiumList.add(fenerbahceStadium);
			
			Stadium besiktasStadium =
					Stadium.builder().stadiumName("Vodafone Park").location("İstanbul").capacity(42000).build();
			stadiumList.add(besiktasStadium);
			
			Stadium trabzonsporStadium =
					Stadium.builder().stadiumName("Medical Park Stadyumu").location("Trabzon").capacity(41000).build();
			stadiumList.add(trabzonsporStadium);
			
			Stadium basaksehirStadium =
					Stadium.builder().stadiumName("Başakşehir Fatih Terim Stadyumu").location("İstanbul")
					       .capacity(17000).build();
			stadiumList.add(basaksehirStadium);
			
			Stadium alanyasporStadium =
					Stadium.builder().stadiumName("Alanya Oba Stadyumu").location("Alanya").capacity(10000).build();
			stadiumList.add(alanyasporStadium);
			
			Stadium antalyasporStadium =
					Stadium.builder().stadiumName("Antalya Stadyumu").location("Antalya").capacity(32000).build();
			stadiumList.add(antalyasporStadium);
			
			Stadium konyasporStadium =
					Stadium.builder().stadiumName("Konya Büyükşehir Stadyumu").location("Konya").capacity(42000)
					       .build();
			stadiumList.add(konyasporStadium);
			
			Stadium sivassporStadium =
					Stadium.builder().stadiumName("Sivas 4 Eylül Stadyumu").location("Sivas").capacity(27000).build();
			stadiumList.add(sivassporStadium);
			
			Stadium caykurRizesporStadium =
					Stadium.builder().stadiumName("Çaykur Didi Stadyumu").location("Rize").capacity(15000).build();
			stadiumList.add(caykurRizesporStadium);
			
			Stadium gaziantepFKStadium =
					Stadium.builder().stadiumName("Gaziantep Stadyumu").location("Gaziantep").capacity(35000).build();
			stadiumList.add(gaziantepFKStadium);
			
			Stadium adanaDemirsporStadium =
					Stadium.builder().stadiumName("Yeni Adana Stadyumu").location("Adana").capacity(33000).build();
			stadiumList.add(adanaDemirsporStadium);
			
			Stadium eyupStadium =
					Stadium.builder().stadiumName("Recep Tayyip Erdoğan Stadyumu").location("İstanbul").capacity(14000)
					       .build();
			stadiumList.add(eyupStadium);
			
			Stadium kasimpasaStadium =
					Stadium.builder().stadiumName("Recep Tayyip Erdoğan Stadyumu").location("İstanbul").capacity(14000)
					       .build();
			stadiumList.add(kasimpasaStadium);
			
			Stadium kayserisporStadium =
					Stadium.builder().stadiumName("Kadir Has Stadyumu").location("Kayseri").capacity(30000).build();
			stadiumList.add(kayserisporStadium);
			
			Stadium samsunStadium =
					Stadium.builder().stadiumName("Samsun Yeni 19 Mayıs Stadyumu").location("Samsun").capacity(34000)
					       .build();
			stadiumList.add(samsunStadium);
			
			Stadium goztepeStadium =
					Stadium.builder().stadiumName("Göztepe Gürsel Aksel Stadyumu").location("İzmir").capacity(20000)
					       .build();
			stadiumList.add(goztepeStadium);
			
			Stadium hatayStadium =
					Stadium.builder().stadiumName("Yeni Hatay Stadyumu").location("Hatay").capacity(25000).build();
			stadiumList.add(hatayStadium);
			
			Stadium bodrumFKStadium =
					Stadium.builder().stadiumName("Bodrum İlçe Stadyumu").location("Bodrum").capacity(10000).build();
			stadiumList.add(bodrumFKStadium);
			
			stadiumRepository.saveAll(stadiumList);
			
		}
		
		private void createLeague () {
			List<Team> teams = teamRepository.findAll();
			List<Long> teamIDList = teams.stream().map(Team::getId)  // Takım ID'lerini al
			                             .collect(Collectors.toList());
			
			
			League league = League.builder().leagueName("Trendyol Super Lig").leagueSeason("2023/2024")
			                      .startDate(LocalDate.now()).region(ERegion.TURKIYE) // Örnek olarak bir bölge
			                      .cluster(ECluster.TRENDYOL_SUPER_LIG) // Örnek olarak bir cluster
			                      .teamIDList(teamIDList).build();
			
			leagueRepository.save(league);
		}
	}