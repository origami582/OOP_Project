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
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp,hum;
        System.out.print("Enter temperature (°C): ");
        temp = sc.nextDouble();
        System.out.print("Enter humidity (%): ");
        hum = sc.nextDouble();
        System.out.println("");
        if (temp > 37.5){
            System.out.println("Warning: High temperature!");
        }
        else{
            System.out.println("Temperature normal.");
        }
        if (hum >80){
            System.out.println("Humidity is too high.");
        }
        else{
            System.out.print("Humidity is acceptable.");
        }
    }
}

