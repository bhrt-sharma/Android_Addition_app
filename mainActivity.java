 package com.bharat007sharma7gmail.addapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     TextView t3;
     EditText e1,e2;
     Button b1;  //abhi sirf referance variable create hue hai

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//iss line ki wajah se he layout visible hai

        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2); //findView ka return type View hota hai isliliye issai type cast  karna padhta hai
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button);



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
    }
}
