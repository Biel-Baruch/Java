/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2_8;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2_8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite a série favorita: ");
        String serie = scanner.next();
        
        System.out.println("Digite a música favorita: ");
        String musica = scanner.next();
        
        System.out.println("Digite o jogo favorito: ");
        String jogo = scanner.next();
        
        //Meus dados//
        
        String meuNome = "Gabriel";
        int minhaIdade = 20;
        double meuPeso = 80.0;
        double minhaAltura = 1.73;
        String minhaSerie = "Breaking Bad";
        String minhaMusica = "Chamber of Reflection";
        String meuJogo = "Assassin's Creed";
        
        int caracteristicasIguais = 0;
        
        if (nome.equals(meuNome)) caracteristicasIguais ++;
        if (idade == minhaIdade) caracteristicasIguais++;
        if (peso == meuPeso) caracteristicasIguais++;
        if (altura == minhaAltura) caracteristicasIguais++;
        if (serie.equals(minhaSerie)) caracteristicasIguais++;
        if (musica.equals(minhaMusica)) caracteristicasIguais++;
        if (jogo.equals(meuJogo)) caracteristicasIguais++;
        
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é parecida comigo!");
        }else{
            System.out.println("Esta pessoa não é parecida comigo.");
        }
    }
}
