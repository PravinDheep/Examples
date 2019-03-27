package com.javaexamples.basics;

import java.util.ArrayList;
import java.util.List;

class SmallestPositiveInArray3 {
//    public int solution(int[] A) {
//        return A[0];
//    }
    
    public static void main(String[] args){
    	SmallestPositiveInArray3 s = new SmallestPositiveInArray3();
        List mylist = new ArrayList<>();

        int[] intList = {-1, 1, 3, 6, 4, 1, 2};
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