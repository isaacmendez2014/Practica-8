package com.example.geolocalizacion.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Méndez on 02/05/2014.
 */
public class Modelo{
private String lugar;
Modelo(){}

Modelo(String cordenadas){
lugar=cordenadas;
setCordenadas();
}

    public void setCordenadas() {



                lugar = "28.6597766,-106.1140587,18z";
                String nombre = "tel";
                String uri = "geo:" +lugar+ "?q=" + lugar+ "(" + nombre + ")";
}



}

