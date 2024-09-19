/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_3;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_3 {

    public static void main(String[] args) {
        
        //Verificar altura//
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("A altura é maior que 1,75 m.");
        }else{
            System.out.println("A altura não é maior qu e 1,75 m.");
        }
    }
}
