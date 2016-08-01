package Pro;

import java.util.Scanner;

public class AverageOfTwoPartInArray {

	public static void main(String[] args) {

		Scanner qq = new Scanner(System.in);
		System.out.println("enter size of array");
		int nn = qq.nextInt();
		int count[] = new int[nn];
		System.out.println("enter array element");
		for (int i = 0; i < nn; i++) {
			count[i] = qq.nextInt();
		}
		int sum1 = 0;
		int sum2 = 0;
		int c1 = 0;
		for (int i = 0; i < nn / 2; i++) {
			sum1 = sum1 + count[i];
			++c1;
		}
		int avg1 = sum1 / c1;
		int c2 = 0;
		for (int i = nn / 2; i < nn; i++) {
			sum2 = sum2 + count[i];
			++c2;
		}
		int avg2 = sum2 / c2;
		if (avg1 == avg2) {
			System.out.println("2part of array Average is Equal");
		} else {
			System.out.println("2partAverage is not equal");
		}
	}

}
