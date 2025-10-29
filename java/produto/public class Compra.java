package compra;

import java.util.Scanner;
import java.util.Locale;
import Produto.produto;

public class Compra{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Produto p1 = new Produto("Sem nome", 0.0, 0);

        boolean rodando = true;
        while(rodando){
            System.out.println("Menu\n"+
            "1 - alterar nome\n" +
            "2 - alterar preco\n" +
            "3 - alterar quantidade\n" +
            "4 - mostrar detalhes do produto\n" +
            "5 - calcular total e mostrar\n" +
            "0 - sair\n" +
            "Escolha uma opção: ");


        String opc = sc.nextLine().trim();

        switch (opc) {
            case "1":
                System.out.println("Digite o novo nome:");
                String novoNome = sc.nextLine();
                p1.setNome(novoNome);
                System.out.println("nome foi alterado para: " + p1.getNome());
                break;
            
            case "2":
                System.out.println("Digite o novo preco:");
                double novoPreco = sc.nextDouble();
                sc.nextLine();
                if(novoPreco >= 0) {
                    p1.setPreco(novoPreco);
                    System.out.println("Novo preco definido para: " + p1.getPreco());
                    } else {
                        System.out.println("Valor invalido");
                    }
                break;

            case "3":
                System.out.println("Digite a quantidade");
                int novaQuantidade = sc.nextInt();
                sc.nextLine();
                if(novaQuantidade >= 0){
                    p1.setQuantidade(novaQuantidade);
                    System.out.println("Nova quantidade definido para: " + p1.getQuantidade());
                    } else {
                        System.out.println("Valor invalido");
                    }
                break;

            case "4":
                System.out.println("Detalhes do produto\n" +
                "Nome: " + p1.getNome() + "\n" +
                "Preco unidade: R$" + p1.getPreco() + "\n" +
                "Quantidade: " + p1.getQuantidade() + "\n" +
                "Valor total: R$" + p1.getValor());
                break;

            case "5":
                p1.calcularTotal();
                break;
            
            case "0":
                rodando = false;
                break;

            default:
                System.out.println("Opção invalida. Tente novamente.");
        }
        }
        System.out.println("Programa finalizado.");

        sc.close();
    }

}
