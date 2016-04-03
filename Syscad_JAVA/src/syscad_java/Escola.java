package syscad_java;

public class Escola {
    
    static RH div_prof = new RH();
    static Secretaria div_stud = new Secretaria();
    static Curso[] cursos;
    

    public static void main(String[] args){
        for(int i=0; i<15;i++)
        {
            Professor atual = new Professor();
            div_prof.contrata_professor(atual);
            div_prof.show_staff();
        }
        
    }

    
}
