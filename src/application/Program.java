package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite uma pasta: ");
		String strpath = sc.nextLine();
		
		File path = new File(strpath);
		
		
		
		//gera uma listagem de pastas do caminho
		
		File[] folders = path.listFiles(File :: isDirectory);
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		//gera uma listagem de arquivos do caminho
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		//cria diretorio 
		boolean sucess = new File(strpath + "\\subdir").mkdir();
		
		System.out.println("diretorio criado com sucesso" + sucess);
		
		sc.close();
		

	}

}
