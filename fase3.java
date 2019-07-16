//package com.company;

import java.util.HashMap;
import java.util.Map;

public class fase3 {

    public static void main(String[] args) {

        char [] name1={'J','O','S','E',' ','M','A','R','I','A'};
        char caracter;
        int contador=0;

        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        for (int i=0; i<name1.length; i++){
            caracter=name1[i];
            for (int j=0; j<name1.length; j++){
                if (name1[j]==caracter){
                    contador++;
                }
            }
            //System.out.println(name1[i]+" "+contador);
            charCountMap.put(name1[i], contador);
                    contador = 0;
            }
         // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    }