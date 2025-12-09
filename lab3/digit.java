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
public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop;
        System.out.print("Enter number of digits: ");
        String num = "";
        loop = sc.nextInt();
        for (int i = 1 ; i <= loop ; i++){
            System.out.print("Enter digit "+ i +": ");
            String test = sc.next();
            num += test;
        }
        System.out.println();
        System.out.println("Final Code = "+num);
    }
    
}
