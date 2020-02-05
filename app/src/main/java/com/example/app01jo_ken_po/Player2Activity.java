package com.example.app01jo_ken_po;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.ContentHandler;
import java.util.ArrayList;

public class Player2Activity extends AppCompatActivity {

    Button btnPedra;
    Button btnPapel;
    Button btnTesoura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);
        getSupportActionBar().setTitle("Jo-Ken-Po");

        btnPedra = findViewById(R.id.btnPedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnTesoura);

        Intent intent = getIntent();
        int player1 = intent.getIntExtra("player1",0);

        btnPedra.setOnClickListener(actNextResult(player1, 1));
        btnPapel.setOnClickListener(actNextResult(player1, 2));
        btnTesoura.setOnClickListener(actNextResult(player1, 3));

    }

    private View.OnClickListener actNextResult(final int player1, final int player2){
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ResultActivity.class);
                ArrayList<Integer> players = new ArrayList();
                players.add(player1);
                players.add(player2);
                intent.putIntegerArrayListExtra("players", players);
                startActivity(intent);
                finish();
            }
        };
    }

    public Context getActivity(){
        return this;
    }
}
