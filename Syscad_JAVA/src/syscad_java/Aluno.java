package syscad_java;

class Aluno extends Pessoa{

    String matricula;
    String curso_apv;
    String estado;
    boolean apv;
    float nota_media = 0;
    float freq_media = 0;
    Diciplina[] aula;
    
    Aluno()
    {    
        this.nome = "PING";
        this.adrs = "OLIMPO";
        this.fone = "(31)PERDI-OCEL";       
    }
    
    Aluno(String nome,String adrs,String fone,String matricula,String curso_apv)
    {    
        this.nome = nome;
        this.adrs = adrs;
        this.fone = fone;
        this.matricula = matricula;
        this.curso_apv = curso_apv;
    }

    void media_calc() {
        float sum_n = 0;
        float sum_f = 0;

        for (Diciplina aula1 : this.aula) {
            aula1.media_calc();
            
            apv   &= aula1.apv;
            sum_n += aula1.nota_media;
            sum_f += aula1.freq_media;
            

        }
        nota_media = sum_n / this.aula.length;
        freq_media = sum_f / this.aula.length;
    }
    void refresh_data(){
        this.media_calc();
        
        if (freq_media < 0.75)
            estado = "EVADIDO";
        else if (apv)
        {
            estado = "APROVADO";
        }
        else if(!apv)
        {
            estado = "REPROVADO";
        }
        
    }
    void mostra_notas(){
        for (Diciplina aula1 : this.aula){
            aula1.mostra();
        }
    }
    void mostra_notas(boolean hist){
        for (Diciplina aula1 : this.aula){
            aula1.mostra();
        }
        System.out.println("FREQUENCIA TOTAL : " + this.freq_media);
        System.out.println("NOTA MEDIA : " + this.nota_media);
    } 


}
