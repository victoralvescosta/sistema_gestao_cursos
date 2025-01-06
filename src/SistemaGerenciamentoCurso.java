public class SistemaGerenciamentoCurso {
    public static void main(String[] args) {

        //Adicionando professor
        Professor prof = new Professor("Giovanna", "Geografia");

        //Adicionando curso
        Curso cursoGeografia = new Curso("Geografia", prof);

        //Adicionando alunos
        Aluno aluno1 = new Aluno("João Victor", 12345);
        Aluno aluno2 = new Aluno("Lidia", 54231);

        //Adicionando notas aluno1
        aluno1.adicionarNota(5.0);
        aluno1.adicionarNota(3.0);
        aluno1.adicionarNota(7.0);
        aluno1.adicionarNota(6.0);

        //Adicionando notas aluno2
        aluno2.adicionarNota(10.0);
        aluno2.adicionarNota(9.0);
        aluno2.adicionarNota(7.0);
        aluno2.adicionarNota(8.0);

        //Matricula dos Alunos
        cursoGeografia.adicionarAluno(aluno1);
        cursoGeografia.adicionarAluno(aluno2);

        //Exibindo as informações
        cursoGeografia.exibirInfor();
    }
}
