package com.takasima.vsga_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DaftarNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_negara);

        ArrayList<String> listNegara = new ArrayList<>();
        listNegara.add("Indonesia");
        listNegara.add("Malaysia");
        listNegara.add("Thailand");
        listNegara.add("Vietnam");
        listNegara.add("Timor Leste");
        listNegara.add("Filipina");
        listNegara.add("Laos");
        listNegara.add("Singapura");
        listNegara.add("Myanmar");
        listNegara.add("Brunei Darussalam");

        EditText etNegara = findViewById(R.id.et_negara);
        Button btnSubmit = findViewById(R.id.btn_submit);
        ListView lvNegara = findViewById(R.id.lv_negara);

        // adapter view list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listNegara);
        lvNegara.setAdapter(adapter);

        // setonclick
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaNegara = etNegara.getText().toString();

                if (namaNegara != ""){
//                    cara1
//                    adapter.add(namaNegara);
//                    cara2
                    listNegara.add(namaNegara);
                    adapter.notifyDataSetChanged();
                    etNegara.setText("");

                }else{
                    Toast.makeText(DaftarNegaraActivity.this, "Isian tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}