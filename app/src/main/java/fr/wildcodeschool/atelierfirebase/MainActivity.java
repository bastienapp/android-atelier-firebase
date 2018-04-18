package fr.wildcodeschool.atelierfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bAddScore = findViewById(R.id.b_add_score);
        bAddScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etName = findViewById(R.id.et_name);
                EditText etScore = findViewById(R.id.et_score);

                String name = etName.getText().toString();
                String score = etScore.getText().toString();

                if (name.isEmpty() || score.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.error_fill_form, Toast.LENGTH_SHORT).show();
                } else {
                    // TODO : enregistrement des données
                }
            }
        });

        Button bbestScore = findViewById(R.id.b_best_score);
        bbestScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : requête de chargement du meilleur score
            }
        });

        ListView lvScores = findViewById(R.id.lv_scores);
        // TODO : créer l'adapter pour charger les données de Firebase
    }
}
