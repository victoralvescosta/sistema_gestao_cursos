import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Adicionando atributos
    private String nomeCurso;
    private Professor professor;
    private List<Aluno> alunoList = new ArrayList<>();

    //Adicionando curso
    public Curso(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
    }

    //Adicionar alunos
    public void adicionarAluno(Aluno aluno) {
        alunoList.add(aluno);
    }

    //Exibindo informações
    public void exibirInfor() {
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Professor: " + professor);
        System.out.println("Alunos: ");
        for (Aluno alunos : alunoList) {
            System.out.println(alunos);
        }

    }
}
