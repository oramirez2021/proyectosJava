package com.example.demo;

//import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		int a[] = {3,2,7,-2};
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
		}

	}

}
