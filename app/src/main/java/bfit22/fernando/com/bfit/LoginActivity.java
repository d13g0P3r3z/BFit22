package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button btn1;
    private EditText pass;
    private EditText name;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText pass = (EditText) findViewById(R.id.editTextPass);
        EditText email = (EditText) findViewById(R.id.editTextEmail);
        EditText nombree = (EditText) findViewById(R.id.editTextName);
        String nombre = nombree.getText().toString();
        final String GREETER = "¡Bienvenido "+nombre+"! es un gusto poder ayudarte";



            btn1 = (Button) findViewById(R.id.buttonMain);


            btn1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    //Acceder al segundo activity y mandarle un string
                    Intent intent = new Intent(LoginActivity.this, PrincipalActivity.class);
                    intent.putExtra("greeter", GREETER);
                    startActivity(intent);
                }

            });
        }



        }







