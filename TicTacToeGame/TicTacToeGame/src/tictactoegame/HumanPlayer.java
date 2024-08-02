/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;

/**
 *
 * @author bejas
 */
public class HumanPlayer extends Player implements Celebrar{

    public HumanPlayer() {
        
    }
    
    @Override
    public String celebrar (){
        System.out.println("Quieres llorar?");
        return "Quieres llorar?";
    }
    
    @Override
    public void burla(){
        System.out.println("Soy mmejor que ");
        
    }
    
}
