package com.example.mbsuser1.calcfinal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    static double answer=0;
    TextView disp;
    static StringBuffer number= new StringBuffer("");
    static calculate doMath = new AddCalculate();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp=(TextView)findViewById(R.id.editText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void num(View view){

        Button bt = (Button)view;
        disp.append(bt.getText());
        number = number.append((String) bt.getText());
        setText(number.toString());


    }

    public void add(View view){
        doMath.calculate();
        number.setLength(0);
        setText("x");
        doMath=new AddCalculate();

    }

    public void sub(View view){
        doMath.calculate();
        number.setLength(0);
        setText("-");
        doMath=new SubtractCalculate();
    }

    public void multiply(View view){
        doMath.calculate();
        number.setLength(0);
        setText("x");
        doMath = new MultCalculate();
    }

    public void divide(View view){
        doMath.calculate();
        number.setLength(0);
        setText("÷");
        doMath = new DivideCalculate();
    }

    public void SquareRoot(View view){
        doMath.calculate();
        //number.setLength(0);
       doMath = new SquareRoot();


    }

    public void RaisedToPower(View view){
        doMath.calculate();
        number.setLength(0);
        setText("^");
        doMath = new RaisedToPower();
    }

    public void AC (View view){
        answer = 0;
        number.setLength(0);
        setText(number.toString());
        doMath = new AddCalculate();
    }

    public void percent(View view){
        doMath.calculate();
        number.setLength(0);
        setText("%");
        doMath=new PercentCalculate();
    }

    public void equal(View view){
        doMath.calculate();
        number.setLength(0);
        setText(killZero(answer));

    }

    public void delete(View view) {
        String temp = String.valueOf(number);
        String temp2 = "0";
        if (temp.length() > 1) {
            temp = temp.substring(0, temp.length() - 1);
            double d = Double.valueOf(temp);
            StringBuffer strbuf;
            strbuf = new StringBuffer(temp);
            number = strbuf;
            setText(killZero(d));


        } else if (temp.length() <= 1) {
/*
            StringBuffer strbuf2;
            strbuf2 = new StringBuffer(temp2);
            number = strbuf2;

            String s = strbuf2.toString();// convert StringBuffer to string
            double num=Double.parseDouble(s);//convert string to double

           setText(killZero(num));
           */
            //answer = 0;
            number.setLength(0);
            setText(number.toString());
            doMath = new AddCalculate();
        }
    }









    void setText(String st){
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(st);
    }


    String killZero(Double number){
        if (number == 0) return("0");

        String temp = String.valueOf(number);
        int i = temp.length()-1;

        if (temp.contains(".")){
            while (temp.charAt(i) == '0')
                i--;
            if (temp.charAt(i) == '.') i--;
        }

        return(temp.substring(0,i+1));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
    /*



    } public void delete(View view) {
        doMath.calculate();
        number.setLength(0);
        doMath = new delete();
        setText(killZero(answer));}
*/