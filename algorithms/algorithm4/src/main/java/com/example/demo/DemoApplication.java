package com.example.demo;

import edu.princeton.cs.algs4.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DemoApplication {

	public static void main(String[] args) {
		String arr[] = args;
		int length = arr.length;
		String new_text = "";
		int con = 0;
		int max_length = arr[0].length();
		//caculating max word length
		for (int i = 1; i < length; i++) {
			if(arr[i].length() > max_length){
				max_length= arr[i].length();
			}
		}
		System.out.println(max_length);
		while (con <= max_length){
			for (int i = 0; i < length; i++) {
				try{
					new_text = new_text + arr[i].substring(con,con+1);
				}catch (Exception e){
					e.toString();
				}

			}
			con++;
		}
		System.out.println(new_text);
	}

}
