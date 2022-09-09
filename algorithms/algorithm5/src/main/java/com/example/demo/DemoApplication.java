package com.example.demo;

import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		int array[] = new int[args.length];
		int tamano = array.length;
		int contSawTooth = 0;
		int cont = 2;
		int c = 0;
		int sw = 0;
		//boolean array_sawTooth[];
		for (int i = 0; i < tamano; i++) {
			array[i] = Integer.parseInt(args[i]);
 		}
		//System.out.println(array.length);
		while(cont <= tamano){
			//array_sawTooth = new boolean[cont];
			for (int i = 0; i < tamano - 1; i++) {
				if(cont == 2){
					if(array[i] != array[i+1]){
						contSawTooth++;
					}
				}else {
					//zig zag
					c = 0;
					sw = 0;
					for (int j = i; j < i+cont; j++) {
						System.out.println(array[j]);
						try{
							if(array[j] > array[j+1]){
								sw = sw;
							}else {
								sw = 1;
							}
							System.out.println(sw);
						}catch(Exception e){
							e.toString();
						}
						c++;

					}
					System.out.println("****");
				}
				if(i + cont == tamano){
					break;
				}
			}
			cont++;
		}
		System.out.println(contSawTooth);
	}

}
