package model;

import model.*;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public fazerSom(){
        System.out.println("Au Au");
    }

}