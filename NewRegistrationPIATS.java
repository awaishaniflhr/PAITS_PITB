package com.example.paits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class NewRegistrationPIATS extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] animal_type = { "Animal Type 1", "Animal Type 2", "Animal Type 3", "Other"};
    String[] sp_species = { "Species 1", "Species 2", "Species 3", "Other"};
    String[] sp_class = { "Class 1", "Class 2", "Class 3", "Other"};
    String[] sp_breed = { "Breed 1", "Breed 2", "Breed 3", "Other"};
    String[] sp_gender = { "Male", "Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_registration_piats);

//Animal type Start

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spinanimal = (Spinner) findViewById(R.id.sp_animal_type);
        spinanimal.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the animal_type list
        ArrayAdapter aaanimal = new ArrayAdapter(this,android.R.layout.simple_spinner_item,animal_type);
        aaanimal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinanimal.setAdapter(aaanimal);

//Animal type End

//Species Start
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spinspecies = (Spinner) findViewById(R.id.sp_species);
        spinspecies.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the animal_type list
        ArrayAdapter aaspecies = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sp_species);
        aaspecies.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinspecies.setAdapter(aaspecies);

//Species End
//Class Start
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spinclass = (Spinner) findViewById(R.id.sp_class);
        spinspecies.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the animal_type list
        ArrayAdapter aaclass = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sp_class);
        aaclass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinclass.setAdapter(aaclass);

//Breed End
//Class Start
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spinbreed = (Spinner) findViewById(R.id.sp_breed);
        spinspecies.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the animal_type list
        ArrayAdapter aabreed = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sp_breed);
        aabreed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinbreed.setAdapter(aabreed);

//Breed End
//Gender Start
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spingender = (Spinner) findViewById(R.id.sp_gender);
        spingender.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the animal_type list
        ArrayAdapter aagender = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sp_gender);
        aagender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spingender.setAdapter(aagender);

//Gender End




    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
//            Toast.makeText(getApplicationContext(),animal_type[position] , Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(),sp_species[position] , Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(),sp_class[position] , Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(),sp_breed[position] , Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(),sp_gender[position] , Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
