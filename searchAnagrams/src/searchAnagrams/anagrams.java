package searchAnagrams;
import java.io.*;
import java.nio.file.Files;
import java.io.File;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Si son anagramas tiene que tener la misma cantidad de letras
public class anagrams {

	public static void main(String[] args) {
		LinkedList<String> fileData = readFile();
		searchAnagram(fileData);
		//System.out.println(fileData);

	}
	
	
	public static LinkedList<String> readFile() {
		Scanner scanner = new Scanner(System.in);
		
		LinkedList<String> fileData = new LinkedList<String>();
		
		try (
			BufferedReader reader = new BufferedReader
			(new FileReader("/Users/luismiguelrosareyes/Documents/data.txt"))) 
			{
			
				String s;
				
				while((s = reader.readLine()) != null)
				{
					fileData.add(s);
				}
				
			   reader.close();
			   
			} catch (IOException x) {
			    System.err.println(x);
			}
		
		return fileData;
	}
	
	public static void searchAnagram(LinkedList<String> fileData) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> matches = new LinkedList<String> ();
		int count = 0;
		
		for(int i = 0; i < fileData.size(); i++) {
			
			String temp = "";
			System.out.println(i + "i");
			//for(int j = fileData.size()-1; j > -1; j--) {
			//for(int j = 0; j < fileData.size(); j++) {
			for(int j = fileData.indexOf(fileData.get(i))+1; j < fileData.size(); j++) {
				
				//System.out.println(fileData.size());
				System.out.println(j+ "j");
				if(isAnagram(fileData.get(i), fileData.get(j))) {
					temp = temp + fileData.get(j) + " ";
					fileData.remove(fileData.get(j));
					//fileData.set(fileData.indexOf(fileData.get(j)), fileData.get(j)+"+");
					System.out.println(temp);
					j--;
					
				}
				
				//System.out.println(fileData.size()-1);
//				if(isAnagram(fileData.get(i), fileData.get(j)) && j == fileData.size()-1){
//					temp = temp+ fileData.get(i);
//					//fileData.remove(i);
//					
//					matches.add(temp);
//					//System.out.println(count);
//					//scanner.next();
//				}
			}
			if(temp != "") {
			temp = temp + fileData.get(i);
			matches.add(temp);}
		}
		System.out.println(matches);
	}
	public static void searchAnagram2(LinkedList<String> fileData) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> matches = new LinkedList<String> ();
		int count = 0;
		
		for(int i = 0; i < fileData.size(); i++) {
			int j = 0;
			String temp = "";
			System.out.println(i + "i");
			
				//System.out.println(fileData.size());
			System.out.println(j+ "j");
				if(isAnagram(fileData.get(i), fileData.get(j))) {
					temp = temp + fileData.get(j) + " ";
					fileData.remove(fileData.get(j));
					System.out.println(temp);
					
					
				}
				//System.out.println(fileData.size()-1);
//				if(isAnagram(fileData.get(i), fileData.get(j)) && j == fileData.size()-1){
//					temp = temp+ fileData.get(i);
//					//fileData.remove(i);
//					
//					matches.add(temp);
//					//System.out.println(count);
//					//scanner.next();
//				}
			
			matches.add(temp);
		}
		System.out.println(matches);
	}
	
	
	public static boolean isAnagram(String word1, String word2) {
		int i =0;
		boolean matchFound = true;
		boolean matchFound1 = true;
		
		while((i < word1.length()) && (matchFound == true) && (matchFound1 == true)) {
			Pattern pattern = Pattern.compile("["+word1.charAt(i)+"]", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(word2);
		    matchFound = matcher.find();

		    Pattern pattern1 = Pattern.compile("["+word2.charAt(i)+"]", Pattern.CASE_INSENSITIVE);
		    Matcher matcher1 = pattern1.matcher(word1);
		    matchFound1 = matcher1.find();
		    
		    i++;
		}

		return matchFound && matchFound1;
	}
	
	/*
	 FORMAS PARA COMPARAR
	 Primera forma:
	 Algoritmo n^2 que compara cada uno con todos
	 
	 Segunda forma
	 Algoritmo parecido al primero pero que recuerde las coincidencias
	 
	 Tercera forma:
	 -INEFICIENTE-
	 Metodo que devuelva todos los anagramas posibles de una palabra y
	 luego que buscar esas palabras en especifico
	 
	 Cuarta forma:
	 Lo mismo que la segunda forma pero limitando con el numero de 
	 silabas de cada palabra
	 (Op: tener todo el archivo en un string y utilizar regex)
	 */
	

}
