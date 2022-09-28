package com.example.demo;


import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		String s = scaner.nextLine();
		int k = scaner.nextInt();
		System.out.println(getSmallestAndLargest(s,k));
	}
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int longitud = s.length();
		String texto = "";
		int c = k;
		int longitudNuevoArreglo = longitud - k + 1;
		String array[] =  new String[longitudNuevoArreglo];
		//System.out.println(longitudNuevoArreglo);

		for (int i = 0; i < longitud; i++) {
			texto = s.substring(i,c+i);
			array[i]=texto;
			//System.out.println(array[i]);
			if(i + k == longitud){
				break;
			}
		}
		String max = array[0];
		String min = array[0];
		// System.out.println(array);
		for (int i = 1; i < array.length; i++) {
			if(array[i].compareTo(max)>0){
				max = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if(array[i].compareTo(min)<0){
				min = array[i];
			}
		}
       /* System.out.println(max);
       System.out.println(min);*/
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		//return smallest + "\n" + largest;
		return min+"\n"+max;
	}
}
