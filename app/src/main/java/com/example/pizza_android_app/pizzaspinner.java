package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class pizzaspinner extends AppCompatActivity {
    Spinner spin;
    String data[]={"Deal of the Day","50 % Discount","Coupon Code"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzaspinner);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter=new ArrayAdapter(pizzaspinner.this,
                android.R.layout.simple_list_item_1, data);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                switch(position)

                {
                    case 0:
                        Toast.makeText(pizzaspinner.this, "Get Chicken Tikka pizza at half price", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(pizzaspinner.this, "Cheese Burst Pizza", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(pizzaspinner.this, "PR0809ASR", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

