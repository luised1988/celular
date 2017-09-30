package com.example.android.celular;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearCelular extends AppCompatActivity {

    private EditText cajamodeloCelular,cajaPrecio;
    private Resources res;
    private Spinner cajaMarca;
    private Spinner cajaSistema;
    private Spinner cajaRam;
    private Spinner cajaColor;
    private String [] marcaCelular;
    private String [] sistemaOperativo;
    private String [] memoria;
    private String [] color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);

        cajamodeloCelular = (EditText)findViewById(R.id.txtModeloCelular);
        cajaPrecio = (EditText)findViewById(R.id.txtPrecio);
        cajaMarca = (Spinner)findViewById(R.id.spnMarcaCelular);
        cajaSistema = (Spinner)findViewById(R.id.spnSistemaOperativo);
        cajaRam = (Spinner)findViewById(R.id.spnRam);
        cajaColor = (Spinner)findViewById(R.id.spnColor);

        res = this.getResources();

        marcaCelular = res.getStringArray(R.array.marca_celular);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,marcaCelular);
        cajaMarca.setAdapter(adapter);

        sistemaOperativo = res.getStringArray(R.array.sistema_operativo);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sistemaOperativo);
        cajaSistema.setAdapter(adapter2);

        memoria = res.getStringArray(R.array.memoria_ram);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,memoria);
        cajaRam.setAdapter(adapter3);

        color = res.getStringArray(R.array.color);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,color);
        cajaColor.setAdapter(adapter4);

    }


    public void guardar (View v){
        String modelo;
        int marca;
        int sistema;
        int ram;
        int color;
        double precio;

        modelo = cajamodeloCelular.getText().toString();
        precio = Double.parseDouble(cajaPrecio.getText().toString());

        marca = cajaMarca.getSelectedItemPosition();
        sistema = cajaSistema.getSelectedItemPosition();
        ram = cajaRam.getSelectedItemPosition();
        color = cajaColor.getSelectedItemPosition();

        Celular c= new Celular(modelo,marca,sistema,ram,color,precio);
        c.guardar();


        Toast.makeText(this,res.getString(R.string.celular_creado),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(){
        cajamodeloCelular.setText("");
        cajaPrecio.setText("");
        cajaMarca.setSelection(0);
        cajaSistema.setSelection(0);
        cajaRam.setSelection(0);
        cajaColor.setSelection(0);

    }
}
