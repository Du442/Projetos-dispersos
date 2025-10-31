package model;

import model.*;

public class Moto extends Veiculo{

    private String tipoGuidao;

    public Moto(String marca, String modelo, int ano, String tipoGuidao){
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public exibirInfo(){
        super.exibirInfo();
        System.out.println("Tipo de guidao " + this.tipo.guidao);
    }
}