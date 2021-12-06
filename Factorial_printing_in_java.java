package ALLIMPCODES;

import java.util.Scanner;

public class Factorial_printing_in_java {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number Whose Factorial You Want To Print: ");
            int num = sc.nextInt();
            int fact = 1;

        for (int i=num;i>0;i--){
            fact = fact*i;
        }

        System.out.println("The Factorial Of "+num +" Is :" +fact);
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");
    }
}
