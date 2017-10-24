package com.example.fmoya.tuhoroscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;


public class Login extends AppCompatActivity {
//private View Boton;
   private View presiona;
    EditText usu;
    EditText pas;
     String nombre;
     String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       usu=(EditText)findViewById(R.id.usu) ;
        pas=(EditText)findViewById(R.id.pas) ;
        presiona = (ImageButton) findViewById(R.id.presiona);
        presiona.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                nombre = usu.getText().toString();
                password = pas.getText().toString();
                int flag = 0;

                User u1 = new User("Jose", "12345");
                User u2 = new User("Clark", "Kent");
                User u3 = new User("Homero", "Simpson");
                User u4 = new User("Dart", "Vader");
                User u5 = new User("Aureliano", "Buendia");
                ArrayList<User> Usuarios = new ArrayList<>();

                Usuarios.add(u1);
                Usuarios.add(u2);
                Usuarios.add(u3);
                Usuarios.add(u4);
                Usuarios.add(u5);

                if (nombre.trim().equals("") && password.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Agrega datos", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < Usuarios.size(); i++) {
                        if (Objects.equals(Usuarios.get(i).getNombre(), nombre)) {
                            Toast.makeText(getApplicationContext(), "" + Usuarios.get(i).getNombre(), Toast.LENGTH_LONG).show();
                            flag = 1;
                            if (Objects.equals(Usuarios.get(i).getPassword(), password)) {
                                //acceso a Intent Eleccion
                                Intent persona = new Intent(Login.this, Eleccion.class);
                                persona.putExtra("nombre",usu.getText().toString());
                                startActivity(persona);
                            }
                        }
                    }
                }


            }
        });

    }
}
