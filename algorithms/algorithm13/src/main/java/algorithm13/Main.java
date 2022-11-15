package algorithm13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] numers = {2,3,6,9,45,88};
        int x =16;
        boolean result =  false;
        ArrayList<Integer> eval = new ArrayList<Integer>();
        for (int i = 0; i < numers.length; i++) {
            if(numers[i]<x){
                eval.add(numers[i]);
            }
        }
        int a  = 0;
        int b = 0;
        for (int i : eval) {
            a = i;
            for(int j=0;j<eval.size();j++){
                b = eval.get(j);
                if((a+b==x)&&(a!=b)){
                    result = true;

                }
            }
        }

        System.out.println(result);
    }
}