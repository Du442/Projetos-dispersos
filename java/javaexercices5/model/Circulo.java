package model;

import model.Forma;

public class Circulo extends Forma{

    private final double pi = 3.14;
    private double raio;
    private double area;

    public Circulo(){}
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        double areaCalculada = pi * (raio * raio);
        System.out.println("A area do circulo é: " + areaCalculada);
        this.area = areaCalculada;
        return areaCalculada;
    }

}