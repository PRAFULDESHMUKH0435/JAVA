package ALLIMPCODES;

import java.util.Scanner;

public class Table_printing_of_any_number_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Whose Table You Want To Print: ");
        int num = sc.nextInt();

        System.out.println("The Table Of "+num + " Is As Follows: ");
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");
    }
}
