package Assignments;

public class ArrayFindingMultipleMembers {

	public static void main(String[] args) {
		// Bir dizi içerisinde tekrar eden elemanlarýn kaç kere tekrar ettiðinin
		// bulunmasý
		int[] nums = { 1, 0, 5, 6, 8, 6, 10, 5, 10, 2, 0, 8, 1, 2, 0, 4, 4, 4 };
		int[][] multinums = new int[nums.length][2];
		for (int i = 0; i < multinums.length; i++) {
			multinums[i][0] = Integer.MIN_VALUE;
		}
		int k = 0;
		int l = 1;
		boolean hascheck = false;
		System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					for (int m = 0; m < i; m++) {
						if (nums[i] == nums[m])
							hascheck = true;
					}
					if (!hascheck) {
						multinums[k][0] = nums[j];
						multinums[k][1] = ++l;
					}
				}
			}
			if (nums[i] == multinums[k][0])
				k++;
			l = 1;
			hascheck = false;
		}
		for (int i = 0; i < k; i++) {
			System.out.println(multinums[i][0] + " sayýsý " + multinums[i][1] + " kere tekrar etmiþtir.");
		}
	}

}
