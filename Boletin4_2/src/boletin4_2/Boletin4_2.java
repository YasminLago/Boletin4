package boletin4_2;
//Yasmin
public class Boletin4_2 {
    public static void main(String[] args) {
        int prezo,unidades,prezoTotal;
        Artigos a=new Artigos();
        unidades=a.unidadesArtigo();
        prezo=a.prezoArtigo();
        prezoTotal=a.cantidadePagar();
        a.descontos(unidades, prezo);
    }
    
}
    }
    
}
