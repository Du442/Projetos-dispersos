import java.Pessoa;

public class Aluno extends Pessoa {

    private String autor;

    public Aluno(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    public void mostrarAluno(){
        System.out.println("")
    }

}