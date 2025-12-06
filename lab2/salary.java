package lab2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author origami582
 */
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float monny = sc.nextFloat();
        float tax;
        if (monny > 50000){
            tax = monny * 10 / 100 ;
        }
        else{
            tax = monny * 5 / 100 ;
        }
        System.out.println(tax);
    }
}
