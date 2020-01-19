package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator{
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumbersE = new ArrayList<>();

        for (int i = 0; 0 < numbers.size(); i++){
            if(numbers.get(i) %2 == 0){
                oddNumbersE.add(numbers.get(i));
            }
        }
        return oddNumbersE;
    }
}
