package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Integer> get_array(int pLenght){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < pLenght; i++){
	    	Scanner num_in = new Scanner(System.in);
	    	System.out.println("Porfavor ingrese el numero: ");
	    	int num_temp = num_in.nextInt();
	    	result.add(num_temp);
	    }
		return result;
	}
	
	public static void printArray(ArrayList pArray){
		System.out.print("( ");
		for (int i = 0; i < pArray.size(); i++){
			if (i != pArray.size() - 1){
				System.out.print(pArray.get(i) + ", ");
			}else{
				System.out.println(pArray.get(i) + " )");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
		
			//Menu Principal
			System.out.println();
			System.out.println("Bienvenido al operdador de Vectores");
			System.out.println("Seleccione la opcion deseada (0 para salir)");
			System.out.println("1. Suma de Vectores");
			System.out.println("2. Normalizacion de un vector");
			System.out.println("4. Producto Punto");
			System.out.println("5. Magnitud de un vector");
			System.out.println();
			
			//Tomo opcion seleccionada por el usuario
			Scanner opcion_in = new Scanner(System.in);
			String opcion = opcion_in.nextLine();
	
			if ("1".compareTo(opcion) == 0){ //Suma Vectores
				
				//Obtengo el largo de los vectores
				System.out.println("Porfavor ingrese el largo de ambos vectores");
				Scanner largo_in = new Scanner(System.in);
			    int largo = largo_in.nextInt();
			    
			    //Se ingresa el vector 1
			    System.out.println("Porfavor ingrese los valores del vector numero 1");
			    System.out.println();
			    ArrayList<Integer> temp_list1 = get_array(largo);
			    Vector vector1 = new Vector(temp_list1);
			    
			    //Se ingresa el vector 2
			    System.out.println();
			    System.out.println("Porfavor ingrese los valores del vector numero 2");
			    System.out.println();
			    ArrayList<Integer> temp_list2 = get_array(largo);
			    Vector vector2 = new Vector(temp_list2);
			    
			    //Se obtiene el resultado de la suma
			    ArrayList<Integer> result = vector1.sumaVectores(vector2);
			    vector1.setList(result);
			    
			    //Se imprime el resultado
			    System.out.print("El resultado es: ");
			    vector1.print();
			    
	
			}else if ("2".compareTo(opcion) == 0){
				
				//Obtengo el largo del vector
				System.out.println("Porfavor ingrese el largo del vector");
				Scanner largo_in = new Scanner(System.in);
				int largo = largo_in.nextInt();
				
				//Se ingresa el vector
			    System.out.println("Porfavor ingrese los valores del vector");
			    System.out.println();
			    ArrayList<Integer> temp_list = get_array(largo);
			    Vector vector = new Vector(temp_list);
			    
			    //Se obtiene la normalizacion del vector
			    ArrayList<Double> result = vector.Normalizacion();
			    //vector.setList(result);
			    
			    //Se imprime el resultado
			    System.out.print("El resultado es: ");
			    printArray(result);
				
			}else if ("4".compareTo(opcion) == 0){ //Producto Punto
				
				//Obtengo el largo de los vectores
				System.out.println("Porfavor ingrese el largo de ambos vectores");
				Scanner largo_in = new Scanner(System.in);
			    int largo = largo_in.nextInt();
			    
			    //Se ingresa el vector 1
			    System.out.println("Porfavor ingrese los valores del vector numero 1");
			    System.out.println();
			    ArrayList<Integer> temp_list1 = get_array(largo);
			    Vector vector1 = new Vector(temp_list1);
			    
			    //Se ingresa el vector 2
			    System.out.println();
			    System.out.println("Porfavor ingrese los valores del vector numero 2");
			    System.out.println();
			    ArrayList<Integer> temp_list2 = get_array(largo);
			    Vector vector2 = new Vector(temp_list2);
			    
			    //Se obtiene el resultado del producto punto
			    int result = vector1.productoPunto(vector2);
			    
			    //Se imprime el resultado
			    System.out.print("El resultado es: ");
			    System.out.println(result);
		    	
		    }else if ("5".compareTo(opcion) == 0){ //Magnitud de un vector
		    	
		    	//Obtengo el largo del vector
				System.out.println("Porfavor ingrese el largo del vector");
				Scanner largo_in = new Scanner(System.in);
				int largo = largo_in.nextInt();
				
				//Se ingresa el vector
			    System.out.println("Porfavor ingrese los valores del vector");
			    System.out.println();
			    ArrayList<Integer> temp_list = get_array(largo);
			    Vector vector = new Vector(temp_list);
			    
			    //Se obtiene la magnitud del vector
			    double result = vector.magnitud();
			    
			    //Se imprime el resultado
			    System.out.print("El resultado es: ");
			    System.out.println(result);
		    	
		    }else if ("0".compareTo(opcion) == 0){ //Salir
		    	//Se sale del programa
		    	System.out.println("Gracias por usar el operador de vectores");
		    	break;
		    	
		    }else{ // si no es un caracter valido
		    	System.out.println("Operacion Invalida");
		    }
		}

	}

}
