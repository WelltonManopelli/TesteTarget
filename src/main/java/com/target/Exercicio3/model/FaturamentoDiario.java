package com.target.Exercicio3.model;

import java.util.List;

public  class FaturamentoDiario {

    private int dia;
    private double valor;

    public void relatorio(List<FaturamentoDiario> faturamentoDiario) {

        double faturamentoMensal = 0, menorFaturamento = 0, max = 0;
        int dias=0;

        for (FaturamentoDiario dia : faturamentoDiario) {
            if (dia.getValor() > 0) {
                faturamentoMensal = dia.getValor() + faturamentoMensal;
                if ((menorFaturamento > dia.getValor() || menorFaturamento == 0)) {
                    menorFaturamento = dia.getValor();

                }


            }
            if ( dia.getValor() > max)
                max = dia.getValor();
        }

        for (FaturamentoDiario dia : faturamentoDiario) {
            if( dia.getValor()>(faturamentoMensal/faturamentoDiario.size())){
                dias++;
            }


        }

        System.out.printf("O menor valor de faturamento ocorrido em um dia do mês %.2f %n",menorFaturamento);

        System.out.printf("O maior valor de faturamento ocorrido em um dia do mês: %.2f %n", max);

        System.out.printf("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: %d %n", dias);


    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " "+dia +" "+valor;
    }
}
