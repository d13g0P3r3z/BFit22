package bfit22.fernando.com.bfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class RutinaAleatoria extends AppCompatActivity {

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID =
            {R.drawable.rutina1, R.drawable.rutina2, R.drawable.rutina3, R.drawable.rutina4, R.drawable.rutina5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_aleatoria);

        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);
        View nextButton = findViewById(R.id.btnNextImg);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
            }
        });
    }



}
