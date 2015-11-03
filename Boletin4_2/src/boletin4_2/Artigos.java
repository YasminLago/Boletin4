package boletin4_2;
//Yasmin

import javax.swing.JOptionPane;

public class Artigos {
    int prezo,unidades;
    
public Artigos(int prezo, int unidades){
    this.prezo=prezo;
    this.unidades=unidades;
}
      public int prezoArtigo(){
      int prezo;
      return(Integer.parseInt(JOptionPane.showInputDialog("Prezo artigo: ")));
    }
      public int unidadesArtigo(){
      int unidades;
      return(Integer.parseInt(JOptionPane.showInputDialog("Nº unidades: ")));
    }

      public int cantidadePagar(){
          return (prezo*unidades);
      }

      public void descontos(int unidades){
          if(unidades<100){
              
          }
          if(100<=unidades && unidades<200){
              
          }
          if(unidades>=200){
              
          }
      }
      
}
      
