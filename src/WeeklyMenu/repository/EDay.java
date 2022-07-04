package WeeklyMenu.repository;

public enum EDay {
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
