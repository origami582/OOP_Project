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
public class salary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.next();
        System.out.print("Please insert your age : ");
        int work,absent,weight,age,salary=0;
        age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        work = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        absent = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextInt();
        if (age <= 30 || age >= 21 ){
            salary += (work * 300) - (absent * 50);
        }
        else if (age >= 31 || age <= 40){
            salary += (work * 500) - (absent * 50);
        }
        else if (age >=41 || age <=50){
            salary += (work * 1000) - (absent * 25);
        }
        else if (age >= 51 || age <= 60){
            salary += (work * 3000);
        }
        System.out.println("Hi, "+ name);
        System.out.println("Your salary is "+salary+" Baht");
        if (weight >=10 || weight <=60){
            salary += 5000;
        }
        else if (weight >=61 || weight <= 90){
            salary += 5000 - ((weight-60) * 10);
        }
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
}
