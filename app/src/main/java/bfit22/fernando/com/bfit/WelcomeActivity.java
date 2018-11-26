package bfit22.fernando.com.bfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btn1=(Button) findViewById(R.id.buttonMain);


        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick (View view){
                //Acceder al segundo activity y mandarle un string
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);

                startActivity(intent);
            }

        });
    }
}
