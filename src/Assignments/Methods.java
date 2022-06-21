package Assignments;

import java.util.Scanner;

public class Methods {
	static String[] iller = { "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin", "Aydýn",
			"Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum",
			"Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
			"Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
			"Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraþ", "Mardin",
			"Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	static String[] temp;

	public static void main(String[] args) {
		// Dýþarýdan girilen har ile baþlayan illeri yazdýr.
		// Ýlleri plaka kodlarýyla yazdýran metot (10 dan küçükler 01 02 diye yazsýn)
		// girdiðimiz þehrin ismine göre plaka dönen metot
		// ilk harf hariç sesli harfleri silip yazdýran fonksiyon
		// Sesli harf sil metodun dan dönen deðerlerin ilk 3 harfini alýn ve
		// sonuna ...(3 nokta) ekleyin
		// Sesli harf sil metodun dan dönen deðerlerde B ile baþlayanlarýn baþýna
		// "1-"'den baþlayýp artýrarak yazdýrýn (1-B..., 2-B...)
		// 2. harfi "a" olanlarýn ilk 3 harfini büyük yazdýran metot(Çankýrý -> ÇAN)

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
		String[] digits = { "a", "e", "ý", "i", "o", "ö", "u", "ü" };
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
