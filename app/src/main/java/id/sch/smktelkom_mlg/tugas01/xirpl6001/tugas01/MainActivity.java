package id.sch.smktelkom_mlg.tugas01.xirpl6001.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvnama, tvHasil;
    EditText etnama, etAsal;
    // RadioButton rbPi, rbPa;
    CheckBox cbRPL, cbTKJ, cbMM, cbAnimasi;
    Spinner spAgama;
    RadioGroup rgJK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.editTextNama);
        etAsal = (EditText) findViewById(R.id.editTextAsal);
        tvnama = (TextView) findViewById(R.id.textViewNama);
        /*rbPi = (RadioButton) findViewById(R.id.radioButtonPi);
        rbPa = (RadioButton) findViewById(R.id.radioButtonPa);*/
        rgJK = (RadioGroup) findViewById(R.id.RadioGroupJK);
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
        if (isValid()) {
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etnama.getText().toString();
        String asal = etAsal.getText().toString();

        if (nama.isEmpty()) {
            etnama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 5) {
            etnama.setError("Nama minimal 5 karakter");
            valid = false;
        } else {
            etnama.setError(null);
        }
        if (asal.isEmpty()) {
            etAsal.setError("Sekolah Asal belum diisi");
            valid = false;
        } else if (asal.length() < 9) {
            etAsal.setError("Nama minimal 9 karakter");
            valid = false;
        } else {
            etAsal.setError(null);
        }
        String jurusan = "Jurusan yang Anda pilih : ";
        int startlen = jurusan.length();
        if (cbRPL.isChecked()) jurusan += cbRPL.getText() + ",";
        if (cbTKJ.isChecked()) jurusan += cbTKJ.getText() + ",";
        if (cbMM.isChecked()) jurusan += cbMM.getText() + ",";
        if (cbAnimasi.isChecked()) jurusan += cbAnimasi.getText() + ",";

        if (jurusan.length() == startlen)
            jurusan = "Isi terlebih dahulu jurusan yang Anda inginkan";
        String jenis = null;
        if (rgJK.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgJK.getCheckedRadioButtonId());
            jenis = rb.getText().toString();
        }
        if (jenis == null) {
            tvHasil.setText("Belum memilih jenis kelamin");
            valid = false;
        } else {
            tvHasil.setText("Selamat " + nama + " yang berasal dari " + asal + " sudah terdaftar.\n " +
                    jurusan);
        }
        return false;
    }


}
