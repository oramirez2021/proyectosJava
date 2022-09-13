package com.example.demo;

import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class DemoApplication {

	public static void main(String[] args) {
		String strings[] = {"omar","renzo","sergio","michelle","renzo","sergio"};
		//ArrayList lista
		HashMap<String,Integer> mapa = new HashMap<>();
		String texto_evaluar = "";
		int cont = 0;
		int occur = 0;
		int mayor = 0;
		while (cont < strings.length){
			texto_evaluar = strings[cont];
			occur = 0;
			for (int i = 0; i < strings.length; i++) {
				if(texto_evaluar.equals(strings[i])){
					occur++;
				}
			}
			mapa.put(texto_evaluar,occur);
			cont++;
		}
		//determinar el numero mayor de ocurrencias
		for (int x:mapa.values()){
			if(x>mayor){
				mayor = x;
			}
		}
		//determinar el tamanio del arreglo final
		int tamanio_arreglo = 0;
		for (int x:mapa.values()){
			if(x == mayor){
				tamanio_arreglo++;
			}
		}
		String arreglo_final[] = new String[tamanio_arreglo];
		System.out.println(tamanio_arreglo);
		//llenar arreglo final
		int c = 0;
		for (String x:mapa.keySet()){
			if(mapa.get(x) == mayor){
				arreglo_final[c] = x;
				c++;
			}

		}
		//mostrar valores
		for (int i = 0; i < arreglo_final.length; i++) {
			System.out.println(arreglo_final[i]);
		}
		/*System.out.println(mapa);
		System.out.println(arreglo_final);*/
	}

}
