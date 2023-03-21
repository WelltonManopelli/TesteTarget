package com.target.Exercicio2;


import java.util.ArrayList;
import java.util.List;

class Fibonacci {


    public static boolean contem(int n) {
        int n1=1,n2=0;
        List <Integer> lista = new ArrayList<Integer>();
        lista.add(0);

        do{


            n1=n1+n2;
            n2=n1+n2;

            lista.add(n1);
            lista.add(n2);

        }while((n2 < n && n1< n));

        System.out.println(lista.toString());
        return lista.contains(n);
    }



}
