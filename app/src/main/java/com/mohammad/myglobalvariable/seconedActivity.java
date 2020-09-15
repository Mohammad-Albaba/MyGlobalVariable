package com.mohammad.myglobalvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class seconedActivity extends AppCompatActivity {
Globalv globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconed);
        globalv=(Globalv)getApplicationContext();
        TextView textView=findViewById(R.id.textView2);
        String name=globalv.getName();
        int num =globalv.getNum();
        textView.setText(num + "-" + name);
    }

    public void btn_go_back(View view) {
        globalv.setName("Abd Alhameeed");
        int n=globalv.getNum();
        n++;
        globalv.setNum(n);
        startActivity(new Intent(seconedActivity.this,MainActivity.class));
    }
}
