package ALLIMPCODES;

import java.util.Scanner;

public class SUM_of_numbers_using_array {
    public static void main(String[] args) {
//        QUESTION:
//          IN THIS QUESTION WE WILL TAKE SOME NUMBER INPUTS FROM USER AND SHOW THEM THE SUM OF THEIR NUMBERS

        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Numbers You Want To Add:  ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int decr = size;
        int sum = 0;

        for (int i=0;i<size;i++){
            System.out.println("Enter Number "+decr-- +" : ");
            numbers[i] = sc.nextInt();
        }

        for (int i=0;i<size;i++){
            sum = sum+numbers[i];
        }
        System.out.println("The Sum Of All The Numbers Entered By You Is: \n" +
                " "+sum);

        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");
    }

}
