/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progmenuvettori;

import java.util.Scanner;

/**
 *
 * @author gabriel.ricaldone
 */
public class ProgMenuVettori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int risposta;
        Scanner input = new Scanner(System.in);
        
        while(running) {
            System.out.println("Cosa vorrebbe fare?");
            System.out.println("1-");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
            risposta = input.nextInt();
            switch(risposta) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    running = false;
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Errore, valore incorretto");
                    break;
            }
        }
    }
    
}
