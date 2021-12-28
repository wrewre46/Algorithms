package Algorithms;

import java.io.*;
import java.util.*;
public class MergeSort {
    public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str, " ");
    ArrayList<Integer> arr = new ArrayList<>();
        for (;st.hasMoreTokens();){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Integer[] arr1=arr.toArray(new Integer[arr.size()]);
        merge_sort(arr1);
        for(int i =0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
        // bw.flush();
        // bw.close();
    
    }
    public static void merge_sort(Integer[] arr){
        Integer[] tmp = new Integer[arr.length]; //merge sort는 메모리 공간이 필요하므로 메모리 공간 생성
        merge_sort(arr, tmp,0,arr.length-1);
    }
    public static void merge_sort(Integer[] arr, Integer[] tmp, int start, int end){
        if(start<end){
            int mid = (start+end)/2;  //중간지점 정의
            merge_sort(arr,tmp,start,mid); // 중간지점을 기준으로 반반 나누는 재귀함수 설정
            merge_sort(arr,tmp,mid+1, end);
            merge(arr,tmp,start,mid,end); //정렬하고 합병
        }

    }
    public static void merge(Integer[] arr, Integer[] tmp, int start, int mid, int end){
        for (int i = start; i<=end; i++){
            tmp[i]=arr[i];
        }
        int part1 = start;
        int part2 = mid+1;
        int index = start;
        while(part1<=mid && part2 <=end){
            if(tmp[part1]<= tmp[part2]){
                arr[index]=tmp[part1];
                part1++;
            }
            else{
                arr[index]=tmp[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i<=mid-part1; i++){
            arr[index + i]=tmp[part1+i];
        }
    }

}
