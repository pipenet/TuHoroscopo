package com.example.fmoya.tuhoroscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mono extends AppCompatActivity {
    private View Volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mono);
        Volver = (Button) findViewById(R.id.Volver);
        Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //acceso al segundo activity//
                Intent intent = new Intent(Mono.this, Login.class);
                startActivity(intent);
            }
        });

    }
}
