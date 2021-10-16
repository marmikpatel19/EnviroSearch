package com.example.envirosearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // User input variable declarations
    String companyName;
    EditText companyNameInput;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturing user input
       /* companyNameInput = (EditText)findViewById(R.id.companyNameInput);
        searchButton = (Button)findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                companyName = companyNameInput.getText().toString();
            }
        }
        );
        Log.d("googleUtil", "TESTING");
        // Send company name to googleUtil.java for search result processing
        googleUtil.getSearchResults(companyName);*/


    }
    public void onBtnClick(View view){
        companyNameInput = (EditText)findViewById(R.id.companyNameInput);
        companyName = companyNameInput.getText().toString();

        //Log.d("googleUtil", companyName);
        // Send company name to googleUtil.java for search result processing
        googleUtil.getSearchResults(companyName);
    }
}