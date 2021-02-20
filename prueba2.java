import java.util.Scanner;
import java.io.*;

class prueba2 {
	
	public static void main(String[] args){
		createFile();
		createArray();
	}	
	
	public static void createFile(){
		String frase;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hola mundo");
		System.out.println("Introduce una frase");
		frase = scanner.nextLine();
		
		try{
			FileWriter writer = new FileWriter(new File("prueba.txt"));
			writer.write(frase);
			writer.close();
			System.out.println("Frase escrita");
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void createArray(){
		int arraySize;
		int tempNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array");
		arraySize = scanner.nextInt();
		
		int[][] array = new int[arraySize][arraySize];
		
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				System.out.println("Introduce datos para [" + i + "][" + j + "]");
				array[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				System.out.println("El número en [" + i + "][" + j + "] es: " + array[i][j]);
			}
		}
	}	
		
}