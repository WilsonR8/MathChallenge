package com.will.mathchallenge;

public class Pregunta {
    private int a;
    private int b;
    private int c;

    public Pregunta() {
    this.a=a;
    this.b=b;
    this.c=c;
    }

    public void numeros(){
        a = (int) (Math.random()*50);
        b = (int) (Math.random()*50);
        c = a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
