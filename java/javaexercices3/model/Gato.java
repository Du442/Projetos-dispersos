package model;

import model.*;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public fazerSom(){
        System.out.println("Miau Miau");
    }

}