package WeeklyMenu.repository;

public enum ESoup {
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
