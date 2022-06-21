package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String menu = "\n==Hesap Makinesi==\n" + "1- Topla\n" + "2- ��kar\n" + "3- �arp\n" + "4- B�l\n"
				+ "5- Fakt�riyel\n" + "6- �s Hesaplama\n" + "7- Asal Kontrol�\n" + "0- ��k��\n"
				+ "\nBir i�lem se�iniz: ";
		int process = 0;

		do {
			System.out.print(menu);
			process = scanner.nextInt();
			System.out.println();
			switch (process) {
			case 1:
				topla();
				break;
			case 2:
				cikar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bolme();
				break;
			case 5:
				faktoriyel();
				break;
			case 6:
				usBulma();
				break;
			case 7:
				asalMi();
				break;
			case 0:
				break;
			default:
				System.out.println("*******************");
				System.out.println("Hatal� de�er girdiniz!");
				System.out.println("*******************");
				break;
			}

		} while (process != 0);

	}

	public static void topla() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		int num = 0;
		boolean check = true;
		String yesNoQ;
		while (check) {
			System.out.print(counter + ". Say�: ");
			num = scanner.nextInt();
			scanner.nextLine();
			sum += num;

			System.out.print("Say� girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet say�n�n toplam�: " + sum);
		System.out.println("*******************");
	}

	public static void cikar() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		int num = 0;
		boolean check = true;
		String yesNoQ;
		while (check) {
			System.out.print(counter + ". Say�: ");
			num = scanner.nextInt();
			scanner.nextLine();
			if (counter == 1)
				sum += num;
			else
				sum -= num;
			System.out.print("Say� girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet say�n�n fark�: " + sum);
		System.out.println("*******************");
	}

	public static void carp() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		int sum = 1;
		int num = 0;
		boolean check = true;
		String yesNoQ;
		while (check) {
			System.out.print(counter + ". Say�: ");
			num = scanner.nextInt();
			scanner.nextLine();
			sum *= num;

			System.out.print("Say� girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet say�n�n �arp�m�: " + sum);
		System.out.println("*******************");
	}

	public static void bolme() {
		Scanner scanner = new Scanner(System.in);
		float sum = 1;
		float numOne = 0;
		float numTwo = 0;

		System.out.println("X / Y");
		System.out.print("X Say�s�: ");
		numOne = scanner.nextFloat();
		System.out.print("Y Say�s�: ");
		numTwo = scanner.nextFloat();
		scanner.nextLine();
		sum = numOne / numTwo;

		System.out.println("*******************");
		System.out.println(numOne + " / " + numTwo + " = " + sum);
		System.out.println("*******************");
	}

	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		int sum = 1;
		int numOne = 0;
		boolean check = true;
		while (check) {
			System.out.print("\nSay� Girin: ");
			numOne = scanner.nextInt();
			scanner.nextLine();
			if (0 <= numOne)
				check = false;
			else
				System.out.println("Hatal� de�er girdiniz!");
		}
		for (int i = numOne; i > 1; i--) {
			sum *= i;
		}

		System.out.println("*******************");
		System.out.println(numOne + " say�s�n�n fakt�riyeli: " + sum);
		System.out.println("*******************");
	}

	public static void asalMi() {
		Scanner scanner = new Scanner(System.in);
		int numOne = 0;
		boolean check = true;
		int counter = 0;
		while (check) {
			System.out.print("\nSay� Girin: ");
			numOne = scanner.nextInt();
			scanner.nextLine();
			if (2 <= numOne)
				check = false;
			else
				System.out.println("Hatal� de�er girdiniz!");
		}
		for (int i = (int) (Math.sqrt(numOne)) + 1; i > 1; i--) {
			if (numOne % i == 0) {
				counter++;
				break;
			}
		}

		System.out.println("*******************");
		if (counter == 0 || numOne == 2)
			System.out.println(numOne + " say�s� asal say�d�r.");
		else
			System.out.println(numOne + " say�s� asal say� de�ildir.");
		System.out.println("*******************");
	}

	public static void usBulma() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		int k = 0;
		int num = 0;
		int numTemp = 0;
		boolean check = true;
		int[] divider = { 0 };
		int[] pow = { 0 };
		int[] dividerCheck = { 0 };
		while (check) {
			System.out.print("\nSay� Girin: ");
			num = scanner.nextInt();
			scanner.nextLine();
			if (1 < num)
				check = false;
			else
				System.out.println("Hatal� de�er girdiniz!");
		}
		numTemp = num;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				if (dividerCheck[k] == 0) {
					divider[k] = i;
					pow[k] = counter;
					dividerCheck[k] = 1;
					num /= i;
					counter++;

				} else {
					num /= i;
					pow[k] = counter;
					counter++;
				}

				i--;
			} else {
				counter = 1;
				if (dividerCheck[k] != 0) {
					k++;
					divider = arrayExpand(divider, 0);
					pow = arrayExpand(pow, 0);
					dividerCheck = arrayExpand(dividerCheck, 0);
				}
			}

		}
		System.out.println("*******************");
		System.out.print(numTemp + " = ");
		if (k > 1) {
			for (int i = 0; i < k; i++) {
				System.out.print(divider[i] + "^" + pow[i] + " * ");
			}
			System.out.println(divider[k] + "^" + pow[k]);
		} else
			System.out.println(divider[k] + "^" + pow[k]);
		System.out.println("*******************");
	}

	public static int[] arrayExpand(int[] arrayOld, int value) {
		int[] arrayNew = new int[arrayOld.length + 1];
		for (int i = 0; i < arrayOld.length; i++) {
			arrayNew[i] = arrayOld[i];
		}
		arrayNew[arrayOld.length] = value;
		return arrayNew;
	}
}
