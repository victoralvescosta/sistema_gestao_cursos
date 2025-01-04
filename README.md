# Sistema de Gestão de Cursos
> Crie um sistema que gerencie cursos, professores e alunos. O objetivo é aplicar os conceitos de classes, objetos, herança, encapsulamento, polimorfismo, e listas em um contexto realista.

## Requisitos
###Classes principais:

- Curso: representa um curso, contendo o nome do curso, uma lista de alunos e um professor.
- Aluno: representa um aluno, contendo nome, matrícula e uma lista de notas.
- Professor: representa um professor, contendo nome, disciplina e uma lista de cursos ministrados.
### Relacionamentos:

- Um curso deve ter um professor associado e pode ter vários alunos matriculados.
- Um professor pode ministrar vários cursos.
- Um aluno pode estar matriculado em vários cursos.
###Funcionalidades:

- Adicionar alunos a um curso.
- Adicionar notas a um aluno.
- Calcular a média das notas de um aluno.
- Verificar a aprovação do aluno (média ≥ 7.0).
- Exibir detalhes de um curso (nome, professor, lista de alunos e suas médias).
- Exibir detalhes de um professor e os cursos que ele ministra.
- Exibir detalhes de um aluno e os cursos em que ele está matriculado.
### Instruções Adicionais
- Utilize encapsulamento para proteger os atributos e fornecer métodos de acesso (get e set).
- Use herança e polimorfismo onde aplicável (ex.: Pessoa pode ser uma classe base para Professor e Aluno).
- Implemente métodos úteis, como toString, para exibir informações de forma legível.
