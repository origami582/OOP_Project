/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author origami582
 */
import java.util.Scanner;
public class amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item , paid , change, price = 0,n;
        System.out.print("Enter number of items: ");
        item = sc.nextInt();
        for (int i = 1; i <= item ; i++){
            System.out.print("Enter price for item "+ i +": ");
            n = sc.nextInt();
            price += n;
        }
        System.out.println("Total = "+ price);
        System.out.println();
        System.out.print("Enter amount paid: ");
        paid = sc.nextInt();
        change = paid - price;
        System.out.println("Change = "+change);
    }
}
