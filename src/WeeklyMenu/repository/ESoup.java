package WeeklyMenu.repository;

public enum ESoup {
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
