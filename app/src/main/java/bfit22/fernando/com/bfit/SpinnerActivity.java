package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;

public class SpinnerActivity extends AppCompatActivity {


    Spinner fruta;
    Spinner bebida;
    Spinner Comidachatarra;
    Spinner verdura;

    String[] datosFruta = {"Selecciona la fruta...", "Manzana", "Plátano", "Uva", "Naranja"};
    String[] datosBebida = {"Selecciona la bebida...", "Agua", "Coca_Cola", "Limonada", "Cerveza"};
    String[] datosComidaChatarra = {"Selecciona la comida...", "Galletas", "Sabritas", "Chocolate", "Caramelos"};
    String[] datosverdura = {"Selecciona la verdura...", "Tomate", "Cebolla", "Chile", "Chayote"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fruta = (Spinner) findViewById(R.id.FrutaSpinner);
        bebida = (Spinner) findViewById(R.id.BebidaSpinner);
        Comidachatarra = (Spinner) findViewById(R.id.ComidaSpinner);
        verdura = (Spinner) findViewById(R.id.verduraSpinner);

        ArrayAdapter<String> frutaadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosFruta);
        fruta.setAdapter(frutaadapter);
        ArrayAdapter<String> bebidaadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosBebida);
        bebida.setAdapter(bebidaadapter);
        ArrayAdapter<String> comidachatarraadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosComidaChatarra);
        Comidachatarra.setAdapter(comidachatarraadapter);
        ArrayAdapter<String> verduraadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosverdura);
        verdura.setAdapter(verduraadapter);

        fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent manzana = new Intent(SpinnerActivity.this, Manzana.class);
                        startActivity(manzana);
                        break;


                    case 2:
                        Intent platano = new Intent(SpinnerActivity.this, Platano.class);
                        startActivity(platano);
                        break;

                    case 3:
                        Intent uva = new Intent(SpinnerActivity.this, Uva.class);
                        startActivity(uva);
                        break;

                    case 4:
                        Intent naranja = new Intent(SpinnerActivity.this, Naranja.class);
                        startActivity(naranja);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        bebida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent agua = new Intent(SpinnerActivity.this, Agua.class);
                        startActivity(agua);
                        break;

                    case 2:
                        Intent cocacola = new Intent(SpinnerActivity.this, Coca_Cola.class);
                        startActivity(cocacola);
                        break;


                    case 3:
                        Intent limonada = new Intent(SpinnerActivity.this, Limonada.class);
                        startActivity(limonada);
                        break;

                    case 4:
                        Intent chelas = new Intent(SpinnerActivity.this, Chelas.class);
                        startActivity(chelas);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Comidachatarra.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent galletas = new Intent(SpinnerActivity.this, Galletas.class);
                        startActivity(galletas);
                        break;

                    case 2:
                        Intent sabritas = new Intent(SpinnerActivity.this, Sabritas.class);
                        startActivity(sabritas);
                        break;


                    case 3:
                        Intent chocolate = new Intent(SpinnerActivity.this, Chocolate.class);
                        startActivity(chocolate);
                        break;

                    case 4:
                        Intent caramelos = new Intent(SpinnerActivity.this, Caramelos.class);
                        startActivity(caramelos);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        verdura.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent tomate = new Intent(SpinnerActivity.this, Tomate.class);
                        startActivity(tomate);
                        break;

                    case 2:
                        Intent cebolla = new Intent(SpinnerActivity.this, Cebolla.class);
                        startActivity(cebolla);
                        break;


                    case 3:
                        Intent chile = new Intent(SpinnerActivity.this, Chile.class);
                        startActivity(chile);
                        break;

                    case 4:
                        Intent chayote = new Intent(SpinnerActivity.this, Chayote.class);
                        startActivity(chayote);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}