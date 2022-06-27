package CodingMarathonOne;

public class Main {
	static Array array;
	static Aritmetik aritmetik;
	static CustomStringTR stringTR;

	public static void main(String[] args) {
		float[] sayilar = { 0f, 1f, 2f, 3f, 4f, 5f };
		array = new Array();
		aritmetik = new Aritmetik();
		stringTR = new CustomStringTR();

//		aritmetik.topla(aritmetik.sayiGir());

//		aritmetik.topla2(1, 2, 3);
		stringTR.string = "abcdade ga";
		System.out.println(stringTR.string.indexOf("a", 5));
		;
	}

}
