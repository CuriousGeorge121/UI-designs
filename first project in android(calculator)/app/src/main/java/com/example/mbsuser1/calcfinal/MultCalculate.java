package com.example.mbsuser1.calcfinal;

/**
 * Created by mbsuser1 on 21/11/14.
 */
final public class MultCalculate extends calculate {
    void calculate(){
        if(MainActivity.number.length()!=0)
            MainActivity.answer = MainActivity.answer*Double.parseDouble(MainActivity.number.toString());
    }
}
