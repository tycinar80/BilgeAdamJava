package Assignments;

import java.util.Scanner;

public class MathOpsWithNumAtStrings {

	public static void main(String[] args) {

		// 1- (Kolay) : 5 ile 7 nin toplamý nedir? -> 12
		// 2- (Kolay) : iki sayým var biri 9 diðeri 2 bunlarýn çarpýmý nedir? -> 18
		// 3- (Zor) : iki sayý 124 ile 458 sayýlarýnýn çarpýmý nedir?

		// bunlar birer String ifadedir. Bunlarý kullanýcýdan alabiliriz. Kolay
		// olanlarda sadece (rakamlar olack (0....9)) temel iþlemlerimiz
		// (topla,fark,çarp,böl) iþlemin sonucunu yazdýram program.

		Scanner scanner = new Scanner(System.in);

		char[] search = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		boolean check = false;
		double[] numbers = { 0, 0 };
		int numbersindex = 0;
		double sum = 0;
		int pow = 0;
		double equals = 0;
		System.out.print("Arama: ");
		String usersearch = scanner.nextLine();

		for (int i = usersearch.length() - 1; i >= 0; i--) { // Kullanýcýnýn girdiði stringin indexlerini dönüyor.
			for (int j = 0; j < search.length; j++) { // search array'i ile kontrol.
				if (usersearch.charAt(i) == search[j]) { // eþleþme var mý?
//					System.out.print(j);
					sum += (j * Math.pow(10, pow));
					pow++;
//					System.out.println(sum);
					for (int k = 0; k < search.length; k++) { // bir sonraki indexte rakam arama.
						if (i == 0) {
							check = false;
							break;
						}
						if (usersearch.charAt(i - 1) == search[k])
							check = true;
					}
					if (!check) {
//						System.out.println(sum);
						numbers[numbersindex] = sum;
						numbersindex++;
						sum = 0;
						pow = 0;
					}
					check = false;
				}

			}

		}
		numbersindex = 0;
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(sum);
		if (usersearch.toLowerCase().contains("topla")) {
			for (int i = numbers.length - 1; i >= 0; i--) {
				equals += numbers[i];
			}
			System.out.println("Toplamý = " + equals);
		} else if (usersearch.toLowerCase().contains("fark")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals -= numbers[i];
			}
			System.out.println("Farký = " + equals);
		} else if (usersearch.toLowerCase().contains("çarp")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals *= numbers[i];
			}
			System.out.println("Çarpým = " + equals);
		} else if (usersearch.toLowerCase().contains("böl")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals /= numbers[i];
			}
			System.out.println("Bölüm = " + equals);
		}
		scanner.close();
	}

}
