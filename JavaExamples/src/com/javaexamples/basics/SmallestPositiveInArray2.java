package com.javaexamples.basics;

public class SmallestPositiveInArray2 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 5, 6};
		int chk = 0;
        int result = -1;
        boolean flag = true;

        //need to remove negative numbers and
        //sort the given number

        //Pre chek
        if(list[0]>1){
            System.out.println("RESULT === "+(list[0]-1));
            return;
        }

        for (int i = 0; i < list.length; i++) {
            chk = list[i] + 1;
            System.out.println(chk);
            for (int j = i + 1; j < list.length; j++) {
                if (chk == list[j]) {
                    break;
                } else {
                    result = chk;
                    System.out.println("RESULT= " + result);
                    return;
                }
            }

        }
		
	}

}
