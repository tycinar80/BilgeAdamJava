package Product;

import java.time.LocalDate;

/*
 * 
 * 
 * iki tane özellik 
 * isim birde fiyatý 
 * 
 * urun yarat metodu 
 * dýþarýdan scanner ile isim ve fiyat deðerlerini alacaðýz
 *  koþul oluþturacaðýz eðer urunun ismi yok ise veya urunun fiyatý 0 dan küçük ise bize null 
 *  eðer ikisi bu kontrolleri geçiyorsa bize yeni bir urun yaratýp o urunu donsun 
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
