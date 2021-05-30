package br.com.dio.collections.desafios.FundamentosAritmeticos;

import java.util.Scanner;

public class QuantidadeValoresPositivos {
    public static void main(String args[]) {

        Scanner e = new Scanner (System.in);
        float a[] = new float [6];
        int soma = 0;

        for(int i = 0; i < 6; i++) {
            a[i] = e.nextFloat();
            if (a[i] > 0){
                soma += 1;
            }
        }
        System.out.println(soma + " valores positivos");
    }
}

/* Desafio
 * Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo
 * desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.
 */

/* Entrada
*  Você receberá seis valores, negativos e/ou positivos.*/

/* Saída
* Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
* Não esqueça da mensagem "valores positivos" ao final.
* */