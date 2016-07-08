package com.yby.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yby.areaselector.SelectAreaDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SelectAreaDialog selectAreaDialog = new SelectAreaDialog(this);
        selectAreaDialog.setOnConfirmListener(new SelectAreaDialog.OnConfirmListener() {
            @Override
            public void getData(String provice, String city, String district) {
                Toast.makeText(getApplicationContext(), provice + city + district, Toast.LENGTH_SHORT).show();
            }
        });
        selectAreaDialog.show();
    }
}
