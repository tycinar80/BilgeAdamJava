package WeeklyMenu.repository;

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
