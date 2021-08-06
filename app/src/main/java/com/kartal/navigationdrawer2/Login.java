package com.kartal.navigationdrawer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    Button buttonGiris;
    EditText inputUsername, inputPassword;
    TextView textView2;
    List<DatabaseUsers> users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        giris();



    }

    public void giris(){

        buttonGiris = findViewById(R.id.buttonGiris);
        inputUsername = findViewById(R.id.inputUsername);
        inputPassword = findViewById(R.id.sifre);
        textView2 = findViewById(R.id.textView2);


        users = new ArrayList<>();

        //default hesaplar
        users.add(new DatabaseUsers("kaan", "1234"));
        users.add(new DatabaseUsers("yusuf", "1234"));
        users.add(new DatabaseUsers("ali", "1234"));
        users.add(new DatabaseUsers("huseyin", "1234"));
        users.add(new DatabaseUsers("ozan", "1234"));
        try {
            buttonGiris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for(int i = 0; i < users.size()-1; i++) {
                        //kullanıcı listem kadar döngü oluşturdum ki k.adi şifreyi kontrol edebileyim tüm listemde
                        if(inputUsername.getText().toString().toLowerCase().equals(users.get(i).kullaniciAdi)){
                            if(inputPassword.getText().toString().toLowerCase().equals(users.get(i).kullaniciSifre)){
                                Intent intent = new Intent(Login.this,MainActivity.class);
                                startActivity(intent);


                }
            };


                    }
                }
            });
        } catch (Exception e) {

        }

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(Login.this, RegisterActivity.class);
                startActivity(intent2);
            }
        });

    }

}


