package WeeklyMenu.repository;

public interface Constance {

	enum EDay {
		PAZARTESI("PAZARTES�"), SALI("SALI"), CARSAMBA("�AR�AMBA"), PERSEMBE("PER�EMBE"), CUMA("CUMA"),
		CUMARTESI("CUMARTES�"), PAZAR("PAZAR");

		String name;

		EDay(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

	}

	enum EDessert {
		KUNEFE("K�NEFE"), TRILICE("TR�L��E"), KABAK("KABAK TATLISI"), TEL_KADAYIF("TEL KADAYIF"),
		TULUMBA("TULUMBA TATLISI"), KAZANDIBI("KAZAND�B�"), KESKUL("KE�K�L"), SAKIZLI_MUHALLEBI("SAKIZLI MUHALLEB�");

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
		GAZOZ("GAZOZ"), KOLA("KOLA"), MEYVE_SUYU("MEYVE SUYU"), SALGAM("�ALGAM"), MEYVELI_GAZOZ("MEYVEL� GAZOZ"),
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
		KURU_FASULYE("KURU FAS�LYE"), KAPUSKA("KAPUSKA"), SAKSUKA("�AK�UKA"), ROSTO("ROSTO"), MUCVER("M�CVER"),
		SEBZE_TURLU("SEBZE T�RL�"), CILBIR("�ILBIR"), KOFTE_PIYAZ("K�FTE P�YAZ");

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
		MERCIMEK("MERC�MEK �ORBASI"), EZOGELIN("EZOGEL�N �ORBASI"), DOMATES("DOMATES �ORBASI"),
		KREMALI_MANTAR("KREMALI MANTAR �ORBASI"), TARHANA("TARHANA �ORBASI"), TAVUK_SUYU("TAVUK SUYU �ORBA"),
		KELLE_PACA("KELLE PA�A �ORBASI"), ANALI_KIZLI("ANALI KIZLI �ORBA");

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
