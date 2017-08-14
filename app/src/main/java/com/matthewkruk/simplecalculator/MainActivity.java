package com.matthewkruk.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView display = null;
    String temp1;
    String temp2;
    CharSequence operator;
    boolean answered = false;
    boolean operation = false;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bDecimal;
    Button bAdd;
    Button bSub;
    Button bMultiply;
    Button bDiv;
    Button bClear;
    Button bSquare;
    Button bSqRt;
    Button bEqual;
    Button bBackSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b_1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b_2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b_3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.b_4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b_5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b_6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b_7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b_8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.b_9);
        b9.setOnClickListener(this);
        b0 = (Button) findViewById(R.id.b_0);
        b0.setOnClickListener(this);
        bDecimal = (Button) findViewById(R.id.b_decimal);
        bDecimal.setOnClickListener(this);
        bAdd = (Button) findViewById(R.id.b_add);
        bAdd.setOnClickListener(this);
        bSub = (Button) findViewById(R.id.b_minus);
        bSub.setOnClickListener(this);
        bMultiply = (Button) findViewById(R.id.b_multiply);
        bMultiply.setOnClickListener(this);
        bDiv = (Button) findViewById(R.id.b_divide);
        bDiv.setOnClickListener(this);
        bClear = (Button) findViewById(R.id.b_clear);
        bClear.setOnClickListener(this);
        bSquare = (Button) findViewById(R.id.b_square);
        bSquare.setOnClickListener(this);
        bSqRt = (Button) findViewById(R.id.b_square_root);
        bSqRt.setOnClickListener(this);
        bEqual = (Button) findViewById(R.id.b_equals);
        bEqual.setOnClickListener(this);
        bBackSpace = (Button) findViewById(R.id.b_back_space);
        bBackSpace.setOnClickListener(this);

        display = (TextView) findViewById(R.id.display);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b_clear:
                display.setText("");
                break;
            case R.id.b_0:
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                display.append(b0.getText());
                break;
            case R.id.b_1:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b1.getText());
                break;
            case R.id.b_2:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b2.getText());
                break;
            case R.id.b_3:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b3.getText());
                break;
            case R.id.b_4:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b4.getText());
                break;
            case R.id.b_5:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b5.getText());
                break;
            case R.id.b_6:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b6.getText());
                break;
            case R.id.b_7:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b7.getText());
                break;
            case R.id.b_8:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b8.getText());
                break;
            case R.id.b_9:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(b9.getText());
                break;
            case R.id.b_decimal:
                if (answered) {
                    display.setText("");
                    answered = false;
                }
                if (operation) {
                    display.setText("");
                    operation = false;
                }
                display.append(bDecimal.getText());
                break;
            case R.id.b_add:
                temp1 = String.valueOf(display.getText());
                operator = bAdd.getText();
                operation = true;
                break;
            case R.id.b_minus:
                temp1 = String.valueOf(display.getText());
                operator = bSub.getText();
                operation = true;
                break;
            case R.id.b_multiply:
                temp1 = String.valueOf(display.getText());
                operator = bMultiply.getText();
                operation = true;
                break;
            case R.id.b_divide:
                temp1 = String.valueOf(display.getText());
                operator = bDiv.getText();
                operation = true;
                break;
            case R.id.b_square:
                temp1 = String.valueOf(display.getText());
                operator = "2";
                operation = true;
                break;
            case R.id.b_square_root:
                temp1 = String.valueOf(display.getText());
                operator = bSqRt.getText();
                operation = true;
                break;
            case R.id.b_back_space:
                display.setText(backSpace(display.getText()));
                break;
            case R.id.b_equals:
                if (temp1 == "") {
                    break;
                }

                temp2 = String.valueOf(display.getText());
                if (temp2 == "") {
                    break;
                }

                double tempCalc1 = Double.parseDouble(temp1);
                double tempCalc2 = Double.parseDouble(temp2);

                String answer = doCalculation(operator.charAt(0), tempCalc1, tempCalc2);

                display.setText(answer);
                temp1 = "";
                temp2 = "";
                answered = true;
                break;
        }
    }

    public String doCalculation(char operator, double temp1, double temp2) {
        double answer = 0;
        switch (operator) {
            case '+':
                answer = temp1 + temp2;
                break;
            case '-':
                answer = temp1 - temp2;
                break;
            case '*':
                answer = temp1 * temp2;
                break;
            case '2':
                answer = temp1 * temp1;
                break;
            case '/':
                if ((temp1 == 0) || (temp2 == 0)) {
                    answer = 0;
                } else {
                    answer = temp1 / temp2;
                }
                break;
            case '√':
                if ((temp1 == 0)) {
                    answer = 0;
                } else {
                    answer = Math.sqrt(temp1);
                }
                break;
        }
        return String.valueOf(answer);
    }

    public CharSequence backSpace(CharSequence s) {
        if (s != null && s.length() > 0) {
            return s.subSequence(0, s.length() - 1);
        } else {
            return s;
        }
    }
}
