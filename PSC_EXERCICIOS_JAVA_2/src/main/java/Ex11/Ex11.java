/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex11;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Muitas pessoas têm dúvida sobre qual o gasto com 
        energia de determinados equipamentos que possuem. 
        Crie um algoritmo que receba a potência do equipamento
        em Watts, a quantidade de horas que ele fica ligado por 
        dia, e o valor do KW/h. O cálculo é feito multiplicando 
        a potência pela quantidade de horas, depois, dividindo 
        por mil. Ao final, apresente a quantidade de KWh consumidos 
        pelo equipamento e qual será o valor pago por eles.*/
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a potência do equipamento em Watts: ");
        double potencia = input.nextDouble();
        
        System.out.print("Informe a quantidade de horas que fica ligado por dia: ");
        double horasPorDia = input.nextDouble();
        
        System.out.print("Informe o valor do kWh em reais: ");
        double valorKWh = input.nextDouble();
        
        double consumoDiarioKWh = (potencia * horasPorDia) / 1000;
        double custoDiario = consumoDiarioKWh * valorKWh;

        System.out.printf("Consumo diário em kWh: %.2f kWh\n", consumoDiarioKWh);
        System.out.printf("Custo diário: R$ %.2f\n", custoDiario);
   
    }
    
}
