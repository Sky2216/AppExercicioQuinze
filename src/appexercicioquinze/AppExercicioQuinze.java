/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicioquinze;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioQuinze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     double altura,peso,pesoGramas,PesoGanho;
        
        Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite seu peso: "); 
       peso = teclado.nextDouble();
       
       pesoGramas = peso / 1000;
       System.out.println("O peso em gramas eh de:"+pesoGramas);
       
        PesoGanho = pesoGramas /0.05;
       System.out.println("O novo peso em gramas sera de: "+PesoGanho);
    
    
    
    
    }
    
}
