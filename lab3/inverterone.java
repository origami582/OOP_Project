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
public class inverterone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int get,most = 0,low = 0;
        boolean first = true;
        while (true){
            System.out.print("Enter a number (-1 to stop): ");
            get = sc.nextInt();
            if (get == -1){
                break;
            }
            if (first){
                most = get;
                low = get;
                first = false;
                continue;
            }
            if (get >most && get > low){
                most = get;
            }
            else if (get < low && get < most){
                low = get;
            }
        }
        if (!first){
        System.out.println();
        System.out.println("Maximum = "+ most);
        System.out.println("Minimum = "+ low );   
        }
        else{
        System.out.println("No numbers were entered.");

        }
    }
}
