package com.example.demo;


public class DemoApplication {

	public static void main(String[] args) {
		boolean resultado = false;
		int a[] =  new int[args.length];
		int b[] =  new int[args.length];
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.parseInt(args[i]);
		}
		//rearrange
		int contd = 1;
		int conti = 0;
		int menor = 0;
		for (int i = 0; i < a.length; i++) {
			if(i%2 == 0){
				b[i]=a[conti];
				conti++;
			}else{
				b[i]=a[a.length-contd];
				contd++;
			}
			System.out.println(b[i]);
			if(i == 0){
				menor = b[i];
			}else{
				if(menor < b[i]){
					menor = b[i];
					resultado = true;
				}else{
					resultado =  false;
					break;
				}
			}
		}
		System.out.println(resultado);

	}

}
