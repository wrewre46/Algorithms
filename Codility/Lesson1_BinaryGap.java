package Codility;

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
 
    public int solution(int N) {
        // write your code in Java SE 8
        int count=0;
        int Max_count=0;
        int check_One=0;
        List<Integer> Binary= new ArrayList<>();
        while(N!=0){
            Binary.add(N%2);
            N=N/2;
        }
        for(int i =Binary.size()-1; i>=0;i--){
            if(Binary.get(i)==1) check_One++;
            if(Binary.get(i)==0){
                count++;        
            } 
            if(check_One==2){
                if(Max_count<count) Max_count=count;
                check_One=1;
            }
        }
        if(Max_count==0) return 0;
        else return Max_count;
    }
}