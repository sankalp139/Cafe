package com.example.sankalp.cafe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
    TextView t1,t2;
    EditText e1,e2;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.Button1);
        b2=(Button)findViewById(R.id.Button2);
        b3=(Button)findViewById(R.id.Button3);
        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.text);
        e1=(EditText)findViewById(R.id.EditText);
        e2=(EditText)findViewById(R.id.EditText2);
        c1=(CheckBox)findViewById(R.id.checkBox);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                Integer i=Integer.parseInt(s);
                Integer k=i+1;
                if(k>0)
                {
                    String s2=k.toString();
                    t1.setText(s2);}
                else{
                    Toast.makeText(MainActivity.this,"number of Coffee cannot be negative",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                Integer i=Integer.parseInt(s);
                Integer k=i-1;
               if(k>0)
               {
                String s2=k.toString();
                t1.setText(s2);}
                else{
                   Toast.makeText(MainActivity.this,"number of Coffee cannot be negative",Toast.LENGTH_SHORT).show();
               }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                String s3=e1.getText().toString();
                Integer i=Integer.parseInt(s);
                String s4=e1.toString();
//                String s5=e2.toString();
//                String s6=String.format(Locale.ENGLISH,"geo:%f,%f", s4, s5);
//                Uri gmmIntentUri = Uri.parse(s6);
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);
                Integer k=5;
                String s2 = s3 + " Your Bill for " + s + " coffee with cream is " + k.toString();
              Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","abcd", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, s2);
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

//                if(c1.isChecked()) {
//                    Integer k = i * 8;
//                    String s2 = s3 + " Your Bill for " + s + " coffee with cream is " + k.toString();
//                    t2.setText(s2);
//                }
//                else {
//                    Integer k = i * 5;
//                    String s2 = s3 + " Your Bill for " + s + " coffee without cream is " + k.toString();
//                   t2.setText(s2);
            }




        });
    }




    }