package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btsee,btview,btcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btsee=(Button)findViewById(R.id.see);
        btview=(Button)findViewById(R.id.view);
        btcall=(Button)findViewById(R.id.call);

        btsee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intentsee=new Intent(MainActivity.this, pizzalist.class);
                startActivity(intentsee);
            }
        });
        btview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intentview=new Intent(MainActivity.this, pizzaspinner.class);
                startActivity(intentview);
            }
        });
    }
}
