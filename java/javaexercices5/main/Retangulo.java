package model;

import model.Forma;

public class Retangulo extends Forma{

    private double base;
    private double altura;
    private double area;

    public Retangulo(){}
    
    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double areaCalculada = base * altura;
        System.out.println("A area do retangulo é: " + areaCalculada);
        this.area = areaCalculada;
        return areaCalculada;
    }

}