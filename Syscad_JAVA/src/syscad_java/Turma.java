package syscad_java;

class Turma {
    
    Aluno[] turma;
    String nome;
    float nota_media_turma;
    float freq_media_turma;
    
    void media_calc()
    {
        float sum_n = 0;
        float sum_f = 0;
        
        for (Aluno turma1 : this.turma) {
            turma1.media_calc();

            sum_n+=turma1.nota_media;  
            sum_f+=turma1.freq_media;        

        }
            nota_media_turma = sum_n/this.turma.length;
            freq_media_turma = sum_f/this.turma.length;    
    }

}
