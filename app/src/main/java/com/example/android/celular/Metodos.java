package com.example.android.celular;

import java.util.ArrayList;

/**
 * Created by Luis on 6/10/2017.
 */

public class Metodos {

  public static int AppleNegros (ArrayList<Celular>celulares){
      int a = 0;

      for (int i = 0; i < celulares.size(); i++){
          Celular celular = celulares.get(i);
          if (celular.getMarca()== 1 && celular.getColor() == 1){
              a++;
          }
      }return a;
  }

    public static double PromedioNokia(ArrayList<Celular> celulares) {
        double suma = 0;
        int cant = 0;

        for (int i = 0; i < celulares.size(); i++) {
            Celular celular = celulares.get(i);
            if (celular.getMarca() == 2) {
                suma += celular.getPrecio();
                cant++;
            }
        }

        if (cant == 0) return suma;
        else return suma / cant;
    }

    public static ArrayList<Celular> ListadoSamsung(ArrayList<Celular> celulares) {
        ArrayList<Celular> s = new ArrayList<>();

        for (int i = 0; i < celulares.size(); i++) {
            Celular celular = celulares.get(i);
            if (celular.getMarca() == 0 && celular.getColor() == 1 && celular.getSistema() == 0) {
                s.add(celular);
            }
        }

        return s;
    }

}
