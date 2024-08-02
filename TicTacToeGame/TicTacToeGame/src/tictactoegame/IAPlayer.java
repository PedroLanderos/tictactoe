/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;

/**
 *
 * @author bejas
 */
public class IAPlayer extends Player implements Celebrar{
    
    public IAPlayer(){
        
    }
    
    @Override
    public String celebrar (){
        System.out.println("Las maquinas somos superiores");
        return "Mi programacion dice que eres malo";
    }
    
    @Override
    public void burla(){
        System.out.println("Mi analisis dice que eres malo");
    }
    
}
