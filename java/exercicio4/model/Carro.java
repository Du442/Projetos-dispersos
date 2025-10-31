import model.*;

public class Carro extends Veiculo{

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas){
        super(marca, modelo, ano)
        this.numeroPortas = numeroPortas;      
    }

    @Override
    public exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de portas: " + this.numeroPortas);
    }

}