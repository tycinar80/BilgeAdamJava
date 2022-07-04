package WeeklyMenu.repository;

public enum EDay {
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
