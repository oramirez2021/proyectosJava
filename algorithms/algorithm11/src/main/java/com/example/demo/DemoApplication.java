package com.example.demo;


import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		String a = scaner.nextLine();
		String b = scaner.nextLine();
		if(isAnagram(a,b)){
			System.out.println("Anagrams");
		}else{
			System.out.println("Not Anagrams");
		}
	}
	static boolean isAnagram(String a, String b) {
		boolean result = true;
		String arrayA[] = a.split("");
		String arrayB[] = b.split("");
		String checkeado = "";
		String evalua = "";
		int contadorA = 0;
		int contadorB = 0;
		if(arrayA.length != arrayB.length){
			result = false;
		}else{
			for (int i = 0; i < arrayA.length; i++) {
				evalua = arrayA[i].toLowerCase();
				if(!checkeado.contains(evalua)){
					for (int j = 0; j < arrayA.length; j++) {
						if(evalua.equals(arrayA[j].toLowerCase())){
							contadorA++;
						}
					}
					for (int j = 0; j < arrayB.length; j++) {
						if(evalua.equals(arrayB[j].toLowerCase())){
							contadorB++;
						}
					}
                    /*System.out.println("contador A: "+ contadorA);
                    System.out.println("contador B: "+ contadorB);*/
					if(contadorA != contadorB){
						result = false;
						break;
					}
				}
				checkeado = checkeado + evalua;
			}
		}

		return result;
	}
}
