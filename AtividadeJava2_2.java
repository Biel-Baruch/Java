/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_2;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_2 {

    public static void main(String[] args) {
        
        //Verificar salário//
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário: ");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1212.00;
        if (salario > 5 * salarioMinimo) {
            System.out.println("O salário é maior que 5 vezes o salário minimo.");
        }else{
            System.out.println("O salário não é maior que 5 vezes o salário minimo.");
        }
        
    }
}
