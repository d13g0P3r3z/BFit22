package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ImcActivity extends AppCompatActivity {
    private TextView textView;
    private Button btn1;
    private final String GREETER = "¡No olvides llenar todos tus datos!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);


        textView = (TextView) findViewById(R.id.textViewMain);


       
    }


    public void calcular(View view) {
        try {

            EditText w = (EditText) findViewById(R.id.peso);
            EditText h = (EditText) findViewById(R.id.altura);
            TextView a = (TextView) findViewById(R.id.resultadito);
            TextView i = (TextView) findViewById(R.id.textimc);

            Switch sex = (Switch) findViewById(R.id.switchSexo);


            float n = Float.parseFloat(w.getText().toString());
            float d = Float.parseFloat(h.getText().toString());
            float y = n / (d * d);
            if (y <= 18.5) {
                btn1 = (Button) findViewById(R.id.buttonImc);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Acceder al segundo activity y mandarle un string
                        Intent intent = new Intent(ImcActivity.this, BajoPesoActivity.class);

                        startActivity(intent);
                    }
                });


            } else if (y >= 18.6 && y <= 24.9) {


                btn1 = (Button) findViewById(R.id.buttonImc);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Acceder al segundo activity y mandarle un string
                        Intent intent = new Intent(ImcActivity.this, NormalActivity.class);

                        startActivity(intent);
                    }
                });
            } else if (y >= 25 && y <= 29.9) {

                btn1 = (Button) findViewById(R.id.buttonImc);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Acceder al segundo activity y mandarle un string
                        Intent intent = new Intent(ImcActivity.this, SobrePesoActivity.class);

                        startActivity(intent);
                    }
                });
            } else if (y >= 30) {

                btn1 = (Button) findViewById(R.id.buttonImc);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Acceder al segundo activity y mandarle un string
                        Intent intent = new Intent(ImcActivity.this, ObesidadActivity.class);

                        startActivity(intent);
                    }
                });

            }
        }
        catch (Exception e){
            Toast.makeText(ImcActivity.this, "¡Vaya, parece que estás tonto!", Toast.LENGTH_LONG).show();
        }
    }


    }

