package syscad_java;

public class Coordenador extends Professor{

    public Coordenador(String nome, String adrs, String fone) {
        super(nome, adrs, fone);
    }
    
    void aloca_prof(Professor alocado,Turma alocada)
    {
            Turma[] nova_grade = new Turma[alocado.turmas.length + 1];

            System.arraycopy(alocado.turmas, 0, nova_grade, 0, alocado.turmas.length);

            nova_grade[alocado.turmas.length] = alocada;

            alocado.turmas = nova_grade;       
    }
    
    
}
