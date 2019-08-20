package retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        
        System.out.println("Altura: ");
        r1.setAltura(entrada.nextDouble());
        
        System.out.println("Largura: ");
        r1.setLargura(entrada.nextDouble());
        
        System.out.println("Area :" + r1.calcularArea());
        
        System.out.println(Math.PI);
    }
    
}
