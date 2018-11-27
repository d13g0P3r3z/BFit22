package bfit22.fernando.com.bfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class RutinaAleatoria extends AppCompatActivity {

    //Se crea instancía un objeto de la clase Random que permitirá acceder al contenido aleatorio de un arreglo de enteros
    private static final Random rgenerador = new Random();

    //se genera un array de enteros que hagan referencia a cada una de la imagenes de las rutinas que aparecerán de manera aleatoria
    private static final Integer[] imagenesID =
            {R.drawable.rutina1, R.drawable.rutina2, R.drawable.rutina3, R.drawable.rutina4, R.drawable.rutina5,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_aleatoria);

        //Se captura el nombre de una imagen aleatoriamente.
        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        //Se captura el contenedor del Image View
        final ImageView iv = (ImageView) findViewById(R.id.routine);

        //Se genera el evento para generar aleatoreamente una rutina
        View nextButton = findViewById(R.id.randomGenertorButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                //Se localiza el recurso de imagen
                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                //Se asigna el recurso de imagen al Image View
                iv.setImageResource(resource);
            }
        });
    }



}
