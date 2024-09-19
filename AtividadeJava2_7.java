/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_7;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_7 {

    public static void main(String[] args) {
        
        //Verificar Nome//
        
        String meuNome = "Gabriel";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nomeUsuario = scanner.nextLine();
        if (!nomeUsuario.equalsIgnoreCase(meuNome)){
            System.out.println("Pessoa com nome diferente");
        }else{
            System.out.println("Pessoa com nome igual");
        }
        
    }
}
