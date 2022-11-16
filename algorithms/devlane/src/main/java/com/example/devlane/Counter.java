package com.example.devlane;

import java.util.*;


public class Counter {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        String text = scanner.nextLine();
        text = text;
        Interview interview = new Interview();
        System.out.println(interview.cuentaLetras(text));
    }



}
class Interview{
    public String cuentaLetras(String text) {
        String array[] = text.split("");
        Integer len = array.length;
        int cont = 0;
        System.out.println(text.indexOf(array[0],2));
        String chr = "";
        String newString = "";
        int pos = 0;
        int i = pos;
        while (i < len){
            chr = array[i];
            for(pos = i;pos<=len;pos++){
                if(text.indexOf(chr,pos)==pos){
                    cont++;
                }else{
                    newString = newString + chr + cont;
                    cont = 0;
                    i = pos;
                    break;
                }
            }
        }

        return newString;
    }
}
