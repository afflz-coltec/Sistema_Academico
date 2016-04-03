package syscad_java;

public class Secretaria {
    
    
    void diario_de_classe (Turma classe)
    {
        Aluno[] turma = classe.turma;
        System.out.println("TURMA " + classe.nome);
        
        for (Aluno a : turma)
            for (Diciplina d : a.aula)
                d.mostra(true);
        System.out.println("MEDIA TURMA :" + classe.nota_media_turma);
        System.out.println("FREQUENCIA TURMA :" + classe.freq_media_turma);
    }
    void historico_escolar (Aluno aluno)
    {
        aluno.mostra_notas(true);        
    }
}
