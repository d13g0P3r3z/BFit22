package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    private Button imc;
    private Button podometro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView txt = (TextView) findViewById(R.id.editTextName);
        Button imc = (Button) findViewById(R.id.buttonImc) ;
        Button podometro=(Button) findViewById(R.id.button3);
        Button random = (Button) findViewById(R.id.button2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String greeter = bundle.getString("greeter");
            Toast.makeText(PrincipalActivity.this, greeter, Toast.LENGTH_LONG).show();


        } else {
            Toast.makeText(PrincipalActivity.this, "Está vacío!", Toast.LENGTH_LONG).show();
        }

        imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Acceder al segundo activity y mandarle un string
                Intent intent1 = new Intent(PrincipalActivity.this, ImcActivity.class);

                startActivity(intent1);
            }
        });

        podometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Acceder al segundo activity y mandarle un string
                Intent intent2 = new Intent(PrincipalActivity.this, MainActivityPodometro.class);

                startActivity(intent2);
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Acceder al segundo activity y mandarle un string
                Intent intent3 = new Intent(PrincipalActivity.this, RutinaAleatoria.class);

                startActivity(intent3);
            }
        });
    }

    public void imc(){

    }
}
