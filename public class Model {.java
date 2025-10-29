public class Model {

    public String nome ;
    public int idade ;
    public double altura;

    public void falar(){

    System.out.println(nome + " Frase aleatoria");

    }

    public void fazerAniversario(){
        idade++;
        System.out.println(nome + " fez aniversario! nova idade: " + idade);
    }
}

public class Pessoa {

    public String nome;
    public int idade;
    public String cidade;
    public 

    public void falar(){
        System.out.println("Está é uma frase aleatoria")
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e moro em " + cidade".");
    }

}

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    public int resposta;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular() [
        return titular
    ]
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double valor){
        if(valor > 0){
            System.out.println("Digite o valor para o seu deposito: \n Saldo atual: " + saldo);
            saldo += valor;
            System.out.println("Seu saldo apos o deposito é de: " + c1.saldo);
        }else {
            System.out.println("Esse valor não tem como ser acresentado");
        } 
    }

    public void saque(double valor){
        if(valor <= saldo && valor > 0){
            System.out.println("Saque de " + valor + " efetuado." );
            saldo -= valor;
            System.out.println("Saldo total: " + saldo);
        }
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo total é de: " + saldo);
    }
}


