package Assignments;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// Kullan�c�dan tek say�, matrisin boyutlar� al�nmal� matris olu�turulmal�
		// Matris diyagonalinin �st� kullan�c�n�n girdi�i tek say�lardan,
		// alt� 1'lerden, diyagonal elemanlar girilen tek say� ile 1'in ortalamas�na
		// e�it olmal�
		// 5 9 9 9
		// 1 5 9 9
		// 1 1 5 9
		// 1 1 1 5

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("Tek say� girin: ");
			num = scanner.nextInt();
			if (num % 2 == 1)
				break;
			else
				System.out.println("Hatal� de�er girdiniz...");
		}
		System.out.print("Matris sat�r say�s�: ");
		int matrixx = scanner.nextInt();
		System.out.print("Matris s�tun say�s�: ");
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
