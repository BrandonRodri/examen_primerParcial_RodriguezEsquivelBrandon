package mx.ipn.cecyt9.examen_primerparcial_rodriguezesquivelbrandon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String usr = "Brandon";
    String pswd = "asd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.usuario);
        EditText contra = findViewById(R.id.contraseña);

        usr = usuario.getText().toString();
        pswd = contra.getText().toString();

    }

    public void ingresar(View view) {
        if(usr.equals("Brandon") && pswd.equals("asd")) {
            Toast toast1 = Toast.makeText(getApplicationContext(),"Usuario incorrecto", Toast.LENGTH_SHORT);
            toast1.show();
        }
        else{
            Toast toast2 = Toast.makeText(getApplicationContext(),"Usuario Correcto", Toast.LENGTH_SHORT);
            toast2.show();
        }
    }

}
