package milanddois;

import java.util.Scanner;

/* autores : Igor , Carlos e Stefany */
public class Main {

	public static void main(String[] args) {

		
        Circulo cir = new Circulo(2.00); 
        Scanner ler =new Scanner(System.in);
        
        cir.setRaio(ler.nextDouble());
        ler.close();
        System.out.println("Area de circulo:"+cir.getArea());
	}

}
