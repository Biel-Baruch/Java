/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava2;

import java.util.Scanner;

/**
 *
 * @author baruc
 */
public class AtividadeJava2 {

    public static void main(String[] args) {
        
        //Fatura//
        
        Scanner scanner = new Scanner(System.in);
        
        //Leitura dos valores//
        
        System.out.println("Digite o valor total da fatura: ");
        double valorTotal = scanner.nextDouble();
        
        System.out.println("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        
        System.out.println("Digite o percentual de desconto por pagamento antecipado: ");
        double percentualDesconto = scanner.nextDouble();
        
        System.out.println("Digite o percentual de multa por atraso: ");
        double percentualMulta = scanner.nextDouble();
        
        //Cálculo do valor com desconto//
        
        double valorComDesconto = valorTotal - (valorTotal * (percentualDesconto / 100));
        System.out.println("Valor total com desconto para pagamento antecipado: " + valorComDesconto);
        
        //Cálculo do valor de cada parcela com multa//

        double valorParcelaComMulta = (valorTotal + (valorTotal * (percentualMulta / 100))) / numeroParcelas;
        double valorMulta = (valorTotal * (percentualMulta / 100)) / numeroParcelas;
        System.out.println("Valor de cada parcela com multa: " + valorParcelaComMulta);
        System.out.println("Multa paga em cada parcela: " + valorMulta);
        
    }
}
