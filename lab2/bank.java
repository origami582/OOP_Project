/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author origami582
 */
import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        int monney = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String type = sc.next();
        double doog, al;
        if (type.equals("A") || type.equals("C")){
            doog = monney * 1.5 / 100;
        }
        else if (type.equals("B")){
            doog = monney * 2 / 100;
        }
        else if (type.equals("X")){
            doog = monney * 5 / 100;
        }
        else {
            return;
        }
        al = monney + doog;
        System.out.println("Your total money in one year = "+ (int)al);
        
    }
}
