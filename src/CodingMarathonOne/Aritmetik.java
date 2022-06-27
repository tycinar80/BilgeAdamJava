package CodingMarathonOne;

import java.util.Scanner;

public class Aritmetik {
	Scanner scanner = new Scanner(System.in);
	Array array;

	public float[] sayiGir() {
		boolean kontrol = true;
		float[] sayilar = {};
		array = new Array();
		int sayi = 0;
		String sorgu = "";
		do {
			System.out.print("Say� Gir: ");
			sayi = scanner.nextInt();
			sayilar = array.sonunaEkle(sayilar, sayi);
			scanner.nextLine();
			System.out.println("Say� girmek i�in bir tu�a bas�n\n" + "Tamamlamak i�in 'H''ye bas�n");
			System.out.print("Say� girecek misiniz?(E/H): ");
			sorgu = scanner.nextLine();
			if (sorgu.equalsIgnoreCase("H"))
				kontrol = false;
		} while (kontrol);

		return sayilar;
	}

	public void topla(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam = " + toplam);
	}

	public void cikar(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam -= sayilar[i];
		}
		System.out.println("Fark = " + toplam);
	}

	public void carp(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam *= sayilar[i];
		}
		System.out.println("�arp�m = " + toplam);
	}

	public void bol(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam /= sayilar[i];
		}
		System.out.println("B�l�m = " + toplam);
	}

	/**
	 * D�zg�n bir �okgenin kenar say�s� ve kenar uzunlu�una g�re alan�n� hesaplar
	 */
	public void duzgunCokgenAlanHesapla() {
		int kenarsayisi = 0;
		do {
			System.out.print("Kenar Say�s�: ");
			kenarsayisi = scanner.nextInt();
			if (kenarsayisi < 3)
				System.out.println("Kenar say�s� 2'den b�y�k olmal�d�r!");
		} while (kenarsayisi < 3);

		System.out.print("Kenar Uzunlu�u(cm): ");
		float kenaruzunlugu = scanner.nextFloat();
		float alan = (float) (Math.pow(kenaruzunlugu, 2) * kenarsayisi)
				/ (float) (4 * Math.tan((Math.PI) / kenarsayisi));

		System.out.println(kenarsayisi + " kenarl� d�zg�n �okgenin alan� = " + alan);
	}
}
