package Lenin.AppCalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Atributos

    private EditText numero_uno;
    private EditText numero_dos;

    private TextView respuesta;



    //  Metodo Defoult
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_uno= findViewById(R.id.numero_uno);
        numero_dos = findViewById(R.id.numero_dos);

        respuesta = findViewById( R.id.respuesta);

    }

    // Metodo onClick de botones

    public void suma (View view){

        try {

            Integer respuestaNumero = Integer.parseInt( numero_uno.getText().toString()) +
                    Integer.parseInt( numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");              // Siempre que se mande a
                                                                   // imprimir un mensaje es de
                                                                    // tipo texto por lo tanto se
                                                                    // debe usar comillas para el texto

        }catch (Exception e){
            Toast.makeText(this, "Numero no Validos, Escribe 2 numeros", Toast.LENGTH_SHORT).show();
        }

    }

    public void resta (View view) {
        try {

            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) -
                    Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");

        } catch (Exception e) {
            Toast.makeText(this, "Numero no Validos, Escribe 2 numeros", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar (View view) {
        try {

            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) *
                    Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");

        } catch (Exception e) {
            Toast.makeText(this, "Numero no Validos, Escribe 2 numeros", Toast.LENGTH_SHORT).show();
        }
    }

    public void division (View view) {
        try {

            Integer respuestaNumero = Integer.parseInt(numero_uno.getText().toString()) /
                    Integer.parseInt(numero_dos.getText().toString());
            respuesta.setText(respuestaNumero + "");

        } catch (Exception e) {
            Toast.makeText(this, "Numero no Validos, Escribe 2 numeros", Toast.LENGTH_SHORT).show();
        }

    }

    public  void irPoliticas(View view){
        Intent i = new Intent(this,Politicas.class);
        startActivity(i);
    }

}