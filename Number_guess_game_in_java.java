package ALLIMPCODES;

import java.util.Scanner;

public class Number_guess_game_in_java {
    public static void main(String[] args) {

        try {
        Scanner sc = new Scanner(System.in);
        int chance = 4;
        int random_num = (int) (Math.random()*100/2);
        do {
            System.out.println("Guess Number Between 1 to 50");
            int num = sc.nextInt();
            System.out.println();
            if (num>random_num){
                System.out.println("Please Guess Smaller Number: ");
                System.out.println("You Have  "+chance-- +" Chances Left");
            }else if (num<random_num){
                System.out.println("Please Guess Bigger Number: ");
                System.out.println("You Have  "+chance-- +" Chances Left");
            }else {
                System.out.println("Hurray You Won , Our Number Was "+random_num);
                break;
            }

        }while (random_num>0 && chance>=0);{
            System.out.println("Sorry You Lose \n" +
                    "Our Number Was "+random_num);
        }

        }catch (Exception e){
            System.out.println("Please Enter Valid Number");
            System.out.println("Play Again");
        }
        System.out.println("Thank You For Using Our System \n----Praful Deshmukh------");


    }
}
