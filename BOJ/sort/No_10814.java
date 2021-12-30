package Algorithms.BOJ.sort;

import java.io.*;
import java.util.*;

class Person{
    String name;
    int age;
    int num;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }    
}
public class No_10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        List<Person> arr= new ArrayList<Person>();
        for(int i=0; i<N;i++){
            String str1 = br.readLine();
            StringTokenizer St1 = new StringTokenizer(str1," ");
            int age = Integer.parseInt(St1.nextToken());
            String name = St1.nextToken();
            arr.add(new Person(name,age));
        }
        Collections.sort(arr,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
            
        });
        for(Person p : arr){
            bw.write(p.age+" "+p.name+'\n');
        }
        
        bw.flush();
        bw.close();
    
    }  
        
}

