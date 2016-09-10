package id.sch.smktelkom_mlg.tugas01.xirpl6001.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvnama, tvHasil;
    EditText etnama, etAsal;
    RadioButton rbPi, rbPa;
    CheckBox cbRPL, cbTKJ, cbMM, cbAnimasi;
    Spinner spAgama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.editTextNama);
        etAsal = (EditText) findViewById(R.id.editTextAsal);
        tvnama = (TextView) findViewById(R.id.textViewNama);
        rbPi = (RadioButton) findViewById(R.id.radioButtonPi);
        rbPa = (RadioButton) findViewById(R.id.radioButtonPa);
        cbRPL = (CheckBox) findViewById(R.id.checkBoxRPL);
        cbTKJ = (CheckBox) findViewById(R.id.checkBoxTKJ);
        cbMM = (CheckBox) findViewById(R.id.checkBoxMM);
        cbAnimasi = (CheckBox) findViewById(R.id.checkBoxAnimasi);
        spAgama = (Spinner) findViewById(R.id.spinnerAgama);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonDaftar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        String nama = etnama.getText().toString();
        String asal = etAsal.getText().toString();
        tvHasil.setText("Selamat " + nama + " yang berasal dari " + asal + " sudah terdaftar. Semoga Sukses TES PSB");
    }


}
