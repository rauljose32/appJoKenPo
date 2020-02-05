package com.example.app01jo_ken_po;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPedra;
    Button btnPapel;
    Button btnTesoura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Jo-Ken-Po");

        btnPedra = findViewById(R.id.btnPedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnTesoura);

        btnPedra.setOnClickListener(actNext(1));
        btnPapel.setOnClickListener(actNext(2));
        btnTesoura.setOnClickListener(actNext(3));
    }

    private View.OnClickListener actNext(final int escolha) {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Player2Activity.class);
                intent.putExtra("player1", escolha);
                startActivity(intent);
                finish();
            }
        };
    }

    public Context getActivity() {
        return this;
    }
}
