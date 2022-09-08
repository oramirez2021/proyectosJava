package com.example.demo;

import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		//StdOut.println(StdIn.readString());
		String pattern = args[0];
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
		System.out.println("match "+match);

	}

}
