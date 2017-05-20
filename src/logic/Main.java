package logic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
		
			//Menu Principal
			System.out.println("Bienvenido al operdador de Vectores");
			System.out.println("Seleccione la opcion deseada (0 para salir)");
			System.out.println("1. Suma de Vectores");
			System.out.println("4. Producto Punto");
			System.out.println("5. Magnitud de un vector");
			
			//Tomo opcion seleccionada por el usuario
			Scanner opcion_in = new Scanner(System.in);
			String opcion = opcion_in.nextLine();
	
			if ("1".compareTo(opcion) == 0){ //Suma Vectores
	
			}else if ("4".compareTo(opcion) == 0){ //Producto Punto
		    	
		    }else if ("5".compareTo(opcion) == 0){ //Magnitud de un vector
		    	
		    }else if ("0".compareTo(opcion) == 0){ //Salir
		    	break;
		    }else{
		    	System.out.println("Operacion Invalida");
		    }
		}

	}

}
