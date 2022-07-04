package WeeklyMenu.repository;

public enum EDrinks {
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
