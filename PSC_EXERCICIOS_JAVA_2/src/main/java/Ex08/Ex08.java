/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex08;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que calcule o tempo necessário para o 
        download de um arquivo qualquer da internet. 
        Deve-se informar o tamanho do arquivo em MB, 
        a velocidade do link em Mbps e, retornar o tempo total 
        em minutos.*/
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivo = input.nextDouble();
        
        System.out.print("Informe a velocidade do link em Mbps: ");
        double velocidadeLink = input.nextDouble();
        
        double tempoEmSegundos = (tamanhoArquivo * 8) / velocidadeLink;
        double tempoEmMinutos = tempoEmSegundos / 60;
        
        System.out.println("Tempo necessário para o download: " + tempoEmMinutos + " minutos");
    
    }
    
}
