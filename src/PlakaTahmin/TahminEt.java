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
		plaka.put(2, "Adıyaman");
		plaka.put(3, "Afyonkarahisar");
		plaka.put(4, "Ağrı");
		plaka.put(5, "Amasya");
		plaka.put(6, "Ankara");
		plaka.put(7, "Antalya");
		plaka.put(8, "Artvin");
		plaka.put(9, "Aydın");
		plaka.put(10, "Balıkesir");
		plaka.put(11, "Bilecik");
		plaka.put(12, "Bingöl");
		plaka.put(13, "Bitlis");
		plaka.put(14, "Bolu");
		plaka.put(15, "Burdur");
		plaka.put(16, "Bursa");
		plaka.put(17, "Çanakkale");
		plaka.put(18, "Çankırı");
		plaka.put(19, "Çorum");
		plaka.put(20, "Denizli");
		plaka.put(21, "Diyarbakır");
		plaka.put(22, "Edirne");
		plaka.put(23, "Elazığ");
		plaka.put(24, "Erzincan");
		plaka.put(25, "Erzurum");
		plaka.put(26, "Eskişehir");
		plaka.put(27, "Gaziantep");
		plaka.put(28, "Giresun");
		plaka.put(29, "Gümüşhane");
		plaka.put(30, "Hakkari");
		plaka.put(31, "Hatay");
		plaka.put(32, "Isparta");
		plaka.put(33, "Mersin");
		plaka.put(34, "İstanbul");
		plaka.put(35, "İzmir");
		plaka.put(36, "Kars");
		plaka.put(37, "Kastamonu");
		plaka.put(38, "Kayseri");
		plaka.put(39, "Kırkareli");
		plaka.put(40, "Kırşehir");
	}

	public void girisEkrani() {
		System.out.println("************************");
		System.out.println("***PLAKA TAHMİN OYUNU***");
		System.out.println("************************");
		System.out.println();
		System.out.println("************************");
		System.out.println("Şehirlerin plakalarını\n" + "tahmin etmeye çalışın.\n" + "\n3 tahmin hakkınız var.");
		System.out.println("************************");

	}

	public void konsol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Oyun başlıyor...");
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
			System.out.println("Tebrikler doğru tahmin :)");
			return true;
		} else
			return tahminHakkiSay();
	}

	public boolean tahminHakkiSay() {
		tahminhakki--;
		if (tahminhakki == 0) {
			System.out.println("Üzgünüm tahmin hakkınız bitti.");
			System.out.println("Doğru cevap :" + plaka.get(tutulanplaka) + " - " + tutulanplaka);
			return true;
		} else {
			System.out.println("Doğru cevap :" + plaka.get(tutulanplaka) + " - " + tutulanplaka);
			System.out.println(tahminhakki + " tahmininiz kaldı.");
			return false;
		}
	}
}
