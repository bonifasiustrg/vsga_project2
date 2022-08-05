package com.takasima.vsga_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout etUsername = findViewById(R.id.et_username);
        TextInputLayout etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // mengambil input username & password user
                String username = etUsername.getEditText().getText().toString();
                String password = etPassword.getEditText().getText().toString();

//                if (username == "jmp-a" && password == "123") {
                if (username.equals("jmp-a") && password.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, DaftarNegaraActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Username atau password salah!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}