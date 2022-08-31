package com.entrega;

public class Datos {


    int num2; // 2 byte
    double num1;
    long num4; // 8 byte

    //caracter
    char carac;

    //boolean
    boolean verdadero;
    boolean falso;

    //cadenas de texto
    String nombre;
    String apellido;

    //tipos envoltorio a diferencia de los primarios estos pueden ser null
    Integer numero;
    Long numero2;

    //TODO: recopilar datos


    public Datos(int num2, double num1, long num4, long l, char carac, boolean verdadero, boolean falso, String nombre, String apellido, Integer numero, Long numero2) {
        this.num2 = num2;
        this.num1 = num1;
        this.num4 = num4;
        this.carac = carac;
        this.verdadero = verdadero;
        this.falso = falso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "num2=" + num2 +
                ", num1=" + num1 +
                ", num4=" + num4 +
                ", carac=" + carac +
                ", verdadero=" + verdadero +
                ", falso=" + falso +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numero=" + numero +
                ", numero2=" + numero2 +
                '}';
    }
}
