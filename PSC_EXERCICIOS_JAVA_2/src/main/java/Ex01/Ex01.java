/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /* Crie um algoritmo que leia um valor de hora (HH:MM) 
       e informe (calcule) quantos minutos se passaram 
       desde o início do dia (00:00).*/
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a hora (HH:MM): ");
        int hh = input.nextInt();
        int mm = input.nextInt();
    
        int minutos = hh * 60 + mm;

        System.out.println("Minutos desde o início do dia: " + minutos);

    }
}
