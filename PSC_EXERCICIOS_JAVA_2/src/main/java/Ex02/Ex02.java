/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Uma dúvida que sempre paira na cabeça dos motoristas é:
        Abastecer com etanol ou gasolina? 
        Especialistas indicam que o consumo do carro aumenta em 
        torno de trinta por cento, quando abastecido com etanol, 
        logo, só vale a pena abastecer com ele se o valor estiver 
        abaixo de setenta por cento do valor da gasolina. 
        Para auxiliar motoristas a realizar este cálculo, 
        crie um algoritmo que receba o preço dos dois combustíveis,
        e informe qual deve ser a escolha, com base no custo.
       */
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o preço do etanol: ");
        double precoEtanol = input.nextDouble();

        System.out.print("Informe o preço da gasolina: ");
        double precoGasolina = input.nextDouble();

        if (precoEtanol < precoGasolina * 0.7) {
            System.out.println("Vale a pena abastecer com etanol.");
        } else {
            System.out.println("Vale a pena abastecer com gasolina.");
        }
    }

}
