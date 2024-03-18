/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa para calcular a regra de três.*/
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe três valores (a, b e c) para calcular o quarto valor (x)");
        System.out.print("Valor de a: ");
        double a = input.nextDouble();
        System.out.print("Valor de b: ");
        double b = input.nextDouble();
        System.out.print("Valor de c: ");
        double c = input.nextDouble();
        
        double x = (b * c) / a;
        
        System.out.println("O valor de d é: " + x);
    }
    
}
