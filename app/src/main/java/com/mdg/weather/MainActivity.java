package com.mdg.weather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Api key to access data fron an api like openWeatherApi
    private static final String APIKEY = "5753db64c667d9ed89962813328c19be";

    //Declaring an object of APIInterface


    //Defining all the views that are in xml file activity_main.xml
    TextView pressure, temp, wind, desc, cityName;
    EditText editText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding all the views from xml file
        //made a method below to keep the code clean
        instantiateViews();

        //Creating the object of APIInterface that we have created earlier, using ApiClient


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getting the data from the edittext
                String zipCode = editText.getText().toString();
                //clearing the data from edittext after getting it into a variable
                editText.getText().clear();
                //fetching data according to the entered zip code
                fetchData(zipCode);
            }
        });
    }

    //method to instantiate all the views
    private void instantiateViews() {
        pressure = findViewById(R.id.pressure);
        temp = findViewById(R.id.temperature);
        wind = findViewById(R.id.wind);
        desc = findViewById(R.id.description);
        cityName = findViewById(R.id.city_name);
        editText = findViewById(R.id.zipcode);
        submit = findViewById(R.id.submit);

    }

    //method that fetch the data using api
    private void fetchData(String zipCode) {


    }


}
