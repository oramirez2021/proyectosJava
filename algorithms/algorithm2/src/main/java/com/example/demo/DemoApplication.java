package com.example.demo;

//import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


public class DemoApplication {

	public static void main(String[] args) {
		/*int a[] = {3,2,7,-2};
		int n = a.length;
		int b[] = new int[n];
		int aa = 0;
		int bb = 0;
		int cc = 0;
		for (int i = 0; i < n; i++) {
			try{
				aa = a[i-1];
			}catch(Exception e){
				aa = 0;
				e.toString();
			}
			try{
				bb = a[i];
			}catch(Exception e){
				bb = 0;
				e.toString();
			}
			try{
				cc = a[i+1];
			}catch(Exception e){
				cc = 0;
				e.toString();
			}
			b[i] = aa + bb + cc;
			System.out.println(b[i]);
		}*/
		//SOLUTION 2
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int length = scn.nextInt();
		int a[] = new int[length];
		int b[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Please enter the value for the position "+i+": ");
			a[i] = scn.nextInt();
		}
		System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
		System.out.println("Procesando ... ");
		int ii = 0;
		int val1 = 0;
		int val2 = 0;
		int val3 = 0;
		for(int i = 0; i < length;i++){
			try{
				val1 = a[i-1];
			}catch (Exception e){
				val1 = 0;
			}
			val2 = a[i];
			try{
				val3 = a[i+1];
			}catch (Exception e){
				val3 = 0;
			}
			b[ii] = val1+val2+val3;
			ii++;
		}
		System.out.println(b[0]+","+b[1]+","+b[2]+","+b[3]+","+b[4]);
	}

}
