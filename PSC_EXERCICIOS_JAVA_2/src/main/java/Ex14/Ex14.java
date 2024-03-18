/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex14;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um algoritmo que recebe dois pontos no plano
        cartesiano, P1=(x1,y1) e P2=(x2,y2) e calcula a distância
        entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2.*/
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe x1: ");
        double x1 = input.nextDouble();
        
        System.out.print("Informe y1: ");
        double y1 = input.nextDouble();
        
        System.out.print("Informe x2: ");
        double x2 = input.nextDouble();
        
        System.out.print("Informe y2: ");
        double y2 = input.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f\n", distancia);
  
        
    }
    
}
