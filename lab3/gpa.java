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
public class gpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st,excellent = 0 , good = 0 , fair = 0 , poor = 0;
        System.out.print("Enter number of students: ");
        st = sc.nextInt();
        for (int i = 1 ; i <= st ; i++){
            System.out.print("Enter score for student "+ i +": ");
            int grade = sc.nextInt();
            if (grade >= 80){
                excellent += 1;
                System.out.println("Excellent");
            }
            else if (grade >= 60 && grade <= 79){
                good += 1;
                System.out.println("Good");
            }
            else if (grade >= 50 && grade <=59){
                fair += 1;
                System.out.println("Fair");
            }
            else{
                poor += 1;
                System.out.println("Poor");
            }
        }
        System.out.println();
        System.out.println("Summary:");
        System.out.println("Excellent: "+ excellent);
        System.out.println("Good: "+ good);
        System.out.println("Fair: "+ fair);
        System.out.println("Poor: "+ poor);
    }
}
