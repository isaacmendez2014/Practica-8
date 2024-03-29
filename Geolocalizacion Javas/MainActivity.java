package com.example.geolocalizacion.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends ActionBarActivity {
String lugar="";
    String Respuesta="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button geo;
        geo = (Button) findViewById(R.id.GeoButton);
        geo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                cor(lugar);



            }
        });

    }


    private void cor(String lugar) {
        Modelo modelo=new Modelo(lugar);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(String.valueOf(modelo)));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){

            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

    }
