package WeeklyMenu.repository;

public interface Constance {

	enum EDay {
		PAZARTESI("PAZARTESÝ"), SALI("SALI"), CARSAMBA("ÇARÞAMBA"), PERSEMBE("PERÞEMBE"), CUMA("CUMA"),
		CUMARTESI("CUMARTESÝ"), PAZAR("PAZAR");

		String name;

		EDay(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

	}

	enum EDessert {
		KUNEFE("KÜNEFE"), TRILICE("TRÝLÝÇE"), KABAK("KABAK TATLISI"), TEL_KADAYIF("TEL KADAYIF"),
		TULUMBA("TULUMBA TATLISI"), KAZANDIBI("KAZANDÝBÝ"), KESKUL("KEÞKÜL"), SAKIZLI_MUHALLEBI("SAKIZLI MUHALLEBÝ");

		String name;

		EDessert(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	enum EDrinks {
		GAZOZ("GAZOZ"), KOLA("KOLA"), MEYVE_SUYU("MEYVE SUYU"), SALGAM("ÞALGAM"), MEYVELI_GAZOZ("MEYVELÝ GAZOZ"),
		SODA("SODA");

		private String name;

		EDrinks(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public enum EMeal {
		KURU_FASULYE("KURU FASÜLYE"), KAPUSKA("KAPUSKA"), SAKSUKA("ÞAKÞUKA"), ROSTO("ROSTO"), MUCVER("MÜCVER"),
		SEBZE_TURLU("SEBZE TÜRLÜ"), CILBIR("ÇILBIR"), KOFTE_PIYAZ("KÖFTE PÝYAZ");

		String name;

		EMeal(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	enum ESoup {
		MERCIMEK("MERCÝMEK ÇORBASI"), EZOGELIN("EZOGELÝN ÇORBASI"), DOMATES("DOMATES ÇORBASI"),
		KREMALI_MANTAR("KREMALI MANTAR ÇORBASI"), TARHANA("TARHANA ÇORBASI"), TAVUK_SUYU("TAVUK SUYU ÇORBA"),
		KELLE_PACA("KELLE PAÇA ÇORBASI"), ANALI_KIZLI("ANALI KIZLI ÇORBA");

		String name;

		ESoup(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	final int drink = 6;
	final int meal = 8;
	final int soup = 8;
	final int dessert = 8;
	final int day = 7;

	public void haftalikMenuOlustur();

	public int rastgeleSayiUret(int i);

	enum icecek {
		GAZOZ("GAZOZ"), SODA("SODA");

		icecek(String string) {
			// TODO Auto-generated constructor stub
		}
	}
}
