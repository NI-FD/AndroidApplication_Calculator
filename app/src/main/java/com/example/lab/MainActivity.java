package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button badd, bsub, bmul, bdiv, bdot, bequal;
    Button bclear, bdel, bgix;

    TextView ans;
    double var1, var2;
    boolean add, sub, mul, div;
    boolean isComplete, isContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.btn_0);
        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b3 = (Button) findViewById(R.id.btn_3);
        b4 = (Button) findViewById(R.id.btn_4);
        b5 = (Button) findViewById(R.id.btn_5);
        b6 = (Button) findViewById(R.id.btn_6);
        b7 = (Button) findViewById(R.id.btn_7);
        b8 = (Button) findViewById(R.id.btn_8);
        b9 = (Button) findViewById(R.id.btn_9);

        badd = (Button) findViewById(R.id.btn_add);
        bsub = (Button) findViewById(R.id.btn_minus);
        bmul = (Button) findViewById(R.id.btn_multipy);
        bdiv = (Button) findViewById(R.id.btn_divide);
        bdot = (Button) findViewById(R.id.btn_dot);
        bequal = (Button) findViewById(R.id.btn_equal);

        bclear = (Button) findViewById(R.id.btn_clear);
        bdel = (Button) findViewById(R.id.btn_del);
        bgix = (Button) findViewById(R.id.Gix);

        ans = (TextView) findViewById(R.id.Result);

        ans.setText(null);

        final DecimalFormat df  = new DecimalFormat("#0.00000");

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                ans.setText(ans.getText()+"9");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String curr = (String) ans.getText();
                if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !") || isComplete){
                    ans.setText(null);
                    isComplete = false;
                }
                if(!curr.contains(".")){
                    ans.setText(ans.getText()+".");
                }
            }
        });

        badd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!add && !sub && !mul && !div){
                    String curr = (String) ans.getText();
                    if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !")){
                        ans.setText(null);
                    }
                    else if(curr.length() != 0){
                        var1 = Double.parseDouble(ans.getText()+"");
                        add = true;
                        ans.setText(null);
                    }
                }else if(ans.getText().length() != 0){
                    var2 = Double.parseDouble(ans.getText()+"");
                    if(add == true){
                        ans.setText(df.format((var1 + var2)) + "");
                        add = false;
                        var1 = var1 + var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(sub == true){
                        ans.setText(df.format((var1 - var2)) + "");
                        sub = false;
                        var1 = var1 - var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(div == true){
                        if(var2 == 0){
                            ans.setText("ERROR");
                        }else{
                            ans.setText(df.format((var1 / var2)) + "");
                        }
                        div = false;
                        var1 = var1 / var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(mul == true){
                        ans.setText(df.format((var1 * var2))+ "");
                        mul = false;
                        var1 = var1 * var2;
                        var2 = 0;
                        isComplete = true;
                    }
                    add = true;
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!add && !sub && !mul && !div){
                    String curr = (String) ans.getText();
                    if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !")){
                        ans.setText(null);
                    }
                    else if(ans.getText().length() == 0){
                        ans.setText("-");
                    }
                    else{
                        var1 = Double.parseDouble(ans.getText()+"");
                        sub = true;
                        ans.setText(null);
                    }
                }else if(ans.getText().length() != 0){
                    var2 = Double.parseDouble(ans.getText()+"");
                    if(add == true){
                        ans.setText(df.format((var1 + var2)) + "");
                        add = false;
                        var1 = var1 + var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(sub == true){
                        ans.setText(df.format((var1 - var2)) + "");
                        sub = false;
                        var1 = var1 - var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(div == true){
                        if(var2 == 0){
                            ans.setText("ERROR");
                        }else{
                            ans.setText(df.format((var1 / var2)) + "");
                        }
                        div = false;
                        var1 = var1 / var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(mul == true){
                        ans.setText(df.format((var1 * var2))+ "");
                        mul = false;
                        var1 = var1 * var2;
                        var2 = 0;
                        isComplete = true;
                    }
                    sub = true;
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!add && !sub && !mul && !div){
                    String curr = (String) ans.getText();
                    if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !")){
                        ans.setText(null);
                    }
                    else if(curr.length() != 0){
                        var1 = Double.parseDouble(ans.getText()+"");
                        mul = true;
                        ans.setText(null);
                    }
                }else if(ans.getText().length() != 0){
                    var2 = Double.parseDouble(ans.getText()+"");
                    if(add == true){
                        ans.setText(df.format((var1 + var2)) + "");
                        add = false;
                        var1 = var1 + var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(sub == true){
                        ans.setText(df.format((var1 - var2)) + "");
                        sub = false;
                        var1 = var1 - var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(div == true){
                        if(var2 == 0){
                            ans.setText("ERROR");
                        }else{
                            ans.setText(df.format((var1 / var2)) + "");
                        }
                        div = false;
                        var1 = var1 / var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(mul == true){
                        ans.setText(df.format((var1 * var2))+ "");
                        mul = false;
                        var1 = var1 * var2;
                        var2 = 0;
                        isComplete = true;
                    }
                    mul = true;
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!add && !sub && !mul && !div){
                    String curr = (String) ans.getText();
                    if(curr.contains("ERROR") || curr.contains("GIX No.1 ! ! !")){
                        ans.setText(null);
                    }
                    else if(curr.length() != 0){
                        var1 = Double.parseDouble(ans.getText()+"");
                        div = true;
                        ans.setText(null);
                    }
                }else if(ans.getText().length() != 0){
                    var2 = Double.parseDouble(ans.getText()+"");
                    if(add == true){
                        ans.setText(df.format((var1 + var2)) + "");
                        add = false;
                        var1 = var1 + var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(sub == true){
                        ans.setText(df.format((var1 - var2)) + "");
                        sub = false;
                        var1 = var1 - var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(div == true){
                        if(var2 == 0){
                            ans.setText("ERROR");
                        }else{
                            ans.setText(df.format((var1 / var2)) + "");
                        }
                        div = false;
                        var1 = var1 / var2;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(mul == true){
                        ans.setText(df.format((var1 * var2))+ "");
                        mul = false;
                        var1 = var1 * var2;
                        var2 = 0;
                        isComplete = true;
                    }
                    div = true;
                }
            }
        });

        bdel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                isComplete = false;
                String curr = (String) ans.getText();
                if(curr.length() != 0){
                    if(curr.length() - 1 == 0){
                        ans.setText(null);
                    }else{
                        ans.setText(curr.substring(0,curr.length()-1));
                    }
                }
            }
        });

        bclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ans.setText(null);
                var1 = 0;
                var2 = 0;
                isComplete = false;
                add = false;
                sub = false;
                mul = false;
                div = false;
            }
        });

        bgix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ans.setText("GIX No.1 ! ! !");
                var1 = 0;
                var2 = 0;
            }
        });

        bequal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ans.getText().length() != 0){
                    var2 = Double.parseDouble(ans.getText()+"");
                    if(add == true){
                        ans.setText(df.format((var1 + var2)) + "");
                        add = false;
                        var1 = 0;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(sub == true){
                        ans.setText(df.format((var1 - var2)) + "");
                        sub = false;
                        var1 = 0;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(div == true){
                        if(var2 == 0){
                            ans.setText("ERROR");
                        }else{
                            ans.setText(df.format((var1 / var2)) + "");
                        }
                        div = false;
                        var1 = 0;
                        var2 = 0;
                        isComplete = true;
                    }

                    if(mul == true){
                        ans.setText(df.format((var1 * var2))+ "");
                        mul = false;
                        var1 = 0;
                        var2 = 0;
                        isComplete = true;
                    }
                }else{
                    ans.setText("ERROR");
                    add = false;
                    sub = false;
                    mul = false;
                    div = false;
                }
            }
        });


    }
}
