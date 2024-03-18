/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex09;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa para calcular o IMC de uma pessoa. 
        Ele deve receber o peso atual em quilogramas e a altura, 
        em centímetros, e exibir o peso ideal e o peso ideal
        ajustado. 
        Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal 
        Utilize este como referência para seus testes. 
        Obs. O IMC é apenas uma referência, 
        um médico deve ser consultado para entender 
        as necessidades de cada indivíduo.*/
        Scanner input = new Scanner(System.in);
        double imcIdeal = 22;
        
        System.out.print("Informe o peso atual em quilogramas: ");
        double peso = input.nextDouble();

        System.out.print("Informe a altura em centímetros: ");
        double altura = input.nextDouble() / 100; // converter em metros

        double imc = peso / (altura * altura);
        double pesoIdeal = imcIdeal * (altura * altura); 

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.printf("Seu peso ideal é aproximadamente: %.2f kg\n", pesoIdeal);
   
    }
    
}
