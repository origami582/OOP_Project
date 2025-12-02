/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author origami582
 */
import java.util.Scanner;
public class tryhard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt("Enter your exercise time 1"), t2 = sc.nextInt("Enter your exercise time 2") , Hour=0 , Min=0 ,Second=0 ;
        int First = t1 + t2;
        Hour = First / 3600;
        First %= 3600;
        Min = First / 60;
        Second = First % 60;
        System.out.println("It is "+ Hour +" hours "+Min+" minutes and "+Second+" seconds.");
    }
}

