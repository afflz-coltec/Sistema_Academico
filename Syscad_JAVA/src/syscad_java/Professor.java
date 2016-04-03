package syscad_java;

import java.util.Scanner;

public class Professor extends Pessoa{
    
    String titulo_max;
    Turma[] turmas;
    
    Professor()
    {    
        this.nome = "carlos";
        this.adrs = "ali";
        this.fone = "5556666";       
    }
    
    Professor(String nome,String adrs,String fone)
    {    
        this.nome = nome;
        this.adrs = adrs;
        this.fone = fone;       
    }
    
    void mostra() {
        System.out.println("Nome : " + nome);
        System.out.println("Endereço : " + adrs);
        System.out.println("Telefone : " + fone);
    }
    
    void atirar_notas(Aluno avaliado,Materia mat)
    {
        float x;
        
        System.out.println("ENTRE COM A NOTA P1 :");
        x = new Scanner(System.in).nextFloat();
        avaliado.aula[mat.code].p1 = x;
        System.out.println("ENTRE COM A NOTA P2 :");
        x = new Scanner(System.in).nextFloat();
        avaliado.aula[mat.code].p2 = x;
        System.out.println("ENTRE COM A NOTA P3 :");
        x = new Scanner(System.in).nextFloat();
        avaliado.aula[mat.code].p3 = x;
        System.out.println("ENTRE COM A FREQUENCIA :");
        x = new Scanner(System.in).nextFloat();
        avaliado.aula[mat.code].f1 = x;
        System.out.println("ENTRE COM O NUMERO DE AULAS DADAS :");
        x = new Scanner(System.in).nextFloat();
        avaliado.aula[mat.code].ft = x;   
    }
    
}
