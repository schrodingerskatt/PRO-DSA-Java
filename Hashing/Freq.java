// Problem Link : https://www.geeksforgeeks.org/find-frequency-number-array/

import java.util.*;;
public class Freq {

    public static void main(String args[]){
    int [] arrays =  {1, 2, 3, 4, 2, 3, 1, 2, 4, 5, 1, 5, 5};
    HashMap<Integer,Integer>frequencyMap = new HashMap<>();
    for(int number:arrays){
        if(frequencyMap.containsKey(number)){
            frequencyMap.put(number,frequencyMap.get(number)+1);
        }else{
            frequencyMap.put(number,1);
        }
    }
    for(int number: frequencyMap.keySet()){
        int frequency = frequencyMap.get(number);
        System.out.println("Number : "+number+"  Frequency: "+frequency);
    }
    }
    
}

