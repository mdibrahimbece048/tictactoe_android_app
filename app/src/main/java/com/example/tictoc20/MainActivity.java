package com.example.tictoc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;// 1
    int flag=0;//2
    int count=0;//8
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;//10


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();


    }
    protected void init(){//3

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }

    // i created a check method for holding all 9 buttons view,it's means we don't need to write individual onClickbutton for each button
    public void check(View view) {//4
        Button btnCurrent = (Button) view;// for type casting//5
        if (btnCurrent.getText().toString().equals("")) {// it means if button is empty then we will go inside if loop ,if button is already filled up with x or 0 then wont go
            count = count + 1;//8
            if (flag == 0) {//6

                btnCurrent.setText("x");
                flag = 1;
            } else {//7
                btnCurrent.setText("0");
                flag = 0;
            }

            if (count > 4) {//9

                b1 = btn1.getText().toString();// whatever btntext is there that will convert to string
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                //conditions
                // for string comparesion we use equals
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    // if winner is declared then we have to restart the game, and for this we have to apple empty text in every button
                    // using setText
                    new Handler().postDelayed(new Runnable() {// 11
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();//11
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                }
                else if(count==9){
                    Toast.makeText(this, "Game is draw", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartgame();
                        }
                    },3000);
                }

            }

        }
    }
    public void restartgame(){
        btn1.setText("");// for set the empty text in button 1
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;
    }


}