package WeeklyMenu.repository;

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
