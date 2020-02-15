package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
	
	private static Entry Instance;
	
	private Scanner scanner;
	
	private Entry() {
		scanner = new Scanner(System.in);
	}
	
	public static Entry GetInstance() {
		if(Instance == null) {
			Instance = new Entry();
		}
		return Instance;
	}
	
	public int GetInt() {
		int option;
		
		try{
			option = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Opção inválida! Certifique-se de inserir apenas números!");
			option = -1;
		}finally {
			scanner.nextLine();
		}
		
		return option;
	}
	
	public String GetString() {
		String option;
		option =  scanner.nextLine();
		return option;
	}
}
