/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decifladordeletras;
import java.util.*;
/**
 *
 * @author pedro
 */
public class DecifladorDeLetras {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        
        Scanner scan=new Scanner (System.in);
        System.out.print("Digite aqui:");
        Palavra novaPalavra1= new Palavra(); novaPalavra1.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra2= new Palavra(); novaPalavra2.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra3= new Palavra(); novaPalavra3.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra4= new Palavra(); novaPalavra4.setPalavra(scan.next());
        
        
        novaPalavra1.setNumeroDeLetras(novaPalavra1.getPalavra().length());
        novaPalavra2.setNumeroDeLetras(novaPalavra2.getPalavra().length());
        novaPalavra3.setNumeroDeLetras(novaPalavra3.getPalavra().length());
        novaPalavra4.setNumeroDeLetras(novaPalavra4.getPalavra().length());
        

      
        
        
        
        
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add(novaPalavra1.getNumeroDeLetras()+" - "+novaPalavra1.getPalavra());
        palavras.add(novaPalavra2.getNumeroDeLetras()+" - "+novaPalavra2.getPalavra());
        palavras.add(novaPalavra3.getNumeroDeLetras()+" - "+novaPalavra3.getPalavra());
        palavras.add(novaPalavra4.getNumeroDeLetras()+" - "+novaPalavra4.getPalavra());
       
        Collections.reverse(palavras);
        
        for (String palavra : palavras ){
            System.out.println(palavra);
        }
        System.out.println("Finalizado");
    }
}