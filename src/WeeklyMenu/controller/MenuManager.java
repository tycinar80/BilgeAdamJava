package WeeklyMenu.controller;

import java.util.Random;

import WeeklyMenu.service.Menu;

public class MenuManager extends Menu {

	@Override
	public void haftalikMenuOlustur() {
		System.out.println("**************");
		System.out.println("HAFTALIK MENU");
		System.out.println("**************\n");

		for (int i = 0; i < day; i++) {
			System.out.println((i + 1) + "- " + gunEkle(i) + ": " + corbaEkle() + ", " + anaYemekEkle() + ", "
					+ icecekEkle() + ", " + tatliEkle());
		}
		System.out.println("NOT: ÇAY ÝKRAMIMIZDIR");
	}

	@Override
	public int rastgeleSayiUret(int limit) {
		Random sayi = new Random();
		return sayi.nextInt(limit);
	}

}
