package br.com.dio.collections.desafios.FundamentosAritmeticos;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int positivo = 0;
        int negativo = 0;
        int par = 0;
        int impar = 0;
        int valor = 0;

//continue a solução
        for (int i = 0; i < 5; i++) {
            valor = leitor.nextInt();
            //Verificando se numero é positivo ou negativo
            if (valor > 0){
                positivo = positivo + 1;
            }

            if (valor < 0){
                negativo = negativo + 1;
            }


            //Verificando se numero é par ou impar
            if (valor % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }

}

/*Desafio - Analise de Numeros
* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
* quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.
* */

/*Entrada
* Você receberá 5 valores inteiros.*/

/* Saída
* Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.*/