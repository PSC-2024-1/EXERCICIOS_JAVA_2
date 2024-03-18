/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa para uma loja de cerâmica que ajuda no cálculo
        da quantidade de revestimento necessário para uma obra. 
        A pessoa utilizadora deve informar as medidas de largura e 
        comprimento da área que será revestida e da cerâmica escolhida. 
        Sempre arredonde o valor para cima, e acrescente dez por 
        cento para o acabamento. */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a largura da área a ser revestida (m): ");
        double larguraArea = scanner.nextDouble();
        
        System.out.print("Informe o comprimento da área a ser revestida (m): ");
        double comprimentoArea = scanner.nextDouble();
        
        System.out.print("Informe a largura da cerâmica (m): ");
        double larguraCeramica = scanner.nextDouble();
        
        System.out.print("Informe o comprimento da cerâmica (m): ");
        double comprimentoCeramica = scanner.nextDouble();
        
        double areaTotal = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        
        double quantidadeNecessaria = areaTotal / areaCeramica;
        quantidadeNecessaria *= 1.1; // Acrescenta 10% para acabamento
        
        System.out.printf("Quantidade de cerâmicas necessárias: %.2f", quantidadeNecessaria);
   
        
    }
    
}
