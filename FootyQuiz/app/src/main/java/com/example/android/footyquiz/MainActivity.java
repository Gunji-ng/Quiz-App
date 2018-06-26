package com.example.android.footyquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        Toast toast = Toast.makeText(this, scoreMessage(), Toast.LENGTH_LONG);
        toast.show();

        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public String scoreMessage() {

        EditText etUclSuccess = findViewById(R.id.ucl_success);
        String uclSuccessAnswer = etUclSuccess.getText().toString();

        if (Objects.equals(uclSuccessAnswer, "Real Madrid")) {
            score += 1;
        }

        EditText etUclGoalscorer = findViewById(R.id.ucl_goalscorer);
        String uclGoalscorerAnswer = etUclGoalscorer.getText().toString();

        if (Objects.equals(uclGoalscorerAnswer, "Cristiano Ronaldo")) {
            score += 1;
        }

        EditText etLaLigaGoalscorer = findViewById(R.id.la_liga_goalscorer);
        String LaLigaGoalscorerAnswer = etLaLigaGoalscorer.getText().toString();

        if (Objects.equals(LaLigaGoalscorerAnswer, "Lionel Messi")) {
            score += 1;
        }

        EditText etLiverpoolUcl = findViewById(R.id.liverpool_ucl);
        String LiverpoolUclAnswer = etLiverpoolUcl.getText().toString();

        if (Objects.equals(LiverpoolUclAnswer, "5")) {
            score += 1;
        }

        EditText etChelseaUcl = findViewById(R.id.chelsea_ucl);
        String ChelseaUclAnswer = etChelseaUcl.getText().toString();

        if (Objects.equals(ChelseaUclAnswer, "2012")) {
            score += 1;
        }

        RadioGroup rgGermany = findViewById(R.id.germany_radio_group);

        if (rgGermany.getCheckedRadioButtonId() == R.id.rb_mario_gotze) {
            score += 1;
        }

        RadioGroup rgFaCup = findViewById(R.id.fa_cup_radio_group);

        if (rgFaCup.getCheckedRadioButtonId() == R.id.rb_arsenal_fa_cup) {
            score += 1;
        }

        CheckBox cbChelsea = findViewById(R.id.cb_chelsea);
        Boolean chelseaWon = cbChelsea.isChecked();

        CheckBox cbSpurs = findViewById(R.id.cb_spurs);
        Boolean spursWon = cbSpurs.isChecked();

        CheckBox cbMufc = findViewById(R.id.cb_mufc);
        Boolean mufcWon = cbMufc.isChecked();

        CheckBox cbBarcelona = findViewById(R.id.cb_barcelona);
        Boolean barcelonaWon = cbBarcelona.isChecked();

        CheckBox cbMcfc = findViewById(R.id.cb_mcfc);
        Boolean mcfcWon = cbMcfc.isChecked();

        if (spursWon && mcfcWon && !chelseaWon && !mufcWon && !barcelonaWon) {
            score += 1;
        }

        CheckBox cbRonaldo = findViewById(R.id.cb_ronaldo);
        Boolean ronaldoWon = cbRonaldo.isChecked();

        CheckBox cbIniesta = findViewById(R.id.cb_iniesta);
        Boolean iniestaWon = cbIniesta.isChecked();

        CheckBox cbHenry = findViewById(R.id.cb_henry);
        Boolean henryWon = cbHenry.isChecked();

        CheckBox cbMessi = findViewById(R.id.cb_messi);
        Boolean messiWon = cbMessi.isChecked();

        CheckBox cbMaradona = findViewById(R.id.cb_maradona);
        Boolean maradonaWon = cbMaradona.isChecked();

        if (iniestaWon && henryWon && maradonaWon && !ronaldoWon && !messiWon) {
            score += 1;
        }

        CheckBox cbViera = findViewById(R.id.cb_viera);
        Boolean vieraWas = cbViera.isChecked();

        CheckBox cbPires = findViewById(R.id.cb_pires);
        Boolean piresWas = cbPires.isChecked();

        CheckBox cbLampard = findViewById(R.id.cb_lampard);
        Boolean lampardWas = cbLampard.isChecked();

        CheckBox cbSanchez = findViewById(R.id.cb_sanchez);
        Boolean sanchezWas = cbSanchez.isChecked();

        CheckBox cbToure = findViewById(R.id.cb_toure);
        Boolean toureWas = cbToure.isChecked();

        if (vieraWas && piresWas && toureWas && !lampardWas && !sanchezWas) {
            score += 1;
        }

        return "Your Score: " + score + " out of 10";
    }
}
