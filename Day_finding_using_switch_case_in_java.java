package ALLIMPCODES;

import java.util.Scanner;

public class Day_finding_using_switch_case_in_java {
    public static void main(String[] args) {

        try {
        Scanner sc = new Scanner(System.in);
        String ans = " ";
        System.out.println("Enter Number We Will Tell You A Day: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                ans = "Monday";
                break;

            case 2:
                ans = "Tuesday";
                break;

            case 3:
                ans = "Wednesday";
                break;

            case 4:
                ans = "Thursday";
                break;

            case 5:
                ans = "Friday";
                break;

            case 6:
                ans = "Saturday";
                break;

            case 7:
                ans = "Sunday";
                break;

            default:
                ans = "Invalid Day , Day Not Exist";
                break;

        }
        System.out.println("Today Is "+ans);

        }catch (Exception e){
            System.out.println("Please Enter Valid Number  Format\n" +
                    "Retry Again");
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");

    }
}
