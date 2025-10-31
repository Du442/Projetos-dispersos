package model;

import model.Funcionario;

public class Gerente extends Funcionario{

    private double bonus;


    public Gerente(String name, double salario, double bonus){
        super(name, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados(){

        System.out.println("Nome: " + name + "\n" +
        "Salario: " + salario + "\n" +
        "Bonus: " + bonus + "\n" + 
        "Salario total: " + (salario + bonus));

    }

}