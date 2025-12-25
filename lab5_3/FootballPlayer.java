/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_3;

/**
 *
 * @author origami582
 */
public class FootballPlayer extends Player {
    private int playerNumber ;
    private String position ;
    
    public int getPlayerNumber(){
        return playerNumber ;
    }
    
    public String getPosition(){
        return position ;
    }
    
    public void setPlayerNumber(int n){
        playerNumber = n ;
    }
    
    public void setPosition(String p){
        position = p ;
    }
    
    public boolean isSamePosition(FootballPlayer p){
        return this.getTeam().equals(p.getTeam()) &&
               this.position.equals(p.getPosition());
    }
}
