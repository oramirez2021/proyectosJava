package com.example.andelachallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        System.out.println("Hello LeetCoder");
        String banned[]= {"hit"};
        Interview interview = new Interview();
        System.out.println(interview.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit",banned));
    }
}
class Interview{

    public String mostCommonWord(String paragraph, String[] banned) {
        String ban = banned[0];
        paragraph = paragraph.replace(" "+ban,"");
        paragraph = paragraph.replace(",","");
        paragraph = paragraph.replace(".","").toUpperCase();
        String[] arr_para = paragraph.split(" ");
        ArrayList<String> arrayList =  new ArrayList<>();
        for(String word :  arr_para){
            arrayList.add(word);
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        Predicate<String> predicate = null;
        List<String> list = null;
        for(String word: arrayList){
            predicate = text -> text.equals(word);
            list =  arrayList.stream().filter(predicate).collect(Collectors.toList());
            hashMap.put(word,list.size());
        }
        int major = 0;
        for(Integer value : hashMap.values()){
            if(value>major){
                major = value;
            }
        }

        return ""+major;
    }
}