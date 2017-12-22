package io.robusta.java.classic;

/**
 * Created by nicorama on 22/06/2017.
 */
public class FoodApp {


    static final int TRAVEL_COST = 2;

    int money = 0;
    int foodStock = 1000;



    void reset(){

    }

    int deliver(int food){
    	int result = 0;
    	
    	result = food*TRAVEL_COST;
        return result;
    }

    int deliverAll(int count, int food){

        return 0;
    }


}
