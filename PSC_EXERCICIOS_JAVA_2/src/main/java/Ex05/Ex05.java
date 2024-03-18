/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa que calcule a área, o perímetro e a 
        diagonal de um retângulo. O resultado deve aparecer de 
        maneira organizada e clara para a pessoa utilizadora.*/
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a largura do retângulo: ");
        double largura = input.nextDouble();
        
        System.out.print("Informe a altura do retângulo: ");
        double altura = input.nextDouble();
        
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(Math.pow(largura,2)+ Math.pow(altura,2));
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);
    }
    
}
