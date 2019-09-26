package com.example.casestudy03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class haiActivity extends AppCompatActivity {
    EditText et_hoten, et_namsinh;
    Button bt_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);

        et_hoten =(EditText)findViewById(R.id.edt_hoten);
        et_namsinh=(EditText)findViewById(R.id.edt_namsinh);
        bt_submit = (Button)findViewById(R.id.btn_submit);
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("tra ve ht",et_hoten.getText().toString());
                intent.putExtra("tra ve ns",et_namsinh.getText().toString());
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }
}
