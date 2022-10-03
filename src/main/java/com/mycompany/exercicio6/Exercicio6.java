package com.mycompany.exercicio6;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
//        entrada de dados 
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o raio do círculo: ");
        double raio = entrada.nextDouble();
        entrada.close();

//    Calculo da area do círculo
        double area = Math.PI * Math.pow(raio, 2);
        System.out.print("A área do círculo de raio " + raio + " é igual a " + area);
    }
}
