package Assignments;

import java.util.Scanner;

public class MathOpsWithNumAtStrings {

	public static void main(String[] args) {

		// 1- (Kolay) : 5 ile 7 nin toplam� nedir? -> 12
		// 2- (Kolay) : iki say�m var biri 9 di�eri 2 bunlar�n �arp�m� nedir? -> 18
		// 3- (Zor) : iki say� 124 ile 458 say�lar�n�n �arp�m� nedir?

		// bunlar birer String ifadedir. Bunlar� kullan�c�dan alabiliriz. Kolay
		// olanlarda sadece (rakamlar olack (0....9)) temel i�lemlerimiz
		// (topla,fark,�arp,b�l) i�lemin sonucunu yazd�ram program.

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

		for (int i = usersearch.length() - 1; i >= 0; i--) { // Kullan�c�n�n girdi�i stringin indexlerini d�n�yor.
			for (int j = 0; j < search.length; j++) { // search array'i ile kontrol.
				if (usersearch.charAt(i) == search[j]) { // e�le�me var m�?
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
			System.out.println("Toplam� = " + equals);
		} else if (usersearch.toLowerCase().contains("fark")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals -= numbers[i];
			}
			System.out.println("Fark� = " + equals);
		} else if (usersearch.toLowerCase().contains("�arp")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals *= numbers[i];
			}
			System.out.println("�arp�m = " + equals);
		} else if (usersearch.toLowerCase().contains("b�l")) {
			equals = numbers[numbers.length - 1];
			for (int i = numbers.length - 2; i >= 0; i--) {
				equals /= numbers[i];
			}
			System.out.println("B�l�m = " + equals);
		}
		scanner.close();
	}

}
