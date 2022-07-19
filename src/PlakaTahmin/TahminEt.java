package PlakaTahmin;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TahminEt {
	private HashMap<Integer, String> plaka = new HashMap<Integer, String>();
	private int tahminhakki;
	private int tutulanplaka;

	public TahminEt(int tahminhakki) {
		this.tahminhakki = tahminhakki;
		girisEkrani();
		plakaOlustur();
		konsol();
	}

	public void plakaOlustur() {
		plaka.put(1, "Adana");
		plaka.put(2, "Ad�yaman");
		plaka.put(3, "Afyonkarahisar");
		plaka.put(4, "A�r�");
		plaka.put(5, "Amasya");
		plaka.put(6, "Ankara");
		plaka.put(7, "Antalya");
		plaka.put(8, "Artvin");
		plaka.put(9, "Ayd�n");
		plaka.put(10, "Bal�kesir");
		plaka.put(11, "Bilecik");
		plaka.put(12, "Bing�l");
		plaka.put(13, "Bitlis");
		plaka.put(14, "Bolu");
		plaka.put(15, "Burdur");
		plaka.put(16, "Bursa");
		plaka.put(17, "�anakkale");
		plaka.put(18, "�ank�r�");
		plaka.put(19, "�orum");
		plaka.put(20, "Denizli");
		plaka.put(21, "Diyarbak�r");
		plaka.put(22, "Edirne");
		plaka.put(23, "Elaz��");
		plaka.put(24, "Erzincan");
		plaka.put(25, "Erzurum");
		plaka.put(26, "Eski�ehir");
		plaka.put(27, "Gaziantep");
		plaka.put(28, "Giresun");
		plaka.put(29, "G�m��hane");
		plaka.put(30, "Hakkari");
		plaka.put(31, "Hatay");
		plaka.put(32, "Isparta");
		plaka.put(33, "Mersin");
		plaka.put(34, "�stanbul");
		plaka.put(35, "�zmir");
		plaka.put(36, "Kars");
		plaka.put(37, "Kastamonu");
		plaka.put(38, "Kayseri");
		plaka.put(39, "K�rkareli");
		plaka.put(40, "K�r�ehir");
	}

	public void girisEkrani() {
		System.out.println("************************");
		System.out.println("***PLAKA TAHM�N OYUNU***");
		System.out.println("************************");
		System.out.println();
		System.out.println("************************");
		System.out.println("�ehirlerin plakalar�n�\n" + "tahmin etmeye �al���n.\n" + "\n3 tahmin hakk�n�z var.");
		System.out.println("************************");

	}

	public void konsol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Oyun ba�l�yor...");
		int secim = -1;

		do {
			System.out.print(plaka.get(rastgelePlakaSec()) + ": ");
			secim = scanner.nextInt();
//			tahminKontrolu(secim);
		} while (!tahminKontrolu(secim));
		scanner.close();
	}

	public int rastgelePlakaSec() {
		Random random = new Random();
		tutulanplaka = random.nextInt(40) + 1;
		return tutulanplaka;
	}

	public boolean tahminKontrolu(int secim) {
		if (tutulanplaka == secim) {
			System.out.println("Tebrikler do�ru tahmin :)");
			return true;
		} else
			return tahminHakkiSay();
	}

	public boolean tahminHakkiSay() {
		tahminhakki--;
		if (tahminhakki == 0) {
			System.out.println("�zg�n�m tahmin hakk�n�z bitti.");
			System.out.println("Do�ru cevap :" + plaka.get(tutulanplaka) + " - " + tutulanplaka);
			return true;
		} else {
			System.out.println("Do�ru cevap :" + plaka.get(tutulanplaka) + " - " + tutulanplaka);
			System.out.println(tahminhakki + " tahmininiz kald�.");
			return false;
		}
	}
}
