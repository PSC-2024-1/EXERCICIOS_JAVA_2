/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex07;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Incremente o programa da questão 6, 
        para informar o valor do metro quadrado da cerâmica 
        escolhido e o valor total a ser pago.*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a largura da área a ser revestida (m): ");
        double larguraArea = scanner.nextDouble();
        
        System.out.print("Informe o comprimento da área a ser revestida (m): ");
        double comprimentoArea = scanner.nextDouble();
        
        System.out.print("Informe a largura da cerâmica (m): ");
        double larguraCeramica = scanner.nextDouble();
        
        System.out.print("Informe o comprimento da cerâmica (m): ");
        double comprimentoCeramica = scanner.nextDouble();
        
        System.out.print("Informe o valor do metro quadrado da cerâmica (R$): ");
        double valorMetroQuadrado = scanner.nextDouble();

        double areaTotal = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        
        double quantidadeNecessaria = areaTotal / areaCeramica;
        quantidadeNecessaria *= 1.1; // Acrescenta 10% para acabamento
        
        System.out.printf("Quantidade de cerâmicas necessárias: %.2f", quantidadeNecessaria);
        
        double valorTotal = quantidadeNecessaria * (areaCeramica * valorMetroQuadrado);

        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
  
    }
    
}
