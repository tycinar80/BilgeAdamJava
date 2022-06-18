package Assignments;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// Kullanýcýdan tek sayý, matrisin boyutlarý alýnmalý matris oluþturulmalý
		// Matris diyagonalinin üstü kullanýcýnýn girdiði tek sayýlardan,
		// altý 1'lerden, diyagonal elemanlar girilen tek sayý ile 1'in ortalamasýna
		// eþit olmalý
		// 5 9 9 9
		// 1 5 9 9
		// 1 1 5 9
		// 1 1 1 5

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("Tek sayý girin: ");
			num = scanner.nextInt();
			if (num % 2 == 1)
				break;
			else
				System.out.println("Hatalý deðer girdiniz...");
		}
		System.out.print("Matris satýr sayýsý: ");
		int matrixx = scanner.nextInt();
		System.out.print("Matris sütun sayýsý: ");
		int matrixy = scanner.nextInt();

		for (int i = 0; i < matrixx; i++) {
			for (int j = 0; j < matrixy; j++) {
				if (i == j)
					System.out.print((num + 1) / 2 + " ");
				else if (j > i)
					System.out.print(num + " ");
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}
	}

}
