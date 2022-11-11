package com.example.devlane;

import java.util.*;


public class Counter {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        String text = scanner.nextLine();
        text = text+"0";
        Interview interview = new Interview();
        System.out.println(interview.cuentaLetras(text));
    }



}
class Interview{
    public String cuentaLetras(String text) {
        String array[] = text.split("");
        int contador = 0;
        String eval = "";
        eval = array[0];
        ArrayList<String> arrayList = new ArrayList<>();
        int cont = 1;
        String cadenaFinal = "";
        for (int i = 1; i < array.length; i++) {
            if(eval.equals(array[i])){
                cont+=1;
            }else{
                arrayList.add(eval);
                arrayList.add(""+cont);
                cadenaFinal = cadenaFinal+eval;
                cadenaFinal = cadenaFinal+cont;
                cont=1;
                eval=array[i];
                if(array[i].equals("0")){
                    break;
                }
            }

        }
        return cadenaFinal;
    }
}
