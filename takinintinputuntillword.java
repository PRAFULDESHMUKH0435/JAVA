package ALLIMPCODES;

import java.util.Scanner;

public class takinintinputuntillword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or press word to exit: ");
        int inc=0;
        int total=0;
        while (sc.hasNextInt()) {
            System.out.println("Enter Number or press word to exit: ");
            System.out.println("Enter Number " + inc++ +" : ");
            int num = sc.nextInt();
            total=total+num;
        }
        System.out.println(total);
    }
}
