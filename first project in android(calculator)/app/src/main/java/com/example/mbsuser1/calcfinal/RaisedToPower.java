package com.example.mbsuser1.calcfinal;

/**
 * Created by mbsuser1 on 21/11/14.
 */
final class RaisedToPower extends calculate{
    void calculate(){
        if(MainActivity.number.length()!=0)
            MainActivity.answer=Math.pow(MainActivity.answer,Double.parseDouble(MainActivity.number.toString()));
    }

}
