package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.charAt(i)=='\n'){
                    Toast.makeText(MainActivity.this, "entered", Toast.LENGTH_SHORT).show();
                    editText = findViewById(R.id.edittext);

                    String text = editText.getText().toString();

                    Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                    intent.putExtra("extra", text);
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        String text = editText.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText = findViewById(R.id.edittext);

                String text = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                intent.putExtra("extra", text);
                startActivity(intent);
            }
        });
    }

}