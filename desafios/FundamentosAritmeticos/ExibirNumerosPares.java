package br.com.dio.collections.desafios.FundamentosAritmeticos;

import java.io.*;
import java.util.StringTokenizer;
import java.io.IOException;

public class ExibirNumerosPares{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        for (int i = 1 ; i <=  a; i++) {
            if (i%2 == 0){ System.out.println(i);}
        }
    }

}

/* Desafios - Exibir numeros pares
* Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
* */

/* Entrada
* Você receberá 1 valor inteiro N, onde N > 0.
* */

/*Saída
* Exiba todos os números pares até o valor de entrada, sendo um em cada linha. */
