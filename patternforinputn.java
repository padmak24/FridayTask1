package FridayTask1;

import java.util.Scanner;

public class patternforinputn {
    public static void starPattern(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print(" ");
        for (j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}

    public static void main(String args[]) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to display the no,of patterns");
         n = input.nextInt();
        starPattern(n);
    }

}
