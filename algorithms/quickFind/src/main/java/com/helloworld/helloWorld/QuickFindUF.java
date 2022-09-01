package com.helloworld.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class QuickFindUF {
	private int[] id;
	public QuickFindUF(int N){
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i]=i;
		}
	}
	public boolean connected(int p, int q){
		return id[p] == id[q];
	}
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if(id[i] == qid){
				id[i] = pid;
			}
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(QuickFindUF.class, args);

	}

}
