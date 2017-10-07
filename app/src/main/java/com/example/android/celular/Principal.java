package com.example.android.celular;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lstopciones;
    private Resources res;
    private String opc [];
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstopciones = (ListView)findViewById(R.id.lstOpciones);
        res = this.getResources();

        opc = res.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lstopciones.setAdapter(adapter);

        lstopciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Principal.this);
                switch (pos){
                    case 0:
                        i = new Intent(Principal.this,CrearCelular.class);
                        startActivity(i);
                        break;
                    case 1:
                        builder.setTitle("Celulares Apple Color Negro")
                                .setMessage(Metodos.AppleNegros(Datos.obteberCelular()) + "")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                })
                                .show();
                        break;
                    case 2:
                        builder.setTitle("Precio Promedio Celulares Nokia")
                                .setMessage(Metodos.PromedioNokia(Datos.obteberCelular()) + "")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                })
                                .show();
                        break;
                    case 3:
                        i = new Intent(Principal.this, ListadoSamsung.class);
                        startActivity(i);
                        break;

                }
            }
        });
    }

}
