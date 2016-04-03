package syscad_java;

class Diciplina {

    float p1;
    float p2;
    float p3;

    float r1;

    float f1;
    float ft;

    float nota_media;
    boolean apv;
    float freq_media;

    void media_calc() {
        nota_media = (p1 + p2 + p3) / 3;
        freq_media = f1 / ft;

        if (freq_media > 0.75) {
            if (nota_media > 70) {
                apv = true;
            } else if (nota_media >= 30 && nota_media < 70) {
                apv = (nota_media + r1) / 2 >= 50;
            } else if (nota_media < 30) {
                apv = false;
            }
        } else {
            apv = false;
        }

    }

    void mostra() {
        System.out.println("NOTA 1 :" + p1);
        System.out.println("NOTA 2 :" + p2);
        System.out.println("NOTA 3 :" + p3);
        System.out.println("MEDIA  :" + nota_media);
        if(nota_media < 70)
        {
            System.out.println("NOTA  RECU :" + r1);
            System.out.println("MEDIA RECU :" + (nota_media + r1) / 2);
        }
           
    }
    void mostra(boolean diario)
    {
        System.out.print(p1+"\t");
        System.out.print(p2+"\t");
        System.out.print(p3+"\t");
        System.out.print(nota_media+"\t");
        if(nota_media < 70)
        {
            System.out.println(r1+"\t");
            System.out.println((nota_media + r1) / 2 + "\t");
        }
        else
            System.out.print("\t\t");
    }

}
