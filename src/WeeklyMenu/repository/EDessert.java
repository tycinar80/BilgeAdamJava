package WeeklyMenu.repository;

public enum EDessert {
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
