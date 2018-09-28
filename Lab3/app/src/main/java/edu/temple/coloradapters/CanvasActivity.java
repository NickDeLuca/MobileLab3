package edu.temple.coloradapters;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;

public class CanvasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        TextView textview = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String color = intent.getStringExtra("Color");
        textview.setText(color);
        layout.setBackgroundColor(Color.parseColor(color));


    }
}
