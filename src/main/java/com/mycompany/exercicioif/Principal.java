/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioif;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 10) {
            double metade = numero / 2;
            System.out.println("O número é maior que 10. Sua metade é: " + metade);
        } else {
            System.out.println("O número não é maior que 10. Nenhuma operação realizada.");
        }

        scanner.close();
    }
}
