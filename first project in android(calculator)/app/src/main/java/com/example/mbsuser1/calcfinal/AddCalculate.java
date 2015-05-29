package com.example.mbsuser1.calcfinal;

/**
 * Created by mbsuser1 on 20/11/14.
 */
final class AddCalculate extends calculate{
    void calculate(){
        if(MainActivity.number.length()!=0)
            MainActivity.answer=MainActivity.answer+Double.parseDouble(MainActivity.number.toString());
    }
}
