import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    //Atributos
    private String disciplina;
    private List<Curso> cursosMinistrados = new ArrayList<>();

    //Adicionando atributos
    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    //Adicionar cursos
    public void adicionarCuso(Curso curso) {
        cursosMinistrados.add(curso);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDisciplina: " + disciplina;
    }
}
