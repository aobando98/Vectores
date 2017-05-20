package logic;

import java.util.*;

public class Vector {
	
	private ArrayList<Integer> list;
	private int lenght;
	
	//Constructor
	public Vector(ArrayList<Integer> pList){
		list = pList;
		lenght = pList.size();
		quickSort(0, lenght - 1);
	}
	
	
	//Setters y Getters
	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	//Otras Funciones

	/**
	 * Funcion para ordenar la lista de menor a mayor
	 * @param lowerIndex indice mas bajo
	 * @param higherIndex indice mas grande
	 */
	private void quickSort(int lowerIndex, int higherIndex) {
        
        int low = lowerIndex;
        int high = higherIndex;
        
        // Se toma como pivote el elemento del medio
        int pivot = list.get(lowerIndex+(higherIndex-lowerIndex)/2);
        
        // Se divide en dos listas
        while (low <= high) {
        	
            while (list.get(low) < pivot) {
                low++;
            }
            
            while (list.get(high) > pivot) {
                high--;
            }
            
            if (low <= high) {
                exchangeNumbers(low, high);
                //move index to next position on both sides
                low++;
                high--;
            }
        }
        // Si no se ha terminado de ordenar se llama recursivamente
        if (lowerIndex < high)
            quickSort(lowerIndex, high);
        if (low < higherIndex)
            quickSort(low, higherIndex);
    }
 
	/**
	 * Funcion para intercambiar dos numeros
	 * @param num1 posicion del numero por cambiar
	 * @param num2 posicion del numero con el cual se hara el cambio
	 */
    private void exchangeNumbers(int num1, int num2) {
        int temp = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, temp);
    }
    
    //Operaciones
    
    /**
     * Funcion para obtener la suma de dos vectores
     * @param pV2 segundo vector por operar
     * @return Vector resultante de la operacion
     */
    public ArrayList<Integer> sumaVectores(Vector pV2){
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	for (int i = 0; i < pV2.lenght; i++){
    		int parcial = this.getList().get(i) + pV2.getList().get(i);
    		result.add(parcial);
    	}
    	
    	return result;
    }
    
    /**
     * Funcion para obtener el producto punto de un vector
     * @param pV2 segundo operando de la operacion
     * @return Resultado de la operacion
     */
    public int productoPunto(Vector pV2){
    	int result = 0;
    	
    	for (int i = 0; i < pV2.lenght; i++){
    		result += this.getList().get(i) * pV2.getList().get(i);
    	}
    	
    	return result;
    }
    
    /**
     * Funcion para sacar la magnitud de un vector
     * @return Magnitud del vector
     */
    public double magnitud(){
    	double result = 0;
    	
    	for (int i = 0; i < this.lenght; i++){
    		result += Math.pow(this.getList().get(i), 2);
    	}
    	
    	result = Math.sqrt(result);
    	
    	return result;
    }
    
    //No se si esta buena
    public double magnitud(Vector pV2){
    	double result = 0;
    	
    	for(int i = 0; i < pV2.lenght; i++){
    		if (i == 0){
    			result += Math.pow(this.getList().get(i), 2);
    		}else if (i == pV2.lenght - 1){
    			result += Math.pow(pV2.getList().get(i), 2);
    		}else{
    			result += Math.pow(this.getList().get(i), 2) * Math.pow(pV2.getList().get(i), 2);
    		}
    	}
    	
    	return result;
    }
    
    public void print(){
    	String result = "( ";
    	
    	for (int i = 0; i < this.lenght; i++){
     		result = ", " + this.getList().get(i);
    	}
    	System.out.println(result);
    }
	

}
