package boletin4_1;
//Yasmin

import java.util.Scanner;

public class Cantidade {
    
    public int tecleaCantidade(){
       int cantidade;
    Scanner obx=new Scanner(System.in);
    System.out.println("Cantidade: ");
    return cantidade=obx.nextInt();
    }
    
    public void resultado(int cantidade){
        if(cantidade<500){
            System.out.println("Incremento: 50%");
            System.out.println("Cantidade final: "+((cantidade*0.50)+cantidade));
        }
        if(cantidade>500 && cantidade<1000){
            System.out.println("Incremento: 7%");
            System.out.println("Cantidade final: "+((cantidade*0.07)+cantidade));
        }
        if(cantidade>1000 && cantidade<5000){
            System.out.println("Incremento: 15%");
            System.out.println("Cantidade final: "+((cantidade*0.15)+cantidade));
        }
        if(cantidade>5000){
            System.out.println("Incremento: 3%");
            System.out.println("Cantidade final: "+(cantidade-(cantidade*0.03)));
        }
    }
}
