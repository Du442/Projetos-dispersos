import java.util.Scanner;
import model.Model;
import java.util.Locale;

public class Principal{

    public static void main(String[]args){

    Scanner sc = new Scanner(System.in); 

    Locale.setDefault(Locale.US);  

    Model p1 = new Model();
    System.out.println("Escreva seu nome: ");
    p1.nome = sc.nextLine();
    System.out.println("Seu nome é: " + p1.nome);
    System.out.println("Escreva sua idade: ");
    p1.idade = sc.nextInt();
    System.out.println("Sua idade é: " + p1.idade);
    System.out.println("Escreva sua altura em metros: ");
    p1.altura = sc.nextDouble();
    System.out.printf("Sua altura é: %.2f%n", p1.altura);

    System.out.println(p1.nome + "Possui uma idade de: " + p1.idade + " anos e uma altura de: " + p1.altura + " metros de altura.");

    p1.falar();

    p1.fazerAniversario();

    sc.nextLine();

    Model p2 = new Model();
    System.out.println("Escreva seu nome: ");
    p2.nome = sc.nextLine();
    System.out.println("Seu nome é: " + p2.nome);
    System.out.println("Escreva sua idade: ");
    p2.idade = sc.nextInt();
    System.out.println("Sua idade é: " + p2.idade);
    System.out.println("Escreva sua altura em metros: ");
    p2.altura = sc.nextDouble();
    System.out.printf("Sua altura é: %.2f%n", p2.altura);

    System.out.println(p2.nome + "Possui uma idade de: " + p2.idade + " anos e uma altura de: " + p2.altura + " metros de altura.");

    p2.falar();

    p2.fazerAniversario();


    sc.close();
    }
}

public class Principal2 {

    public static void main(String[]args){

    Scanner s = new Scanner(System.in);

    ContaBancaria c1 = new ContaBancaria(numeroConta, titular, saldo);

    System.out.println("Digite o numero da sua conta: ");
    c1.numeroConta = s.nextLine();
    System.out.println("Digite o nome do titular da conta: ");
    c1.titular = s.nextLine();
    System.out.println("Digite seu saldo: ");
    c1.saldo = s.nextDouble();
    s.nextLine();

    System.out.println("Qual operação vai operar: "\n"
    1 - Depósito"\n"
    2 - Saque"\n"
    3 - Mostrar saldo");
    int resposta = s.nextInt();

    if(resposta == 1){
        System.out.println("Digite seu valor para depósito aqui: ");
        double valor = s.nextDouble();
        c1.deposit(valor);
    }else if(resposta == 2){
        System.out.println("Digite o quanto deseja resgatar: ");
        valor = s.nextDouble();
        c1.saque(valor);
    }else if(resposta == 3){
        c1.exibirSaldo();
    } else {
        System.out.println("Opção invalida!");
    }


    s.close();
    }
}