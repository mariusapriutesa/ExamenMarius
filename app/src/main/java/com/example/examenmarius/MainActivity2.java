package com.example.examenmarius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText et1_tarjeta;
    private TextView soldo1,precioP1,tx_cantidad1,tx_total1,tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1_tarjeta=(EditText) findViewById(R.id.et_tarjeta);
        soldo1=(TextView) findViewById(R.id.soldo);
        precioP1=(TextView) findViewById(R.id.precioP);
        tx_cantidad1=(TextView) findViewById(R.id.tx_cantidad);
        tx_total1=(TextView) findViewById(R.id.tx_total);
        tx1=(TextView) findViewById(R.id.tx_1);


        String et1_cantidad = getIntent().getStringExtra("cantidad");//hemos cogido dato del a activity1
        tx_cantidad1.setText(et1_cantidad);

        String precio = getIntent().getStringExtra("precio");//hemos cogido dato del a activity1
        precioP1.setText(precio + "€");

        String total= getIntent().getStringExtra("total");//hemos cogido dato del a activity1
        tx_total1.setText(total + "€");




    }
    public void tarjeta (View view){
        String val1_String= et1_tarjeta.getText().toString();


        int val1_int= Integer.parseInt(val1_String);

        String resultado = String.valueOf(val1_int);

        soldo1.setText(resultado+ " €");
    }

    public void pagar(View view) {


        String val1_String= et1_tarjeta.getText().toString();
        int val1_int= Integer.parseInt(val1_String);
       //tx_total1.setText(total + "€");

        String total= getIntent().getStringExtra("total");
        int resta1 = Integer.parseInt(total);



        if (resta1<=val1_int){

            int queda = val1_int - resta1 ;
            String resultado = String.valueOf(queda);
            soldo1.setText(resultado+ " €");
            Toast.makeText(this,"Pago realizado correctamente ,"+ "te queda: "+ queda,Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(this,"No tienes suficicente dinero",Toast.LENGTH_LONG).show();

        }

    }
}