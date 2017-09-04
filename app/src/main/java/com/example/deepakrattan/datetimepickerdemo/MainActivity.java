package com.example.deepakrattan.datetimepickerdemo;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnShowDatePickerDialog, btnShowTimePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDatePickerDialog = (Button) findViewById(R.id.btnShowDatePickerDialog);
        btnShowTimePickerDialog = (Button) findViewById(R.id.btnShowTimePickerDialog);


        btnShowDatePickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = new DatePickerFragment();
                dialogFragment.show(getSupportFragmentManager(), "Date Picker");

            }
        });


        btnShowTimePickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DialogFragment dialogFragment = new TimePickerFragment();
                dialogFragment.show(getSupportFragmentManager(), "Time Picker");

            }
        });
    }

    public void processDatePickerResult(int year, int month, int day) {

        String year_string = String.valueOf(year);
        String month_string = String.valueOf(month + 1);
        String day_string = String.valueOf(day);

        String date_message = day_string + "/" + month_string + "/" + year_string;
        Toast.makeText(this, "Date Selected is : " + date_message, Toast.LENGTH_SHORT).show();

    }

    public void processTimePickerResult(int hourOfDay, int min) {
        String hour_string = String.valueOf(hourOfDay);
        String min_string = String.valueOf(min);

        String time_message = hour_string + ":" + min_string;
        Toast.makeText(this, "Time Selected is :" + time_message, Toast.LENGTH_SHORT).show();

    }
}
