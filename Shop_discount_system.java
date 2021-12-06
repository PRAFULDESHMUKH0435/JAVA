package ALLIMPCODES;

import java.util.Scanner;

public class Shop_discount_system {
    public static void main(String[] args) {
//        Question ------
//        A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//        Ask user for quantity
//        Suppose, one unit will cost 100.
//        Judge and print total cost for user.

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("How Many Bottles You Want To Buy ," +
                    "The Price Of Each Bottle is Rs.100 :");
            int quantity = sc.nextInt();
            int total = 100*quantity;
            int discount = total/10;
            int amount_payable = total - discount;


            if (quantity>10){
                System.out.println("Your Total Amount Is Rs. "+total +"\n" +
                        "As You Purchased The Items Worth Rs. More Than 1,000  You Got A 10% Off");
                System.out.println("Total Bill Is As Follows: \n" +
                        "Total Amount =Rs. "+total +"\n" +
                        "Discounted Amounted = Rs. "+discount + "\n" +
                        "Amount Payable  =Rs.  "+amount_payable);
            }else {
                System.out.println("Your Total Amount Is Rs. "+total +"\n" +
                        "Please Kindly Pay The Bill At Counter");
            }
            System.out.println("Thank You , Visit Again\n" +
                    "Thank You For Using Our System " +" \n----Praful Deshmukh------");

        }catch (Exception e){
            System.out.println("Please Enter Valid Number Format");
        }
    }
}
