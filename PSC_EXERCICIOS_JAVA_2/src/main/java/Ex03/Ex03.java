/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que calcule o teorema de Pitágoras,
        representado pela expressão: c =a2+b2 */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor de a: ");
        double a = input.nextDouble();
        
        System.out.print("Informe o valor de b: ");
        double b = input.nextDouble();
        
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.println("O valor de c é: " + c);
    }
    
}
