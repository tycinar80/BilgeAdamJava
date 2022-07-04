package WeeklyMenu;

import WeeklyMenu.controller.MenuManager;
import WeeklyMenu.service.Menu;

public class Test {

	public static void main(String[] args) {
//		System.out.println(EDay.values()[1]);
		Menu menu = new MenuManager();
//		menu.icecekListele();
//		menu.yemekListele();
//		menu.corbaListele();
//		menu.tatliListele();
		menu.haftalikMenuOlustur();
//		System.out.println(EDrinks.values()[2].getName());
	}

}
