package ALLIMPCODES;

import java.util.Scanner;

public class Find_max_of_3_numbers_in_java {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b=sc.nextInt();
        System.out.println("Enter Number 3: ");
        int c=sc.nextInt();
        int result = 0;

        if (a>b){
            if (a>c){
                result = a;
            }else {
                result = c;
            }
        }else {
            if (b>c){
                result = b;
            }else {
                result = c;
            }
        }
        System.out.println("The Bigger Number Is :"+result);

        }catch (Exception e){
            System.out.println("Please Enter Valid Number ");
            System.out.println("Play Again");
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");

    }
}
