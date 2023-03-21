package com.target.Exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Integer n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro: "));

        if (Fibonacci.contem(n) == true) {
            JOptionPane.showMessageDialog(null, "Pertence a sequencia de Fibonacci");
        } else {
            JOptionPane.showMessageDialog(null, " Não Pertence a sequencia de Fibonacci");
        }

    }
}
