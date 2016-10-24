package com.example.iuuu.activitystudy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_first);

        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "Button1 is clicked!!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //Intent intent = new Intent("com.example.jared.activitystudy.ACTION_START");
               // Intent intent = new Intent(Intent.ACTION_VIEW);
               // intent.setData(Uri.parse("http://bangumi.bilibili.com/tv/"));
                //Intent intent = new Intent(Intent.ACTION_DIAL);
               // intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
    }
}
