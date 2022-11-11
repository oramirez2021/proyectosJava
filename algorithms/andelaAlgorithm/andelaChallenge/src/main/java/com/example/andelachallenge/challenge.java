package com.example.andelachallenge;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        System.out.println("Hello LeetCoder");
        String banned[]= {"hit"};
        Interview interview = new Interview();
        Scanner scanner =  new Scanner(System.in);
        //paragraph: Bob hit a ball, the hit BALL flew far after it was hit.
        System.out.println(interview.mostCommonWord(scanner.nextLine(),banned));
    }
}
class Interview{

    public String mostCommonWord(String paragraph, String[] banned) {
        String ban = banned[0];
        paragraph = paragraph.replace(" "+ban,"").replace(",","").replace(".","").toUpperCase();
        List<String> arrayList = Arrays.asList(paragraph.split(" "));
        HashMap<String, Integer> hashMap = new HashMap<>();
        Predicate<String> predicate = null;
        Integer contador = 0;
        int major = 0;
        for(String word: arrayList){
            predicate = text -> text.equals(word);
            contador = arrayList.stream().filter(predicate).collect(Collectors.toList()).size();
            hashMap.put(word,contador);
            //calculatin the major
            if (contador>major){
                major = contador;
            }
        }
        return ""+major;
    }


}