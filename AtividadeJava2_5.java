/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_5;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_5 {
    public static void main(String[] args) {
        
        //Verificar sobrenome//
        
        String meuSobrenome = "Gomes";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o sobrenome: ");
        String sobrenomeUsuario = scanner.nextLine();
        if (!sobrenomeUsuario.equalsIgnoreCase(meuSobrenome)){
            System.out.println("O sobrenome é diferente do meu.");
        }else{
            System.out.println("O sobrenome é igual ao meu.");
        }
        
    }
}
