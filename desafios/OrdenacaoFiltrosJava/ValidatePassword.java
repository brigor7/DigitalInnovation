package br.com.dio.collections.desafios.OrdenacaoFiltrosJava;
import java.io.IOException;

import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("Digital Innovation Oneasdfa asdfsd\nAbcdEfgh99\nDigitalInnovationOne123\nDigital Innovation One 123\nAass9\nAassd9");
        //Scanner sc = new Scanner("DIO123456\nAno2020\nDigital!123\nAAASSS12345\n123456789\n123456aaaa\naaaaAAAAA");


        while(sc.hasNextLine()){
            String password = sc.nextLine();
            boolean isFound = password.matches("^(?![0-9]+$)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]+$");
            boolean isTamanho = password.length() > 5 && password.length() < 33;


            if(isFound && isTamanho )  {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");

            }
        }

    }
}

