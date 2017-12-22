package io.robusta.java.classic;

import java.lang.reflect.Array;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



    String[] buildEmptyArray(int size){
    	String [] result = new String[size];
        return result;
    }

    int[] buildArray(int a, int b, int c){
    	int [] result =new int[3];
    	result[0]=a;
    	result[1]=b;
    	result[2]=c;
        return result;
    }


    boolean equality(int[] array1, int[] array2){
    	boolean result= true;
    	if (array1.length == array2.length){
    	for (int i=0; i<array1.length; i++)
    	if (array1[i] == array2[i]){
    		result = true;
    	}
    	else{
    		result = false;
    		}
    	}
    	else{
    		result = false;
    	}
        return result;
    }

    String asString (int [] numbers){
    	String result= new String();
    	for (int i=0; i<numbers.length; i++){
    		String result_Temp = numbers[i]+":";
    		result = result + result_Temp;
    	}
    	
        return result;
    }

    String asStringJoin (int [] numbers){
    	String result= new String();
    	String result_Temp2= new String();
    	for (int i=0; i<numbers.length-1; i++){
    		String result_Temp = numbers[i]+":";
    		result_Temp2 = result_Temp2 + result_Temp;
    	}
    	result = result_Temp2 +numbers[numbers.length-1];
        return result ;
    }

    String asString (String [] strings){
    	String result= new String();
    	String result_Temp2= new String();
    	for (int i=0; i<strings.length-1; i++){
    		String result_Temp = strings[i]+" ";
    		result_Temp2 = result_Temp2 + result_Temp;
    	}
    	result = result_Temp2 +strings[strings.length-1];
        return result ;
    }

    String asString (Card [] cards){
    	String result= new String();
    	String result_Temp2= new String();
    	for (int i=0; i<cards.length-1; i++){
    		String result_Temp = cards[i]+" ";
    		result_Temp2 = result_Temp2 + result_Temp;
    	}
    	result = result_Temp2 +cards[cards.length-1];
    	String result_fin = "["+result +"]";
        return result_fin ;
    }

}
