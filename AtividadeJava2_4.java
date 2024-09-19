/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_4;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_4 {

    public static void main(String[] args) {
        
        //Verificar peso//
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("O peso é maior que 70 kg.");
        }else{
            System.out.println("O peso não é maior que 70 kg.");
        }
        
    }
}
