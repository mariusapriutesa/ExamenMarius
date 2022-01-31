package com.example.examenmarius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1_cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1_cantidad=(EditText)findViewById(R.id.et_cantidad);
        spinner1=(Spinner) findViewById(R.id.sp1);
        String [] opciones = {"barbacoa","carbonera","4quesos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_examen,opciones);
        spinner1.setAdapter(adapter);
    }
    public void Siguiente(View view){
        String val1_string= et1_cantidad.getText().toString();

        //***************************************
        int val1_int=Integer.parseInt(val1_string);

        if (val1_string.isEmpty()){
            Toast.makeText(this,"Porfavor introduce una cantidad entre 1 y 5",Toast.LENGTH_LONG).show();

        }if (val1_int>=1 &&val1_int <=5){


        String seleccion= spinner1.getSelectedItem().toString();
        if (seleccion.equals("barbacoa")){
                String precio = String.valueOf(10);
                int total = Integer.parseInt(precio) * val1_int;
                String total1= String.valueOf(total);
            Intent i =new Intent(this,MainActivity2.class);
                i.putExtra("cantidad",et1_cantidad.getText().toString());//mandamos et01 al segundo activity
                i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
                i.putExtra("total",total1.toString());//mandamos et01 al segundo activity
            startActivity(i);
            }else if (seleccion.equals("carbonera")){
            String precio = String.valueOf(11);
            int total = Integer.parseInt(precio) * val1_int;
            String total1= String.valueOf(total);
            Intent i =new Intent(this,MainActivity2.class);
            i.putExtra("cantidad",et1_cantidad.getText().toString());//mandamos et01 al segundo activity
            i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
            i.putExtra("total",total1.toString());//mandamos et01 al segundo activity
            startActivity(i);
        }
                else if (seleccion.equals("4quesos")){
            String precio = String.valueOf(9);
            int total = Integer.parseInt(precio) * val1_int;
            String total1= String.valueOf(total);
            Intent i =new Intent(this,MainActivity2.class);
            i.putExtra("cantidad",et1_cantidad.getText().toString());//mandamos et01 al segundo activity
            i.putExtra("precio",precio.toString());//mandamos et01 al segundo activity
            i.putExtra("total",total1.toString());//mandamos et01 al segundo activity
            startActivity(i);
                    }
        }else{
            Toast.makeText(this,"Porfavor introduce una cantidad entre 1 y 5",Toast.LENGTH_LONG).show();
        }
    }



    }



