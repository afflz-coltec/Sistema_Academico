package syscad_java;

public class RH {
    Professor [] corpo_docente;
    Coordenador [] coordenadores;
    
    RH()
    {
        corpo_docente = new Professor[0];
        coordenadores = new Coordenador[0];
    }

    void contrata_professor(Professor contratado)
    {
       Professor[] contratos = new Professor[this.corpo_docente.length + 1];

       System.arraycopy(this.corpo_docente, 0, contratos, 0, this.corpo_docente.length);
       
       contratos[this.corpo_docente.length] = contratado;
              
       this.corpo_docente = contratos;
    }
    void show_staff()
    {
        for (Professor corpo_docente1 : this.corpo_docente) {
            corpo_docente1.mostra();
        }
   
    }
}
