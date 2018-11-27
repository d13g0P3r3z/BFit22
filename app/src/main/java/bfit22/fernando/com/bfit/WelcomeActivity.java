package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WelcomeActivity extends AppCompatActivity {

    private  ImageButton btnInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnInicio=(ImageButton)findViewById(R.id.imageButtoninicio);




        btnInicio.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick (View view){
                //Acceder al segundo activity y mandarle un string
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);

                startActivity(intent);
            }

        });
    }
}
