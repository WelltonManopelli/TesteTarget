package com.target.Exercicio4;

public class Main {

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg =29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp+rj+mg+es+outros;
        System.out.printf(" O percentual de SP é de : %.2f%n",(sp/total)*100);
        System.out.printf(" O percentual de RJ é de : %.2f%n",(rj/total)*100);
        System.out.printf(" O percentual de MG é de : %.2f%n",(mg/total)*100);
        System.out.printf(" O percentual de ES é de : %.2f%n",(es/total)*100);
        System.out.printf(" O percentual de Outros é de : %.2f%n",(outros/total)*100);



    }
}
