package com.javaexamples.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestPositiveInArray {

	public int solution(int[] a) {
		return a[0];
    }
	
	public static void main(String[] args) {
		SmallestPositiveInArray sm = new SmallestPositiveInArray();		
		List mylist = new ArrayList<>();

        int[] intList = {1, 5, 9, 6, 8};
        int result = -1;
        int chk;

        for(int i = 0; i < intList.length; i++) {
			for (int j = i + 1; j < intList.length; j++) {
				if(intList[i] > intList[j]) {
					int temp = intList[i];
					intList[i] = intList[j];
					intList[j] = temp;
				}			
			}
			System.out.println(intList[i]);
		}
        
        
        for (int i = 0; i < intList.length; i++) {
        	
            mylist.add(intList[i]);
        }
        
        //mylist.addAll(mylist);
        System.out.println(mylist);

        for (int i = 0; i < intList.length; i++) {
        	
        	if(intList[0]>1) {
        		result =intList[i]-1;
        		System.out.println(result);
        		break;
        	}
        	
            chk = intList[i] + 1;
            System.out.println(chk);
            if (!mylist.contains(chk)) {
                System.out.println("result " + chk);
                break;
            }
            
        }
		
	}
}