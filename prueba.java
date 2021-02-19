import java.util.Scanner;
import java.io.*;

public class prueba{
	
	public static void main (String[] args) {
		System.out.println("prueba");
		createFile();
		
	}
	
	public static void createFile(){
		String palabra;
		int arraySize;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		arraySize = scanner.nextInt();
		
		String[] array = new String[arraySize];
		for (int i = 0; i < array.length; i++){
			System.out.println("Introduce palabra en [" + i + "]");
			array[i] = scanner.next();
		}
		
		try{
			FileWriter writer = new FileWriter (new File ("array.txt"));
			for (int i = 0; i < array.length; i++){
				writer.write(array[i] + "\n");
			}	
			writer.close();
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}

