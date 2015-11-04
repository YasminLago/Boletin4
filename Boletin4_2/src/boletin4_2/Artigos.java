package boletin4_2;
//Yasmin

import javax.swing.JOptionPane;

public class Artigos {
    int prezo,unidades;
    
      public int unidadesArtigo(){
      return(Integer.parseInt(JOptionPane.showInputDialog("Nº unidades: ")));
    }
      
       public int prezoArtigo(){
      return(Integer.parseInt(JOptionPane.showInputDialog("Prezo unitario: ")));
    }

      public int cantidadePagar(){
          int prezoTotal;
          return prezoTotal=(prezo*unidades);
    }

      public void descontos(int unidades,int prezo){
          if(unidades<100){
          JOptionPane.showMessageDialog(null,"Non hay desconto");
          JOptionPane.showMessageDialog(null,"Total a pagar: "+prezo);
          }
         
          if(100<=unidades && unidades<200 && prezo>4000){
            JOptionPane.showMessageDialog(null,"Desconto do 5%");
            JOptionPane.showMessageDialog(null,"Total a pagar: "+(prezo-(prezo*0.05)));  
          }
          
          else if(100<=unidades && unidades<200 && prezo<4000){
          JOptionPane.showMessageDialog(null,"Desconto do 2%");
          JOptionPane.showMessageDialog(null,"Total a pagar: "+(prezo-(prezo*0.02)));
          }  
          if(unidades>=200 && prezo>4000){
          JOptionPane.showMessageDialog(null,"Desconto do 10%");
          JOptionPane.showMessageDialog(null,"Total a pagar: "+(prezo-(prezo*0.10)));
          }
          
          else if(unidades>=200 && prezo<4000){
          JOptionPane.showMessageDialog(null,"Desconto do 8%");
          JOptionPane.showMessageDialog(null,"Total a pagar: "+(prezo-(prezo*0.08)));
          }
      }
      
}
