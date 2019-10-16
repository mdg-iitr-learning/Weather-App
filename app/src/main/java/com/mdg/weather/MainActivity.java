package com.mdg.weather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String APIKEY = "5753db64c667d9ed89962813328c19be";

    //

    TextView pressure, temp, wind, desc, cityName;
    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instantiateViews();

        //

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zipCode = editText.getText().toString();
                editText.getText().clear();
                fetchData(zipCode);
            }
        });
    }

    private void instantiateViews() {
        pressure = findViewById(R.id.pressure);
        temp = findViewById(R.id.temperature);
        wind = findViewById(R.id.wind);
        desc = findViewById(R.id.description);
        cityName = findViewById(R.id.city_name);
        editText = findViewById(R.id.zipcode);
        submit = findViewById(R.id.submit);

    }

    private void fetchData(String zipCode) {


    }


}
