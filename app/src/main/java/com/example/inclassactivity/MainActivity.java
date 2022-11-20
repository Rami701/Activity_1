package com.example.inclassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTitle;
    private Spinner spnDays;
    private Switch swiImportant;
    private Button btnAdd;
    private TextView viewTasks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }

    public void setUp (){
        editTitle = findViewById(R.id.editTitle);
        spnDays = findViewById(R.id.spnDays);
        swiImportant = findViewById(R.id.swiImportant);
        btnAdd = findViewById(R.id.btnAdd);
        viewTasks = findViewById(R.id.viewTasks);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String allTasks = viewTasks.getText().toString();
                String newTask = editTitle.getText().toString();
                String day = spnDays.getSelectedItem().toString();
                String isImportant = "";
                if(swiImportant.isChecked()){
                    isImportant = "Important";
                }
                newTask += " (" + day + ")" + " " + isImportant;

                allTasks += newTask;
                viewTasks.setText(allTasks);
            }
        });
    }
}