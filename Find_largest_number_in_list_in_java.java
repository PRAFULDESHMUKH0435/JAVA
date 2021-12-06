package ALLIMPCODES;

import java.util.Scanner;

public class Find_largest_number_in_list_in_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("How Many Elements You Want To Add:  ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int decr = size;
        int max= 0;

        for (int i=0;i<size;i++){
            System.out.println("Enter Number "+decr-- +" : ");
            numbers[i] = sc.nextInt();
        }

        for (int e:numbers){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The Biggest Number Present In List Is "+max);

        }catch (Exception e){
            System.out.println("Please Enter Valid Number Format\n" +
                    "Try Again ");
            sc.close();
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");
    }
}
