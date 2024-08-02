/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoegame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author lande
 */
public class GameManager {
    
    
    //patron singleton
    private static GameManager instancia;
    
    public static GameManager getInstance(){
        if(instancia == null){
            instancia = new GameManager();
        }
        return instancia;
    }
    //
    
    public String gameState = "Finalizado";
    
    
    public void iniciar1(){
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
    
    public void iniciar2(){
        MainMenuIA menu1 = new MainMenuIA();
        menu1.setVisible(true);
    }
    
    ArrayList<Player> jugadores = new ArrayList<>();
    
    public void AddPlayersNames(String name1, String name2) {
        if (jugadores.isEmpty()) {
            HumanPlayer player1 = new HumanPlayer();
            HumanPlayer player2 = new HumanPlayer();

            player1.name = name1;
            player2.name = name2;

            jugadores.add(player1);
            jugadores.add(player2);
         } else {
            if (jugadores.size() > 0) {
                Player player1 = jugadores.get(0);
                player1.name = name1;
            }

            if (jugadores.size() > 1) {
                Player player2 = jugadores.get(1);
                player2.name = name2;
            }
        }
    }

    public boolean ArePlayerSet() {
        return jugadores.size() == 2;
    }

    
    //esta funcion se llama solo cuando se inicie el 2v2
    public void AddPlayersSymbol(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(2) + 1;
        
        if(numeroAleatorio == 1){
            Player player1 = jugadores.get(0);
            player1.symbol = "X";
            player1.isMyTurn = true;
            Player player2 = jugadores.get(1);
            player2.symbol = "O";
            player2.isMyTurn = false;
        }
        else{
            Player player1 = jugadores.get(0);
            player1.symbol = "O";
            player1.isMyTurn = false;
            Player player2 = jugadores.get(1);
            player2.symbol = "X";
            player2.isMyTurn = true;
        }
         
        
    }
    
    void Start2v2(){
        if (jugadores.size() >= 2) {
            Player player1 = jugadores.get(0);
            Player player2 = jugadores.get(1);

            if (!player1.name.equals("Jugador 1") && !player2.name.equals("Jugador 2")) {
                gameState = "EnJuego";
                MainBoard mainboard = new MainBoard();
                mainboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa nombres válidos para los jugadores.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Necesitas al menos dos jugadores para empezar el juego.");
        }
    }
    
    void Start2v22(){
        if (jugadores.size() >= 2) {
            Player player1 = jugadores.get(0);
            Player player2 = jugadores.get(1);

            if (!player1.name.equals("Jugador") && !player2.name.equals("Jugador 2")) {
                gameState = "EnJuego";
                MainBoard mainboard = new MainBoard();
                mainboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa un nombre valido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Necesitas al menos dos jugadores para empezar el juego.");
        }
    }

    
    
    void Win(Player player1){
        JOptionPane.showMessageDialog(null, "Felicidades " + player1.name + " has ganado!");
    }
    
    void Win(Player player1, Player player2){
        JOptionPane.showMessageDialog(null, "Los jugadores " + player1.name + " y " + player2.name + " "
                + "han empatado");
    }
    
    public class ArrayListManagment {

        public void DeletePlayer1() {
            if (jugadores.size() > 0) {
                jugadores.remove(0);
                Player newPlayer = new Player();
                jugadores.add(newPlayer);
            }
        }

        public void DeletePlayer2() {
            if (jugadores.size() > 1) {
                jugadores.remove(1);
                Player newPlayer = new Player();
                jugadores.add(newPlayer);
            }
        }

        public Player ChangePlayer1Name(String name) {
            Player player = new Player();

            if (!jugadores.isEmpty()) {
                player = jugadores.get(0);
                player.name = name;
                player.wins = 0;
                player.isMyTurn = false;
            }

            return player;
        }

        public Player ChangePlayer2Name(String name) {
            Player player = new Player();

            if (jugadores.size() > 1) {
                player = jugadores.get(1);
                player.name = name;
                player.wins = 0;
                player.isMyTurn = false;
            }

            return player;
        }
    }
}
