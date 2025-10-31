import java.util.Scanner;
import model.*;

public class Principal {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Cachorro dog = new Cachorro("Rex");

        System.out.println("Nome do cachorro: " + dog.getNome());
        dog.fazerSom();

        Gato cat = new Gato("Roblox");

        System.out.println("Nome do gato: " + cat.getNome());
        cat.fazerSom();

        sc.close();

    }

}