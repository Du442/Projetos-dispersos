public class Pessoa{
    private String nome;
    private int idade;
    private double altura;

    public class Pessoa(){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
   

    public void getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void getAltura(){
        return altura;
    }

}