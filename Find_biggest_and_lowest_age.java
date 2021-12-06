package ALLIMPCODES;

import java.util.Scanner;

public class Find_biggest_and_lowest_age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age Of 1st Person : ");
        int a= sc.nextInt();
        System.out.println("Enter Age Of 2nd Person : ");
        int b= sc.nextInt();
        System.out.println("Enter Age Of 3rd Person : ");
        int c= sc.nextInt();
        int max = 0;
        int min = 0;


        if (a<b && a<c){
            min =a;
        }else if (b<c && b<a){
            min = b;
        }else {
            min = c;
        }



        if (a>b){
            if (a>c){
                max = a;
            }else {
                max=c;
            }
        }else {
            if (b>c){
                max=b;
            }else {
                max=c;
            }
        }
        System.out.println("The Oldest(Biggest)  Age Is: "+max);
        System.out.println("The Youngest (Lowest) Age Is : "+min);
        System.out.println();
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");
    }

}
