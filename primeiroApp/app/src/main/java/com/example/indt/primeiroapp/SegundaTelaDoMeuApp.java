package com.example.indt.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SegundaTelaDoMeuApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela_do_meu_app);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segunda_tela_do_meu_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Funcao que mostra e esconde um elemento da tela
    public void changeButtonVisibility(View view){
        if(this.findViewById(R.id.ImageTelaDois).getVisibility() == View.VISIBLE) {
            this.findViewById(R.id.ImageTelaDois).setVisibility(View.INVISIBLE);
        }
        else{
            this.findViewById(R.id.ImageTelaDois).setVisibility(View.VISIBLE);
        }
    }

}
