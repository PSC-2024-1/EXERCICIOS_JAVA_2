/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex10;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*A organização mundial da saúde recomenda que sejam ingeridos
        35 ml de água por dia, para cada quilograma de peso.
        Crie um algoritmo que recebe o peso de uma pessoa e 
        informe a quantidade recomendada de água em litros.*/
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o seu peso em quilogramas: ");
        double peso = input.nextDouble();

        double quantidadeAgua = peso * 35 / 1000; // converter para litros

        System.out.printf("Você deve ingerir aproximadamente: %.2f litros de água por dia\n", quantidadeAgua);
  
    }
    
}
