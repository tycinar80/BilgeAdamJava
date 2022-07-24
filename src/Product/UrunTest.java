package Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class UrunTest {

	List<Urun> urunList = new ArrayList<Urun>();
	Stream<Urun> tGUListesi;
	Stream<Urun> zUListesi;

	public static void main(String[] args) {
		UrunTest test = new UrunTest();

		for (int i = 0; i < 3; i++) {
//			Urun urun = test.urunYarat();
//			test.listeyeEkle(Optional.ofNullable(urun));

			test.listeyeEkle(test.urunYarat2());
		}

		System.out.println("Ürün listesi");
		test.urunList.forEach(s -> System.out.println(s.isim));

		test.tarihiGecmisUrunlerListesi();
		System.out.println("Son Kullanma Tarihi Geçmiþ Ürünlerin Listesi");
		test.tGUListesi.forEach(s -> System.out.println(s));
		test.zamYap(30);
		System.out.println("Zamlý Ürünlerin Listesi");
		test.zUListesi.forEach(s -> System.out.println(s));

	}

	public void listeyeEkle(Optional<Urun> urun) {

		if (urun.isPresent()) {
			urunList.add(urun.get());
		}

	}

	public Urun urunYarat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen urun fiyatý giriniz");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Son Kullanma Tarihi(Yýl-Ay-Gün): ");
		LocalDate sonKullanmaTarihi = LocalDate.parse(scanner.nextLine());

		if (isim.equals("") || fiyat <= 0) {

			return null;
		} else {
			return new Urun(isim, fiyat, sonKullanmaTarihi);
		}

	}

	public Optional<Urun> urunYarat2() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir isim giriniz: ");
		String isim = scanner.nextLine();
		System.out.print("Lütfen urun fiyatý giriniz: ");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Son Kullanma Tarihi(Yýl-Ay-Gün): ");
		LocalDate sonKullanmaTarihi = LocalDate.parse(scanner.nextLine());

		if (isim.equals("") || fiyat <= 0) {

			return Optional.ofNullable(null);
		} else {
			return Optional.of(new Urun(isim, fiyat, sonKullanmaTarihi));
		}

	}

	public Stream<Urun> tarihiGecmisUrunlerListesi() {
		LocalDate bugunTarihi = LocalDate.now();
		tGUListesi = urunList.stream().filter(s -> s.getSonKullanmaTarihi().isBefore(bugunTarihi)); // .collect(Collectors.toList())

		return tGUListesi;
	}

	public Stream<Urun> zamYap(int zamOrani) {
		zUListesi = urunList.stream().map(s -> {
			s.setFiyat(s.getFiyat() + s.getFiyat() * 30 / 100);
			return s;
		}); // .collect(Collectors.toList())

		return zUListesi;
	}

}
