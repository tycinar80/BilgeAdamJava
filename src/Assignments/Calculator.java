package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String menu = "\n==Hesap Makinesi==\n" + "1- Topla\n" + "2- Çýkar\n" + "3- Çarp\n" + "4- Böl\n"
				+ "5- Faktöriyel\n" + "6- Üs Hesaplama\n" + "7- Asal Kontrolü\n" + "0- Çýkýþ\n"
				+ "\nBir iþlem seçiniz: ";
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
				break;
			case 7:
				asalMi();
				break;
			case 0:
				break;
			default:
				System.out.println("*******************");
				System.out.println("Hatalý deðer girdiniz!");
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
			System.out.print(counter + ". Sayý: ");
			num = scanner.nextInt();
			scanner.nextLine();
			sum += num;

			System.out.print("Sayý girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet sayýnýn toplamý: " + sum);
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
			System.out.print(counter + ". Sayý: ");
			num = scanner.nextInt();
			scanner.nextLine();
			if (counter == 1)
				sum += num;
			else
				sum -= num;
			System.out.print("Sayý girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet sayýnýn farký: " + sum);
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
			System.out.print(counter + ". Sayý: ");
			num = scanner.nextInt();
			scanner.nextLine();
			sum *= num;

			System.out.print("Sayý girmek istiyor musunuz(E/H)?: ");
			yesNoQ = scanner.nextLine();
			if (!yesNoQ.equalsIgnoreCase("E"))
				check = false;
			else
				counter++;
		}
		System.out.println("*******************");
		System.out.println(counter + " adet sayýnýn çarpýmý: " + sum);
		System.out.println("*******************");
	}

	public static void bolme() {
		Scanner scanner = new Scanner(System.in);
		float sum = 1;
		float numOne = 0;
		float numTwo = 0;

		System.out.println("X / Y");
		System.out.print("X Sayýsý: ");
		numOne = scanner.nextFloat();
		System.out.print("Y Sayýsý: ");
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
			System.out.print("\nSayý Girin: ");
			numOne = scanner.nextInt();
			scanner.nextLine();
			if (0 <= numOne)
				check = false;
			else
				System.out.println("Hatalý deðer girdiniz!");
		}
		for (int i = numOne; i > 1; i--) {
			sum *= i;
		}

		System.out.println("*******************");
		System.out.println(numOne + " sayýsýnýn faktöriyeli: " + sum);
		System.out.println("*******************");
	}

	public static void asalMi() {
		Scanner scanner = new Scanner(System.in);
		int numOne = 0;
		boolean check = true;
		int counter = 0;
		while (check) {
			System.out.print("\nSayý Girin: ");
			numOne = scanner.nextInt();
			scanner.nextLine();
			if (2 <= numOne)
				check = false;
			else
				System.out.println("Hatalý deðer girdiniz!");
		}
		for (int i = (int) (Math.sqrt(numOne)) + 1; i > 1; i--) {
			if (numOne % i == 0) {
				counter++;
				break;
			}
		}

		System.out.println("*******************");
		if (counter == 0 || numOne == 2)
			System.out.println(numOne + " sayýsý asal sayýdýr.");
		else
			System.out.println(numOne + " sayýsý asal sayý deðildir.");
		System.out.println("*******************");
	}
}
