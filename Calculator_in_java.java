package ALLIMPCODES;

import java.util.Scanner;

public class Calculator_in_java {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            double ans = 0;
            System.out.println("Enter Number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter Number 2:");
            int num2 = sc.nextInt();
            System.out.println("Enter Operator:\n" +
                    "Enter 1 FOR ADDITION                           ENTER 2 FOR SUBTRACTION\n" +
                    "Enter 3 FOR MULTIPLICATION                     ENTER 4 FOR DIVISION\n");
            int ope = sc.nextInt();

            switch (ope){
                case 1:
                    ans = num1+num2;
                    break;

                case 2:
                    ans = num1-num2;
                    break;

                case 3:
                    ans = num1*num2;
                    break;

                case 4:
                    ans = num1/num2;
                    break;

                default:
                    ans = 0000;
                    System.out.println("Enter Valid Number For Operator");
                    break;
        }
        System.out.println("Answer Is "+ans);

        }catch (Exception e){
            System.out.println("Enter Valid Number Format: ");
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");

    }
}
