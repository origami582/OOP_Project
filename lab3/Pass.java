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
public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter password: ");
            String pass = sc.next();
            if (pass.equals("PASS2025")){
                System.out.print( "Access granted.");
                break;
            }
            else{
                System.out.println("Try again.");
            }
        }
    }
    
}
