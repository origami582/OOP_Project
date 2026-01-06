
public class Employee {
    private int energy ;
    private String name ;
    private Wallet wallet ;
    private static String nationality = "Thai";
    
    public int getEnergy(){
        return energy;
    }
    
    public String getName(){
        return name;
    }
    
    public static String  getNationality(){
        return nationality ;
    }
    
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public Wallet getWallet(){
        return wallet ;
    }
    
    public void setEnergy(int energy){
        this.energy = energy ;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet ;
    }
    
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if (food != null){
            eat(food);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy() ;
    }
    
    public boolean equals(Employee e){
        if (e == null){
            return false;
        }
        return this.name.equals(e.getName());
    }
    @Override
    public String toString(){
        return "My name is "+ name + ". \nI have " + energy + " energy left.\nI have a balance of " + wallet.getBalance() + " baht.";
        
    }
}