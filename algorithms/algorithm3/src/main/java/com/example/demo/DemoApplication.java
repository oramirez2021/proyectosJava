package com.example.demo;

import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		int n = 5;
		int k = Integer.parseInt(args[0]);
		int a[] = {5,9,1,9,1};
		int b[] = {5,6,5,1,8};
		int tinyTotal = 0;
		int x = 0;
		int y = 0;
		int number = 0;
		for (int i = 0; i < n; i++) {
			x = a[i];
			y = b[n-1-i];
			number = Integer.parseInt(""+x+y);
			if (number < k){
				tinyTotal++;
			}
		}
		System.out.println(tinyTotal);
	}

}
