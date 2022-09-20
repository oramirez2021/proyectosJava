package com.example.demo;


import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		//System.out.println(t);
		//System.out.println((int)Math.pow(2,0));
		//System.out.println(0 + (2 ^ 0) * 2);
		int result = 0;
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			//System.out.println(a+" "+b+" "+n);
			for (int j = 0; j < n; j++) {
				if (j == 0){
					result = a + (int)(Math.pow(2,j)) * b;
				}else{
					result = result + (int)(Math.pow(2,j)) * b;

				}
				if(j == n-1){
					System.out.println(result+" ");
				}else{
					System.out.print(result+" ");
				}

				//System.out.print(j);
			}

		}
		in.close();
	}
}
