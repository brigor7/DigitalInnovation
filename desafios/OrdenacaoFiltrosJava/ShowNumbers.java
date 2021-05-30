package br.com.dio.collections.desafios.OrdenacaoFiltrosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ShowNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

    //declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int   linha =sc.nextInt();
        while(  sc.hasNextLine())
            lista.add(sc.nextInt());

        SortedMap<Integer, Integer> nums = new TreeMap<>();
        lista.forEach(id -> nums.compute(id, (   ,ver ) -> ( ver   == null ? 1 :  + 1)));


        contaQuant.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}