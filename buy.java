/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author origami582
 */
import java.util.Scanner;
public class buy {
    public static void main(String[] args) {
        Scanner Buyy = new Scanner(System.in);
        System.out.print("Money");
        double money = Buyy.nextDouble();
        int Stamp = (int) (money / 50);
        if (money == (int)money){
            System.out.println((int)money);
        }
        else{
            System.out.println(money);
        }
        System.out.println("You got "+Stamp+" stamp(s)");
    }
}

