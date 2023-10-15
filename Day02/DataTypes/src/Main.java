import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. Read and save an integer, double, and String to your variables.*/
        int ii = scan.nextInt();
        double dd = scan.nextDouble();
        scan.nextLine();
        String ss = scan.nextLine();
        /*Print the sum of both integer variables on a new line. */
        System.out.println(i+ii);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+dd);
         /* Concatenate and print the String variables on a new line; the 's' variable above should be printed first. */
        System.out.println(s + ss);
        scan.close();
    }
}