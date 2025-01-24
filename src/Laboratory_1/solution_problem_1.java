package Laboratory_1;

import java.util.Scanner;

public class solution_problem_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b = scanner.nextInt();
        int b1 = scanner.nextInt();

       if ((a > a1 && b > b1 && a1 > b1) || (a < a1 && b < b1 && b < a1)) {
          System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }

    }
}
