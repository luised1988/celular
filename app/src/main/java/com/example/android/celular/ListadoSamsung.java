package com.example.android.celular;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListadoSamsung extends AppCompatActivity {

    private TableLayout tblListado;
    private ArrayList<Celular> celulares;
    private String ram2[];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_samsung);

        tblListado = (TableLayout) findViewById(R.id.tblListado);
        celulares = Metodos.ListadoSamsung(Datos.obteberCelular());
        resources = this.getResources();
        ram2 = resources.getStringArray(R.array.memoria_ram);

        for (int i = 0; i < celulares.size(); i++) {
            Celular celular = celulares.get(i);

            TableRow fila = new TableRow(this);
            TextView num = new TextView(this);
            TextView modelo = new TextView(this);
            TextView ram = new TextView(this);
            TextView precio = new TextView(this);
            num.setText((i+1)+"");
            modelo.setText(celular.getModelo());
            ram.setText(ram2[celulares.get(i).getRam()]);
            precio.setText(String.format("$%.2f", celular.getPrecio()));
            fila.addView(num);
            fila.addView(modelo);
            fila.addView(ram);
            fila.addView(precio);
            tblListado.addView(fila);
        }
    }
}
