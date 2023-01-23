/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progmenuvettori;

import java.util.ArrayList;
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
        int risposta,i = 0;
        String rispostaString;
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> vettoreStringhe = new ArrayList<String>();
        while(running) {
            if (!vettoreStringhe.isEmpty()) {
                i = 0;
                for( String elemento : vettoreStringhe) {
                    System.out.println(i + "- " + elemento);
                    i++;
                }
                System.out.println();
            }
            
            System.out.println("Cosa vorrebbe fare?");
            System.out.println("1-Aggiungi elemento");
            System.out.println("2-Elimina elemento");
            System.out.println("3-Quantità totale elementi");
            System.out.println("4-Chiesto un elemento dire dove si trova");
            System.out.println("5-Chiesta una lettera, visualizzare tutti gli elementi con quella lettera");
            System.out.println("6-Esci");
            
            risposta = input.nextInt();
            input.nextLine();
            switch(risposta) {
                case 1:
                    rispostaString = input.nextLine();
                    vettoreStringhe.add(rispostaString);
                    break;
                case 2:
                    if(!vettoreStringhe.isEmpty()) {
                        risposta = input.nextInt();
                        input.nextLine();
                        
                        if (!(risposta > vettoreStringhe.size()-1)) {
                            vettoreStringhe.remove(risposta);
                        } else {
                            System.out.println("Errore fuori dal vettore");
                        }
                    } else {
                        System.out.println("Il vettore è vuoto");
                    }
                    break;
                case 3:
                    System.out.println("Quantità totale elementi: " + vettoreStringhe.size());
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
