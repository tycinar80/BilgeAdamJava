package WeeklyMenu.service;

import WeeklyMenu.repository.*;

public abstract class Menu implements Constance {

	public String gunEkle(int day) {
		return EDay.values()[day].getName();
	}

	public String corbaEkle() {
		return ESoup.values()[rastgeleSayiUret(soup)].getName();
	}

	public String anaYemekEkle() {
		return EMeal.values()[rastgeleSayiUret(meal)].getName();
	}

	public String icecekEkle() {
		return EDrinks.values()[rastgeleSayiUret(drink)].getName();
	}

	public String tatliEkle() {
		return EDessert.values()[rastgeleSayiUret(dessert)].getName();
	}

	public void icecekListele() {
		System.out.println("ÝÇECEK LÝSTESÝ");
		System.out.println("**************");
		for (EDrinks drinks : EDrinks.values())
			System.out.println(drinks.getName());
		System.out.println("**************");
	}

	public void yemekListele() {
		System.out.println("YEMEK LÝSTESÝ");
		System.out.println("**************");
		for (EMeal meals : EMeal.values())
			System.out.println(meals.getName());
		System.out.println("**************");
	}

	public void corbaListele() {
		System.out.println("ÇORBA LÝSTESÝ");
		System.out.println("**************");
		for (ESoup soups : ESoup.values())
			System.out.println(soups.getName());
		System.out.println("**************");
	}

	public void tatliListele() {
		System.out.println("TATLI LÝSTESÝ");
		System.out.println("**************");
		for (EDessert desserts : EDessert.values())
			System.out.println(desserts.getName());
		System.out.println("**************");
	}

}
