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
public class onepund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scc = 0 , amount = 0 , get;
        while (true){
            System.out.print("Enter deposit amount: ");
            get = sc.nextInt();
            amount += get;
            scc += 1;
            if (amount >= 1000){
                break;
            }
            
            
            
        }
        System.out.println();
        System.out.println("Target reached!");
        System.out.println("Total amount saved = "+ amount);
        System.out.println("Number of deposits = "+ scc);
    }
}
