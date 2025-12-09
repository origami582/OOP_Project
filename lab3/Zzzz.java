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
public class Zzzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = "",al = "";
        while (true){
            System.out.print("Enter a character: ");
            String text = sc.next();
            if (text.equals("z")){
                break;
            }
            if (text.matches("[a-z]")){
                if (!text.equals("a") && !text.equals("e") && !text.equals("i") && !text.equals("o") && !text.equals("u")){
                    get += text;
                }
                al += text;
            }
            else {
                System.out.println("Invalid input. Only lowercase a-z are allowed. ");
            }
        }
        System.out.println();
        System.out.println("All characters entered: "+ al);
        System.out.println("Consonants only: " + get);
    }
}
