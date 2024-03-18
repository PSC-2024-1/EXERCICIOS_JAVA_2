/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex12;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pesquise o valor aproximado de dias por mês e ajuste 
        o programa anterior para exibir o custo mensal em energia*/
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

        double consumoMensalKWh = consumoDiarioKWh * 30; 
        double custoMensal = consumoMensalKWh * valorKWh;

        System.out.printf("Consumo mensal em kWh: %.2f kWh\n", consumoMensalKWh);
        System.out.printf("Custo mensal: R$ %.2f\n", custoMensal);
    }

}
