package WeeklyMenu.repository;

public enum EDessert {
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
