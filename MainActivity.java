package com.bharat007sharma7gmail.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t3;
    EditText e1,e2;
    Button b1,b2,b3,b4;  //abhi sirf referance variable create hue hai

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2); //findView ka return type View hota hai isliliye issai type cast  karna padhta hai
        t3=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);



        b1.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick( View v)
                                  {
                                      int a=Integer.parseInt(e1.getText().toString());
                                      int b=Integer.parseInt(e2.getText().toString());
                                      int sum=a+b;
                                      t3.setText("Sum is " + sum );
                                  }
                              }
        );

        b2.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick( View v)
                                  {
                                      int a=Integer.parseInt(e1.getText().toString());
                                      int b=Integer.parseInt(e2.getText().toString());
                                      int sub=a-b;
                                      t3.setText("Diff is " + sub );
                                  }
                              }
        );

        b3.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick( View v)
                                  {
                                      int a=Integer.parseInt(e1.getText().toString());
                                      int b=Integer.parseInt(e2.getText().toString());
                                      int mul=a*b;
                                      t3.setText("Product is " + mul );
                                  }
                              }
        );

        b4.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick( View v)
                                  {
                                      int a=Integer.parseInt(e1.getText().toString());
                                      int b=Integer.parseInt(e2.getText().toString());
                                     if(b!=0)
                                     {
                                         int div=a/b;
                                         t3.setText("Division is " + div );
                                     }
                                      else
                                          t3.setText("Cannot Perform Divsion");
                                  }
                              }
        );





    }
}
