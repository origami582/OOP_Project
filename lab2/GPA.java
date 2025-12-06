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
public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa,monny;
        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
        System.out.print("Enter family income: ");
        monny = sc.nextDouble();
        if (gpa >=3.5){
            if (monny >= 15000){
                System.out.print("You are not eligible for a scholarship.");
            }
            else{
                System.out.print("You are eligible for the scholarship.");
            }
        }
        else{
            System.out.print("You are not eligible for a scholarship.");
        }
    }
}
