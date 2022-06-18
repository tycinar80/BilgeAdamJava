package Assignments;

import java.util.Scanner;

public class MovingStar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		SETUP
		String menu = "4 -> Sola kaydýr\n" + "6 -> Saða kaydýr\n" + "8 -> Yukarý kaydýr\n" + "2 -> Aþaðý kaydýr\n"
				+ "0 -> Çýkýþ\n";
		int edgex = 0;
		int edgey = 0;
		int movex = 0; // plus 2
		int movey = 0; // plus 2
		boolean check = true;
		int choose = 0;
//
		System.out.print("Kenar uzunluðu(birim): ");
		edgex = scanner.nextInt();
		edgey = edgex;
		movex = (edgex - 1);
		movey = (edgey - 1);
		System.out.println();
		System.out.println(menu); // Show menu
		draw(edgex, edgey, movex, movey);
		System.out.println();
//		UPDATE
		while (check) {
			System.out.print("Ýþlem: ");
			choose = scanner.nextInt();

			switch (choose) {
			case 6: // Move right
				movex = ((movex + 2) % (edgex * 2));
				break;

			case 4: // Move left
				if (movex > 0)
					movex = ((movex - 2) % (edgex * 2));
				else
					movex = edgex * 2 - 2;
				break;

			case 2: // Move top
				movey = ((movey + 2) % (edgey * 2));
				break;

			case 8: // Move buttom
				if (movey > 0)
					movey = ((movey - 2) % (edgey * 2));
				else
					movey = edgey * 2 - 2;
				break;

			case 0: // Exit
				check = false;
				System.err.print("\nOyundan çýkýlýyor...");
				break;

			default:
				break;
			}
			if (choose != 0)
				draw(edgex, edgey, movex, movey);
		}
		scanner.close();
//
	}

//		DRAW
	static void draw(int edgeX, int edgeY, int moveX, int moveY) {
		String point = ".";
		String space = " ";
		String star = "*";

		for (int i = 0; i < edgeY; i++) {
			for (int j = 0; j < edgeX; j++) {
				if (i % edgeY == (moveY % (edgeY * 2)) / 2 && j % edgeX == (moveX % (edgeX * 2)) / 2) { // Drawing star
					System.out.print(star + space);
					if (j % edgeX == (edgeX - 1)) // If star at the side move to underline
						System.out.println();
				} else if (j % edgeX == (edgeX - 1))
					System.out.println(point); // Moving underline after side
				else
					System.out.print(point + space); // Drawing horizontal points
			}
		}
	}
//
}
