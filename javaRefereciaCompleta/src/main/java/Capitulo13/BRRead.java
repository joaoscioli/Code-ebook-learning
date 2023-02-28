package Capitulo13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Capitulo 13 - I/O, Try-with-Resources, e Outros topicos
 * Use um BufferedReader para ler caracteres do console. *import java.io.*
 * Codigo 01
 * */
//public class BRRead {
//    public static void main(String[] args) throws IOException {
//        char c;
//        if(System.console() == null)
//            System.out.println("Console OFF");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,System.console().charset()));
//
//        System.out.println("Digite a letra 'c' para fechar");
//
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        }while (c != 'q');
//
//    }
//}
