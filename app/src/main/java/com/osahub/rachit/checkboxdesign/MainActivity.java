package com.osahub.rachit.checkboxdesign;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class MainActivity extends AppCompatActivity {
    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Changing the checkbox programmatically
        // To set a different background, I'd suggest downloading your own checkboxes with whatever background you want.
        cb = (CheckBox) findViewById(R.id.checkBox2);
        cb.setButtonDrawable(R.drawable.checked_checkbox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    cb.setButtonDrawable(R.drawable.checked_checkbox);
                } else {
                    cb.setButtonDrawable(R.drawable.unchecked_checkbox);
                }
            }
        });
    }
}
