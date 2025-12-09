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
public class newtap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        String text ="";
        for (int i = 1 ; i<=num ; i++){
            if (i %5 == 0){
                text += "|";
                System.out.print(text);
                System.out.println();
                text = "";
            }
            else{
                text += "|";
            }
        }
        System.out.println(text);
    }
}
