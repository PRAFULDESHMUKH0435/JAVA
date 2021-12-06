package ALLIMPCODES;

import java.util.Scanner;

public class REVERSE_ANY_NUMBER_IN_JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Long 5 to 6 Digit Number: ");
        int number = sc.nextInt();
        int rev ;


        System.out.println("The Reverse Of Number " +number +" Is: ");
        while (number>0){
            rev = number%10;
            System.out.print(rev);
            number = number/10;
        }
        System.out.println("\nThank You For Using Our System \n----Praful Deshmukh------");
    }
}
