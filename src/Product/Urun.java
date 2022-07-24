package Product;

import java.time.LocalDate;

/*
 * 
 * 
 * iki tane �zellik 
 * isim birde fiyat� 
 * 
 * urun yarat metodu 
 * d��ar�dan scanner ile isim ve fiyat de�erlerini alaca��z
 *  ko�ul olu�turaca��z e�er urunun ismi yok ise veya urunun fiyat� 0 dan k���k ise bize null 
 *  e�er ikisi bu kontrolleri ge�iyorsa bize yeni bir urun yarat�p o urunu donsun 
 * 
 * 
 * Son kullanma tarihi Localdate
 * 
 */

public class Urun {
	String isim;
	double fiyat;
	LocalDate sonKullanmaTarihi;

	public Urun(String isim, double fiyat, LocalDate sonKullanmaTarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	@Override
	public String toString() {
		return "isim=" + isim + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public LocalDate getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

}
