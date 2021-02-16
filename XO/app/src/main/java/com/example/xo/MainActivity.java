package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
   int c=1;
   int flag=0;
   String [][] arr = new String[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        arr[0][0]="q";
        arr[0][1]="w";
        arr[0][2]="e";
        arr[1][0]="r";
        arr[2][0]="t";
        arr[1][1]="y";
        arr[2][1]="u";
        arr[1][2]="i";
        arr[2][2]="b";

    }
    public void whowin(){
        if(arr[0][0]==arr[0][1] && arr[0][1]==arr[0][2]){
            Toast.makeText(this, arr[0][0]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;
        }
        else if(arr[1][0]==arr[1][1]&&arr[1][1]==arr[1][2]){
            Toast.makeText(this, arr[1][1]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[2][0]==arr[2][1]&&arr[2][1]==arr[2][2]){
            Toast.makeText(this, arr[2][2]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[0][0]==arr[1][0]&&arr[1][0]==arr[2][0]){
            Toast.makeText(this, arr[1][0]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[0][1]==arr[1][1]&&arr[1][1]==arr[2][1]){
            Toast.makeText(this, arr[1][1]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[0][2]==arr[1][2]&&arr[1][2]==arr[2][2]){
            Toast.makeText(this, arr[2][2]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]){
            Toast.makeText(this, arr[1][1]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;

        }
        else if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]){
            Toast.makeText(this, arr[2][0]+" Won", Toast.LENGTH_SHORT).show();
            flag=1;
        }
    }
    public void draw(){
        if (flag==0){
            Toast.makeText(this, " DRAW", Toast.LENGTH_SHORT).show();
        }
    }

    public void onclick(View view) {
        if(view.getId()==R.id.btn1){
            if(c%2!=0){
                b1.setText("X");
                c++;
                arr[0][0]="X";
                b1.setTextColor(Color.WHITE);
                b1.setEnabled(false);
                b1.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b1.setText("O");
                arr[0][0]="O";
                b1.setTextColor(Color.RED);
                b1.setEnabled(false);
                b1.setBackgroundColor(Color.WHITE);
            }
        }
      else  if(view.getId()==R.id.btn2){
            if(c%2!=0){
                b2.setText("X");
                c++;
                arr[0][1]="X";
                b2.setTextColor(Color.WHITE);
                b2.setEnabled(false);
                b2.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b2.setText("O");
                arr[0][1]="O";
                b2.setTextColor(Color.RED);
                b2.setEnabled(false);
                b2.setBackgroundColor(Color.WHITE);
            }
        }
      else  if(view.getId()==R.id.btn3){
            if(c%2!=0){
                b3.setText("X");
                c++;
                arr[0][2]="X";
                b3.setTextColor(Color.WHITE);
                b3.setEnabled(false);
                b3.setBackgroundColor(Color.BLACK);

            }

            else{
                c++;
                b3.setText("O");
                arr[0][2]="O";
                b3.setTextColor(Color.RED);
                b3.setEnabled(false);
                b3.setBackgroundColor(Color.WHITE);
            }
        }
       else if(view.getId()==R.id.btn4){
            if(c%2!=0){
                b4.setText("X");
                c++;
                arr[1][0]="X";
                b4.setTextColor(Color.WHITE);
                b4.setEnabled(false);
                b4.setBackgroundColor(Color.BLACK);


            }

            else{
                c++;
                b4.setText("O");
                arr[1][0]="O";
                b4.setTextColor(Color.RED);
                b4.setEnabled(false);
                b4.setBackgroundColor(Color.WHITE);
            }
        }
       else if(view.getId()==R.id.btn5){
            if(c%2!=0){
                b5.setText("X");
                c++;
                arr[1][1]="X";
                b5.setTextColor(Color.WHITE);
                b5.setEnabled(false);
                b5.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b5.setText("O");
                arr[1][1]="O";
                b5.setTextColor(Color.RED);
                b5.setEnabled(false);
                b5.setBackgroundColor(Color.WHITE);
            }
        }

       else if(view.getId()==R.id.btn6){
            if(c%2!=0){
                b6.setText("X");
                c++;
                arr[1][2]="X";
                b6.setTextColor(Color.WHITE);
                b6.setEnabled(false);
                b6.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b6.setText("O");
                arr[1][2]="O";
                b6.setTextColor(Color.RED);
                b6.setEnabled(false);
                b6.setBackgroundColor(Color.WHITE);
            }
        }

       else if(view.getId()==R.id.btn7){
            if(c%2!=0){
                b7.setText("X");
                c++;
                arr[2][0]="X";
                b7.setTextColor(Color.WHITE);
                b7.setEnabled(false);
                b7.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b7.setText("O");
                arr[2][0]="O";
                b7.setTextColor(Color.RED);
                b7.setEnabled(false);
                b7.setBackgroundColor(Color.WHITE);
            }
        }

       else if(view.getId()==R.id.btn8){
            if(c%2!=0){
                b8.setText("X");
                c++;
                arr[2][1]="X";
                b8.setTextColor(Color.WHITE);
                b8.setEnabled(false);
                b8.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b8.setText("O");
                arr[2][1]="O";
                b8.setTextColor(Color.RED);
                b8.setEnabled(false);
                b8.setBackgroundColor(Color.WHITE);
            }
        }


       else if(view.getId()==R.id.btn9){
            if(c%2!=0){
                b9.setText("X");
                c++;
                arr[2][2]="X";
                b9.setTextColor(Color.WHITE);
                b9.setEnabled(false);
                b9.setBackgroundColor(Color.BLACK);
            }

            else{
                c++;
                b9.setText("O");
                arr[2][2]="O";
                b9.setTextColor(Color.RED);
                b9.setEnabled(false);
                b9.setBackgroundColor(Color.WHITE);
            }
        }
        if(c>=6){
            whowin();
        }
        if(c==10){
            draw();
        }

    }

    public void newgame(View view) {
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");
        arr[0][0]="q";
        arr[0][1]="w";
        arr[0][2]="e";
        arr[1][0]="r";
        arr[2][0]="t";
        arr[1][1]="y";
        arr[2][1]="u";
        arr[1][2]="i";
        arr[2][2]="b";
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setBackgroundColor(Color.BLACK);
        b2.setBackgroundColor(Color.BLACK);
        b3.setBackgroundColor(Color.BLACK);
        b4.setBackgroundColor(Color.BLACK);
        b5.setBackgroundColor(Color.BLACK);
        b6.setBackgroundColor(Color.BLACK);
        b7.setBackgroundColor(Color.BLACK);
        b8.setBackgroundColor(Color.BLACK);
        b9.setBackgroundColor(Color.BLACK);

        c=1;
        flag=0;
    }
}