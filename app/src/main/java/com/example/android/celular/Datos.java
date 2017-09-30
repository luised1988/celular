package com.example.android.celular;

import java.util.ArrayList;

/**
 * Created by android on 30/09/2017.
 */

public class Datos {
    public static ArrayList<Celular> celulares = new ArrayList();
    public static void guardarCelular (Celular c){
        celulares.add(c);
    }

    public static  ArrayList<Celular>obteberCelular(){
        return celulares;
    }

}
