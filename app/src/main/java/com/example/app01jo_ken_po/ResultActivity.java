package com.example.app01jo_ken_po;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView escolhaP1;
    TextView escolhaP2;
    TextView resultado;

    Button btnReset;

    /*TextView vitoriasP1;
    TextView vitoriasP2;
    TextView empates;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setTitle("Jo-Ken-Po");

        Intent intent = getIntent();
        ArrayList<Integer> players = intent.getIntegerArrayListExtra("players");

        int player1 = players.get(0);
        int player2 = players.get(1);

        /*int contPlayer1 = 0;
        int contPlayer2 = 0;
        int contEmpates = 0;*/

        escolhaP1 = findViewById(R.id.escolhaP1);
        escolhaP2 = findViewById(R.id.escolhaP2);
        resultado = findViewById(R.id.resultado);
        btnReset = findViewById(R.id.btnReset);

        /*vitoriasP1.findViewById(R.id.vitoriasP1);
        vitoriasP2.findViewById(R.id.vitoriasP2);
        empates.findViewById(R.id.empates);*/

        switch (player1) {
            case 1:
                escolhaP1.setText("Player 1 escolheu Pedra");

                if (player2 == 1) {

                    escolhaP2.setText("Player 2 escolheu Pedra");
                    resultado.setText("Empate");
                    //contEmpates++;

                } else if (player2 == 2) {

                    escolhaP2.setText("Player 2 escolheu Papel");
                    resultado.setText("Player 2 Win");
                    //contPlayer2++;

                } else if (player2 == 3) {

                    escolhaP2.setText("Player 2 escolheu Tesoura");
                    resultado.setText("Player 1 Win");
                    //contPlayer1++;
                }
                break;

            case 2:
                escolhaP1.setText("Player 1 escolheu Papel");
                if (player2 == 1) {

                    escolhaP2.setText("Player 2 escolheu Pedra");
                    resultado.setText("Player 1 Win");
                    //contPlayer2++;

                } else if (player2 == 2) {

                    escolhaP2.setText("Player 2 escolheu Papel");
                    resultado.setText("Empate");
                    //contEmpates++;

                } else if (player2 == 3) {

                    escolhaP2.setText("Player 2 escolheu Tesoura");
                    resultado.setText("Player 2 Win");
                    //contPlayer1++;

                }
                break;

            case 3:
                escolhaP1.setText("Player 1 escolheu Tesoura");

                if (player2 == 1) {

                    escolhaP2.setText("Player 2 escolheu Pedra");
                    resultado.setText("Player 2 Win");
                    //contPlayer2++;

                } else if (player2 == 2) {

                    escolhaP2.setText("Player 2 escolheu Papel");
                    resultado.setText("Player 1 Win");
                    //contPlayer1++;

                } else if (player2 == 3) {

                    escolhaP2.setText("Player 2 escolheu Tesoura");
                    resultado.setText("Empate");
                    //contEmpates++;

                }
                break;
        }

        btnReset.setOnClickListener(actInicio());
    }

    private View.OnClickListener actInicio(){
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
    }


    public Context getActivity() {
        return this;
    }
}
