/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;

public class Player{
    public String name;
    public String symbol;
    public boolean isMyTurn;
    public int wins;
    
    public class player{
        
    }
    
    public String GetName()
    {
        return name;
    }
    
    public int GetWins()
    {
        return wins;
    }
    
    public void CambiarTurno()
    {
        this.isMyTurn = !isMyTurn;
    }
    
    public void AumentarVictorias(Player player){
        int victorias = player.wins;
        victorias++;
        player.wins = victorias;
    }
    
    public void burla(){
        System.out.println("Bien jugado");
    }
    
}