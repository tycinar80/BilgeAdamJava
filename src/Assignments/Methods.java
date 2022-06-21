package Assignments;

import java.util.Scanner;

public class Methods {
	static String[] iller = { "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd�n",
			"Bal�kesir", "Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum",
			"Denizli", "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir", "Gaziantep", "Giresun",
			"G�m��hane", "Hakkari", "Hatay", "Isparta", "Mersin", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
			"K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa", "Kahramanmara�", "Mardin",
			"Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirda�", "Tokat", "Trabzon", "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan", "I�d�r", "Yalova", "Karab�k",
			"Kilis", "Osmaniye", "D�zce" };
	static String[] temp;

	public static void main(String[] args) {
		// D��ar�dan girilen har ile ba�layan illeri yazd�r.
		// �lleri plaka kodlar�yla yazd�ran metot (10 dan k���kler 01 02 diye yazs�n)
		// girdi�imiz �ehrin ismine g�re plaka d�nen metot
		// ilk harf hari� sesli harfleri silip yazd�ran fonksiyon
		// Sesli harf sil metodun dan d�nen de�erlerin ilk 3 harfini al�n ve
		// sonuna ...(3 nokta) ekleyin
		// Sesli harf sil metodun dan d�nen de�erlerde B ile ba�layanlar�n ba��na
		// "1-"'den ba�lay�p art�rarak yazd�r�n (1-B..., 2-B...)
		// 2. harfi "a" olanlar�n ilk 3 harfini b�y�k yazd�ran metot(�ank�r� -> �AN)

//		System.out.println(iller.length);
//		searchCity(iller, search());
//		plateCode(iller);
//		searchPlateCode(iller, search());
//		sesliHarfSil(iller);
//		hideDigits(iller);
		secondDigit(iller);
		bCities(iller);
	}

//	public static void searchCity(String[] array, String search) {
//		for (int i = 0; i < array.length; i++)
//			if (array[i].toLowerCase().startsWith(search))
//				System.out.println(array[i]);
//	}

	public static void searchCity(String[] array, String search) {
		for (String city : array)
			if (city.toLowerCase().startsWith(search))
				System.out.println(city);
	}

	public static String search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Arama: ");
		String word = scanner.nextLine().toLowerCase();
		return word;
	}

	public static void plateCode(String array[]) {
		for (int i = 0; i < array.length; i++) {
			if (i + 1 < 10)
				System.out.println("0" + (i + 1) + " - " + array[i]);
			else
				System.out.println((i + 1) + " - " + array[i]);
		}
	}

	public static void searchPlateCode(String array[], String search) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].toLowerCase().startsWith(search)) {
				if (i + 1 < 10)
					System.out.println(array[i] + " ilinin plaka kodu :0" + (i + 1));
				else
					System.out.println(array[i] + " ilinin plaka kodu :" + (i + 1));
			}

		}
	}

	public static String[] sesliHarfSil(String[] array) {
		String[] digits = { "a", "e", "�", "i", "o", "�", "u", "�" };
//		char temp = 'a';
		temp = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i].substring(0, 1);
			array[i] = array[i].substring(1);
			for (int j = 0; j < digits.length; j++) {
				array[i] = array[i].toLowerCase().replace(digits[j], "");
			}
//			System.out.println(temp[i] + array[i]);
		}
		return array;
	}

	public static void hideDigits(String[] array) {
//		temp = new String[array.length];
//		for (int i = 0; i < array.length; i++) {
//			temp[i] = array[i].substring(0, 1);
////			System.out.println(temp[i]);
//		}
		sesliHarfSil(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 2)
				System.out.println(temp[i] + array[i].substring(0, 2) + "...");
			else
				System.out.println(temp[i] + array[i] + "...");
		}
	}

	public static void bCities(String[] array) {
		sesliHarfSil(array);
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			if (temp[i].equalsIgnoreCase("B")) {
				System.out.print(counter + "-" + temp[i] + array[i] + "  ");
				counter++;
			}
		}
		System.out.println();
	}

	public static void secondDigit(String[] array) {
		for (String city : array) {
			if (city.toLowerCase().charAt(1) == 'a')
				System.out.print(city.toUpperCase().substring(0, 3) + "  ");

		}
		System.out.println();
	}
}
