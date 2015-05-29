package com.example.mbsuser1.calcfinal;

/**
 * Created by mbsuser1 on 21/11/14.
 */
final class SquareRoot extends calculate {
    void calculate(){
        if(MainActivity.number.length()!=0)
            MainActivity.answer=Math.sqrt(Double.parseDouble(MainActivity.number.toString()));

    }

}
