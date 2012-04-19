package com.strawberry.lib.test;

import com.strawberry.lib.tab.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Demo2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);
        TextView text = (TextView)findViewById(R.id.lib_head_title);
        text.setText("Demo2");
    }
}