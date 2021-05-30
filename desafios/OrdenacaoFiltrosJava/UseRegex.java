package br.com.dio.collections.desafios.OrdenacaoFiltrosJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z-A-Z]{3,3}-\\D{4,4}");
        Matcher matcher = pattern.matcher("ETea-1234");

       matcher.results().forEach( System.out::println);
        if (matcher.find()){
            System.out.print("Encontrou!");
        }else{
            System.out.print("Não Encontrou!");
        }
    }
}
