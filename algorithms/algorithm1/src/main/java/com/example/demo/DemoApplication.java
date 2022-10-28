package com.example.demo;

//import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


public class DemoApplication {

	public static void main(String[] args) {
		//StdOut.println(StdIn.readString());
		/*String pattern = args[0];
		String pattern_splited[] = new String[pattern.length()];
		pattern_splited = pattern.split("");
		String source = args[1];
		String texto_evalua = "";

		int match = 1;
		int pattern_length = pattern.length();
		int source_length = source.length();
		for (int i = 0; i < source_length; i++) {
			texto_evalua = source.substring(i,i+pattern_length);
			System.out.println(texto_evalua);
			for (int j = 0; j < pattern_length; j++) {
				if(pattern_splited[j].equals("0")){
					if(texto_evalua.substring(j,j+1).contains("a") || texto_evalua.substring(j,j+1).contains("e") || texto_evalua.substring(j,j+1).contains("i") || texto_evalua.substring(j,j+1).contains("o")||texto_evalua.substring(j,j+1).contains("u") || texto_evalua.substring(j,j+1).contains("y")){
						match = 1;
					}else{
						match = 0;
						break;
					}
				}else {
					if(texto_evalua.substring(j,j+1).contains("a") || texto_evalua.substring(j,j+1).contains("e") || texto_evalua.substring(j,j+1).contains("i") || texto_evalua.substring(j,j+1).contains("o")||texto_evalua.substring(j,j+1).contains("u") || texto_evalua.substring(j,j+1).contains("y")){
						match = 0;
						break;
					}else{
						match = 1;
					}
				}
			}
			//out of algorithm
			if(i + pattern_length == source_length){
				break;
			}
		}
		System.out.println("match "+match);*/
		//SOLUTION 2//
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a text");
		String text= scn.next();
		String number = scn.next();
		int condition1 = 0;
		int condition2 = 0;
		int condition3 = 0;
		int numberVowels = 0;
		int numberConsonants = 0;
		int numberCeros = 0;
		int numberOnes = 0;
		int match = 0;
		String vowels = "aeiouy";
		//Analysing condition 1
		if (text.length() == number.length()){
			condition1 = 1;
		}
		for (String x : text.split("")) {
			if (vowels.contains(x)){
				numberVowels+=1;
			}else{
				numberConsonants+=1;
			}
		}
		for (String y : number.split("")) {
			if (0 == Integer.parseInt(y)){
				numberCeros+=1;
			}else{
				numberOnes+=1;
			}
		}
		//Analysing condition 2
		if(numberVowels == numberCeros){
			condition2 = 1;
		}
		//Analysing condition 3
		if(numberConsonants == numberOnes){
			condition3 = 1;
		}
		if(condition1 == 1 && condition2 == 1 && condition3 == 1){
			match = 1;
		}
		System.out.println("match :"+match);
	}

}
