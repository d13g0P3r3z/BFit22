package bfit22.fernando.com.bfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class RutinaAleatoria extends AppCompatActivity {

    //Instancia de la clase Random que generará aleatoreamente el contenido de un ImageView
    private static final Random rgenerador = new Random();
    //Array de contenido de rutinas
    private static final Integer[] imagenesID =
            {R.drawable.rutina1, R.drawable.rutina2, R.drawable.rutina3, R.drawable.rutina4, R.drawable.rutina5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_aleatoria);

        //Variable que almacenará el contenido del Imageview
        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        //Link a las propiedades del Imageview
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);

        //Evento onClick que genrará las rutinas
        View nextButton = findViewById(R.id.btnNextImg);
        
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
            }
        });
    }



}
