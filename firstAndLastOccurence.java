package com.maurya;

import java.util.ArrayList;

public class firstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int target = 8;
       brutesearch(arr,target);
       bettersearch(arr,target);
    }
    public static void brutesearch(int[] arr,int target){
        int low = -1;

        int last = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(low==-1){
                    low = i;
                }
                last = i;
            }
        }

        list.add(low);
        list.add(last);
        System.out.println(list);
    }
    public static void bettersearch(int[] arr,int target){
        int low = 0;
        int last = arr.length-1;
        int first =-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(low <= last){
            int mid = (low+last)/2;
            if(arr[mid]==target){
                first = mid;
                last = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }else{
                last = mid-1;
            }
        }
        list.add(first);
        list.add(last);
        System.out.println(list);
    }


    }