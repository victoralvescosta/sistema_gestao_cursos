public class Pessoa {

    //Atributos
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Adicionando get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Adicionando a formatação

    @Override
    public String toString() {
        return "Nome:" + nome;
    }
}
