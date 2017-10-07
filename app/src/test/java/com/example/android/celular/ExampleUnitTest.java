package com.example.android.celular;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void celulares_apple_negros_correcto() throws Exception {
        Celular c1 = new Celular("Apple iPhone 7",1 ,1 ,2 , 1, 1900000);
        Celular c2 = new Celular("Apple iPhone 6s",1 ,1 ,1 , 1, 1900000);
        Celular c3 = new Celular("Samsung Galaxy S8",0, 0, 2, 1, 2300000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        assertEquals(2, Metodos.AppleNegros(celulares));
    }

    @Test
    public void celulares_apple_negros_incorrecto() throws Exception {
        Celular c1 = new Celular("Apple iPhone 7",1 ,1 ,2 , 1, 1900000);
        Celular c2 = new Celular("Apple iPhone 6s",1 ,1 ,1 , 1, 1900000);
        Celular c3 = new Celular("Samsung Galaxy S8",0, 0, 2, 1, 2300000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        assertNotEquals(1, Metodos.AppleNegros(celulares));
    }

    @Test
    public void promedio_nokia_correcto() throws Exception {
        Celular c1 = new Celular("Nokia Lumia 620", 2, 0, 1, 0, 400000);
        Celular c2 = new Celular("Nokia Lumia 635", 2, 0, 1, 0, 200000);
        Celular c3 = new Celular("Samsung Gakaxy S6", 0, 0, 1, 1, 1200000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        assertEquals(300000, Metodos.PromedioNokia(celulares), 0);
    }

    @Test
    public void promedio_nokia_incorrecto() throws Exception {
        Celular c1 = new Celular("Nokia Lumia 620", 2, 0, 1, 0, 400000);
        Celular c2 = new Celular("Nokia Lumia 635", 2, 0, 1, 0, 200000);
        Celular c3 = new Celular("Samsung Gakaxy S6", 0, 0, 1, 1, 1200000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        assertNotEquals(600000, Metodos.PromedioNokia(celulares), 0);
    }

    @Test
    public void samsung_negros_android_correcto() throws Exception {
        Celular c1 = new Celular("Apple iPhone 7",1 ,1 ,2 , 1, 1900000);
        Celular c2 = new Celular("Apple iPhone 6s",1 ,1 ,1 , 1, 1900000);
        Celular c3 = new Celular("Samsung Galaxy S8",0, 0, 2, 1, 2300000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        ArrayList<Celular> correctos = new ArrayList<>();
        correctos.add(c3);

        assertEquals(correctos, Metodos.ListadoSamsung(celulares));
    }

    public void samsung_negros_android_incorrecto() throws Exception {
        Celular c1 = new Celular("Apple iPhone 7",1 ,1 ,2 , 1, 1900000);
        Celular c2 = new Celular("Apple iPhone 6s",1 ,1 ,1 , 1, 1900000);
        Celular c3 = new Celular("Samsung Galaxy S8",0, 0, 2, 1, 2300000);

        ArrayList<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);

        ArrayList<Celular> correctos = new ArrayList<>();
        correctos.add(c3);
        correctos.add(c1);

        assertNotEquals(correctos, Metodos.ListadoSamsung(celulares));
    }

}