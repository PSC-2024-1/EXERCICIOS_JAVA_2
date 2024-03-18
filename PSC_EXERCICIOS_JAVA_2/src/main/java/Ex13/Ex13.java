/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex13;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que seja capaz de realizar a soma 
        de duas frações, não é necessário simplificar. 
        As entradas serão o numerador e, o denominador da 
        primeira fração, seguidos do numerador e, o denominador 
        da segunda fração. O resultado também deverá ser exibido
        em formato de fração. e.g: ⅗ */
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numerador da primeira fração: ");
        int numerador1 = input.nextInt();

        System.out.println("Informe o denominador da primeira fração: ");
        int denominador1 = input.nextInt();

        System.out.println("Informe o numerador da segunda fração: ");
        int numerador2 = input.nextInt();

        System.out.println("Informe o denominador da segunda fração: ");
        int denominador2 = input.nextInt();

        int denominadorComum = denominador1 * denominador2;
        int numeradorResultado = numerador1 * denominador2 + numerador2 * denominador1;

        System.out.printf("Resultado da soma: %d/%d\n", numeradorResultado, denominadorComum);

    }
    
}
