package bfit22.fernando.com.bfit;


import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityPodometro extends AppCompatActivity implements SensorEventListener {

    TextView tv_steps;
    TextView tv_calorias;
    SensorManager sensorManager;
    Button btreinicio;

    boolean running=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_podometro);

        tv_steps=(TextView)findViewById(R.id.tv_steps);
        tv_calorias=(TextView)findViewById(R.id.tv_calories);
        btreinicio=(Button)findViewById(R.id.btnReinicio);
        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
    }





    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    public void onStop(){
        super.onStop();
    }


    @Override
    protected void onResume(){
        super.onResume();
        running=true;
        Sensor countSensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor!=null){
           
            sensorManager.registerListener(this,countSensor,sensorManager.SENSOR_DELAY_FASTEST);
        }else{
            Toast.makeText(this,"Sensor not found", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onPause(){
        super.onPause();
        sensorManager.unregisterListener(this);
    }
    @Override
    public void onRestart(){
        super.onRestart();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (running) {
            tv_steps.setText(String.valueOf(event.values[0]));
            tv_calorias.setText(String.valueOf(event.values[0] *.045));

        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    public void Stop(){
        running=false;
        sensorManager.unregisterListener(this);
    }
    public void Start(){
        running=true;
        Sensor countSensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        sensorManager.registerListener(this,countSensor,sensorManager.SENSOR_DELAY_FASTEST);


    }
public void reinit(View v){


    btreinicio.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View view) {


            tv_steps.setText(String.valueOf(0));
            tv_calorias.setText(String.valueOf(0));




        }
    });

}


}
