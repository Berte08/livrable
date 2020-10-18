package com.example.livrable1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button inscription;
    TextView idenditi, preno,email,mot ,in,pe,em,mo;
    AlertDialog.Builder alertDialog;
    private MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in=(TextView)findViewById(R.id.idennn);
        pe=(TextView)findViewById(R.id.pre);
        em=(TextView)findViewById(R.id.email);
        mo=(TextView)findViewById(R.id.mooo);
        idenditi=(TextView)findViewById(R.id.iden);
        preno=(TextView)findViewById(R.id.pren);
          email=(TextView)findViewById(R.id.emai);
                mot=(TextView)findViewById(R.id.mott);
        inscription=(Button)findViewById(R.id.incrip);
        this.activity=this;


        in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }

        });
        pe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }

        });
        mo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }

        });
        mot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }

        });
        em.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {

            }
        });

        idenditi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        idenditi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        preno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        mot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }

        });


        inscription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder message=new AlertDialog.Builder(activity);
                message.setTitle("Bienvenue");
                message.setMessage(""+preno.getText().toString()+ " "+"vous etes connecter en tant que"+" "+idenditi.getText().toString());
                message.show();
            }
        });



    }
}