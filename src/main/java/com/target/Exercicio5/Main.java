package com.target.Exercicio5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack objPilha = new Stack();

        String str= "texto";
        System.out.println(str);


        char[] myChars = str.toCharArray();

        str = "";


            for (char letra: myChars) {
                objPilha.push(letra);

            }

            for (char letra: myChars) {
                str = str + String.valueOf(objPilha.pop());

        }
        System.out.println(str);





    }


}
