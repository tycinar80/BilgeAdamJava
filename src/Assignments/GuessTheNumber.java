package Assignments;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// SETUP
		String name = "**********************\n" + "**********************\n" + "***////////\\\\\\\\\\\\\\\\***\n"
				+ "***//Sayý Bulmaca\\\\***\n" + "***\\\\\\\\\\\\\\\\////////***\n" + "**********************\n"
				+ "**********************\n";
		String[] gmenu = { "\n1. Oyun Oyna\n" + "2. Oyundan Çýk\n", "\n1. Tekrar Oyna\n" + "2. Oyundan Çýk\n" };
		String gexit = "Oyundan çýkýlýyor.....";
		String gstart = "Oyun baþlýyor.....";
		int nmax = 100;
		int nmin = 0;
		int ntarget = 0;
		int choose = 0;
		boolean check = true;
		int lifefull = 6; // Tahmin sayýsý
		int life = lifefull;
		int nguess = 0;
		int nplay = 1;
		String[] zerodigit = { "0", "" };
		int zerodigitnum = 0;
		String gnum = "";
		String drawlifefull = "/*/*/*/*\\*\\*\\*\\\n" + "Tahmin Hakký:" + lifefull + "\n\\*\\*\\*\\*/*/*/*/\n";
//		*********

// UPDATE&DRAW
//		System.out.println(drawlifefull);
		// Wait
		for (int i = 0; i < name.length(); i++) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.print(name.charAt(i));
		}

		// Wait
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (check) {
			if (nplay - 1 == 0) {
				// Wait
				for (int i = 0; i < gmenu[0].length(); i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(gmenu[0].charAt(i));
				}

			} else {
				// Wait
				for (int i = 0; i < gmenu[1].length(); i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(gmenu[1].charAt(i));
				}
			}

			System.out.print("\nLütfen seçim yapýn: ");
			choose = scanner.nextInt();
			System.out.println(); // \n
			// Wait
			if (choose != 2) {
				for (int i = 0; i < drawlifefull.length(); i++) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(drawlifefull.charAt(i));
				}
			}
			switch (choose) {
			case 1: { // GAME LOOP
				// Wait
				for (int i = 0; i < gstart.length(); i++) {
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(gstart.charAt(i));
				}
				System.out.println(); // \n
				if (nplay > 9)
					zerodigitnum = 1;
				gnum = "\n**************\n" + "***" + zerodigit[zerodigitnum] + (nplay) + ". Oyun" + "***\n"
						+ "**************\n";
				// Wait
				for (int i = 0; i < gnum.length(); i++) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(gnum.charAt(i));
				}
				ntarget = (int) Math.floor(Math.random() * (nmax - nmin + 1) + nmin);
//				System.out.println(ntarget); // Aranan Sayý
				life = lifefull;
				for (; life > 0; life--) {
					System.out.println();
					System.out.print("Hadi tahmin edin: ");
					nguess = scanner.nextInt();
					// Wait
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (nguess == ntarget) {
						life--;
						System.out.println("\n****************************************");
						System.out.println("(:Tebrikler Doðru Tahmin Ettiniz.:)");
						if (life > 0)
							System.out.println(ntarget + " sayýsýný, " + (lifefull - life) + ". tahminde buldunuz.");
						else
							System.out.println(ntarget + " sayýsýný, sonuncu tahminde buldunuz.");
						System.out.println("****************************************");
						nplay++;
						break;
					} else {
						System.out.println("\n****************************************");
						System.out.println("Hay aksi yanlýþ tahmin.");
						if (life - 1 > 0)
							System.out.println((life - 1) + " adet tahmininiz kaldý.");
						if (0 < nguess - ntarget && nguess - ntarget <= 10 && life - 1 > 0)
							System.out.println("\nÇok yaklaþtýn. Tahminini azalt.");
						if (0 < ntarget - nguess && ntarget - nguess <= 10 && life - 1 > 0)
							System.out.println("\nÇok yaklaþtýn. Tahminini arttýr.");
						System.out.println("****************************************");
					}
					if (life - 1 == 0) {
						System.out.println("\n):Üzgünüm tüm haklarýnýz bitti.:(");
						System.out.println("****************************************");
						nplay++;
					}
				}
				break;
			}
			case 2: // EXIT
				// Wait
				for (int i = 0; i < gexit.length(); i++) {
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.print(gexit.charAt(i));
				}

				check = false;
				break;

			}
		}
		scanner.close();
		// *******************

	}

}
