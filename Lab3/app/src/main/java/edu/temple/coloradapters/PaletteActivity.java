package edu.temple.coloradapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PaletteActivity extends Activity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        spinner = (Spinner) findViewById(R.id.spinner);
        final String[] strings = {"White", "Red", "Yellow", "Green", "Blue"};

        CustomAdapter adapter = new CustomAdapter(PaletteActivity.this, strings.length, strings);

        spinner.setAdapter(adapter);

        final Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            boolean firstSelection = true;
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(!firstSelection){
                    intent.putExtra("Color", strings[i]);
                    startActivity(intent);
                }
                firstSelection = false;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
