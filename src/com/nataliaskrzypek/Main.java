package com.nataliaskrzypek;

public class Main {

    public static void main(String[] args) {

        byte b1;
        b1 = 58;

        int a =634;
        a= a + b1;

        float f1 = 1353535353;

        double d2=5.64 * 10e9;
        System.out.println(b1);
        System.out.println("f1=" + f1);
        System.out.println("d2=" +d2);



        boolean p = true && false;
        boolean  q = true || false;
        char c = 't';
        String abc = "my text";
        System.out.println("c =" + c + ", abc= "+ abc);

        System.out.println("Hello!!!");

        int a2 = 5656;
        Integer a3 = 5656;
        a3 = a2+a3;
        a2 = a3+a2;
        System.out.println("a3=" +a3);

    }
}
