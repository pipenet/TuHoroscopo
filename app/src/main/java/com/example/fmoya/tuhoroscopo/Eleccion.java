package com.example.fmoya.tuhoroscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Eleccion extends AppCompatActivity {
    private View rata;
    private View serpiente;
    private View bufalo;
    private View mono;
    private View perro;
    private View cabra;
    private View dragon;
    private View liebre;
    private View jabali;
    private View gallo;
    private View caballo;
    private View tigre;
    private Button Volver;
    TextView minombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion);
        Bundle bundle=getIntent().getExtras();
        minombre=(TextView) findViewById(R.id.minombre);
        minombre.setText(bundle.getString("nombre"));
        Volver= (Button) findViewById(R.id.Volver);
        Volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                    //Volver al inicio//
                Intent volver = new Intent(Eleccion.this, Login.class);
             startActivity(volver);
            }
        });



        rata = (ImageButton) findViewById(R.id.rata);
        rata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Rata//
                Intent intent = new Intent(Eleccion.this, Rata.class);
                startActivity(intent);
            }
        });
        serpiente = (ImageButton) findViewById(R.id.serpiente);
        serpiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Serpiente//
                Intent intent = new Intent(Eleccion.this, Serpiente.class);
                startActivity(intent);
            }
        });
        bufalo = (ImageButton) findViewById(R.id.bufalo);
        bufalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity búfalo//
                Intent intent = new Intent(Eleccion.this, Bufalo.class);
                startActivity(intent);
            }
        });
        mono = (ImageButton) findViewById(R.id.mono);
        mono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Mono//
                Intent intent = new Intent(Eleccion.this, Mono.class);
                startActivity(intent);
            }
        });
        caballo = (ImageButton) findViewById(R.id.caballo);
        caballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Caballo//
                Intent intent = new Intent(Eleccion.this, Caballo.class);
                startActivity(intent);
            }
        });
        cabra = (ImageButton) findViewById(R.id.cabra);
        cabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Cabra//
                Intent intent = new Intent(Eleccion.this, Cabra.class);
                startActivity(intent);
            }
        });
        tigre = (ImageButton) findViewById(R.id.tigre);
        tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Tigre//
                Intent intent = new Intent(Eleccion.this, Tigre.class);
                startActivity(intent);
            }
        });
        jabali = (ImageButton) findViewById(R.id.jabali);
        jabali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Jabali//
                Intent intent = new Intent(Eleccion.this, Jabali.class);
                startActivity(intent);
            }
        });
        perro = (ImageButton) findViewById(R.id.perro);
        perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Perro//
                Intent intent = new Intent(Eleccion.this, Perro.class);
                startActivity(intent);
            }
        });
        dragon = (ImageButton) findViewById(R.id.dragon);
        dragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Dragon//
                Intent intent = new Intent(Eleccion.this, Dragon.class);
                startActivity(intent);
            }
        });
        liebre = (ImageButton) findViewById(R.id.liebre);
        liebre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Liebre//
                Intent intent = new Intent(Eleccion.this, Conejo.class);
                startActivity(intent);
            }
        });
        gallo = (ImageButton) findViewById(R.id.gallo);
        gallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso a activity Gallo//
                Intent intent = new Intent(Eleccion.this, Gallo.class);
                startActivity(intent);
            }
        });

    }
}
