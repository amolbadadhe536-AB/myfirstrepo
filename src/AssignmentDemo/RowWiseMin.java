package AssignmentDemo;

import java.util.Scanner;


class RowWiseMin {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a[][] = new int[3][3];

    System.out.println("Enter 9 numbers:");

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = sc.nextInt();
        }
    }

    for (int i = 0; i < a.length; i++) {

        int min = a[i][0];

        for (int j = 1; j < a[i].length; j++) {

            if (a[i][j] < min) {
                min = a[i][j];
            }
        }

        System.out.println("Row " + (i + 1) + " Minimum = " + min);
    }

    sc.close();
}

}