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
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put,ev = 0,od = 0;
        while (true){
            put = sc.nextInt();
            if (put == -1){
                break;
            }
            else if (put % 2 == 0){
                ev += 1;
            }
            else{
                od += 1;
            }
        }
        System.out.println("Odd number = " + od + " and Even bumber = " + ev);
    }
}
