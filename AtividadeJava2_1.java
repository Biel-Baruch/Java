/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_1;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_1 {

    public static void main(String[] args) {
        
         //Verificar idade//
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        if (idade >= 21) {
            System.out.println("A pessoa tem 21 anos ou mais.");
            }else{
            System.out.println("A pessoa tem menos de 21 anos.");
        }
        
    }
}
