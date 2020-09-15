package com.mohammad.myglobalvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Globalv globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        globalv=(Globalv) getApplicationContext();
        TextView textView=findViewById(R.id.textView1);
        String name=globalv.getName();
        int num =globalv.getNum();
        textView.setText(num + "-" + name);
    }

    public void btn_go_next(View view) {
        globalv.setName("Mohammad Albaba");
        int n=globalv.getNum();
        n++;
        globalv.setNum(n);
        startActivity(new Intent(MainActivity.this,seconedActivity.class));
    }
}
