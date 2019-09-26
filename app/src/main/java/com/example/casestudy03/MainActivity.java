package com.example.casestudy03;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button bt_Nhaptt, bt_thoat;
    TextView tv_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_ketqua =(TextView)findViewById(R.id.txtv_ketqua);
        bt_Nhaptt=(Button)findViewById(R.id.btn_nhapthongtin);
        bt_thoat=(Button)findViewById(R.id.btn_thoat);
        bt_Nhaptt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,haiActivity.class);
                startActivityForResult(intent, 9999);
            }
        });
        bt_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 9999 && resultCode == RESULT_OK)
        {
            String st="";
            st +=" ho va ten " + data.getStringExtra("tra ve ht").toString();
            st +="\n nam sinh"+ data.getStringExtra("tra ve ns").toString();
            Calendar calendar = Calendar.getInstance();
            int namsinh = Integer.parseInt(data.getStringExtra("tra ve ns"));
            st += "\n Tuoi: " +((calendar.getTime().getYear() +1900) -namsinh);
            tv_ketqua.setText(st);


        }
    }
}
