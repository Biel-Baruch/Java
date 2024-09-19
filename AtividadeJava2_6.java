/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_6;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_6 {

    public static void main(String[] args) {
        
        //Verificar gênero//
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o gênero (m/f): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f') {
            System.out.println("O gênero é feminino.");
        }else{
            System.out.println("O gênero é masculino");
        }
        
    }
}
