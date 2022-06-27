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
			System.out.print("Sayý Gir: ");
			sayi = scanner.nextInt();
			sayilar = array.sonunaEkle(sayilar, sayi);
			scanner.nextLine();
			System.out.println("Sayý girmek için bir tuþa basýn\n" + "Tamamlamak için 'H''ye basýn");
			System.out.print("Sayý girecek misiniz?(E/H): ");
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
		System.out.println("Çarpým = " + toplam);
	}

	public void bol(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam /= sayilar[i];
		}
		System.out.println("Bölüm = " + toplam);
	}

	/**
	 * Düzgün bir çokgenin kenar sayýsý ve kenar uzunluðuna göre alanýný hesaplar
	 */
	public void duzgunCokgenAlanHesapla() {
		int kenarsayisi = 0;
		do {
			System.out.print("Kenar Sayýsý: ");
			kenarsayisi = scanner.nextInt();
			if (kenarsayisi < 3)
				System.out.println("Kenar sayýsý 2'den büyük olmalýdýr!");
		} while (kenarsayisi < 3);

		System.out.print("Kenar Uzunluðu(cm): ");
		float kenaruzunlugu = scanner.nextFloat();
		float alan = (float) (Math.pow(kenaruzunlugu, 2) * kenarsayisi)
				/ (float) (4 * Math.tan((Math.PI) / kenarsayisi));

		System.out.println(kenarsayisi + " kenarlý düzgün çokgenin alaný = " + alan);
	}
}
