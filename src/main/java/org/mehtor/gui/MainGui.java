package org.mehtor.gui;

import org.mehtor.controller.TeamController;
import org.mehtor.model.ControllerModel;

import java.util.Scanner;

public class MainGui {
	private static final ControllerModel controllerModel = ControllerModel.getInstance();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		startApplication();

	}


	public static void startApplication() {
		int opt = 0;
		do {
			opt = futbolAppMenuOpsiyonlari(futbolAppMenu());
		} while (opt != 0);
	}

	private static int futbolAppMenu() {
		System.out.println("### Futbol App Ana Menu ###");
		System.out.println("1- Menajer Islemleri");
		System.out.println("2- Takim Islemleri");
		System.out.println("3- Musabaka Islemleri");
		System.out.println("0- Cikis");
		System.out.println("Secimiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}

	private static int futbolAppMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				ManagerGui.menajerModule(controllerModel);
				break;
			}
			case 2: {
				TeamGui.teamGui(controllerModel);
				break;
			}
			case 3:{
				MatchGui.matchModule(controllerModel);
				break;
			}
			case 0: {
				System.out.println("FutbolApp kapatiliyor...");
				break;
			}
			default: {
				System.out.println("Gecerli bir secim yapiniz !!");
			}
		}
		return opt;
	}
}