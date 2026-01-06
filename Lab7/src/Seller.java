/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author origami582
 */
public class Seller extends Employee {
    private Food f ;
    
    public double askForPrice(){
        return f.getPrice();
    }
    
    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= f.getPrice()){
            this.getWallet().setBalance(
                this.getWallet().getBalance() + f.getPrice()
            );
            e.getWallet().setBalance(
                e.getWallet().getBalance() - f.getPrice()
            );
            return new Food();
        }
        else{
            System.out.println("Your money is not enough.");
            return null ;
        }
    }
}
