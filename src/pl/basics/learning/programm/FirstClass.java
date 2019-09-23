package pl.basics.learning.programm;

import java.util.jar.JarOutputStream;

public class FirstClass {
    public static void main(String[] args) {
        String messege1 = "Jest zimno.";
        String messege2 = "Pada deszcz.";
        String messege3 = "Wieje silny wiatr.";
        System.out.println(messege1);
        System.out.println(messege2);
        System.out.println(messege3);
        String messege123 = messege1 + messege2 + messege3;
        System.out.println("Laczna dlugosc 3 wiadomosci wynosi: " + messege123.length());
        char charAt3 = messege123.charAt(3);
        System.out.println("Znak na pozycji nr 3 laczonej wiadomosci to: \"" + charAt3 + "\"");


    }}
