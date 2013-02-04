package com.simplecounter.acid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasicCountTool extends Activity {
	
	int counter;
	Button add, sub, reset;
	TextView display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        reset = (Button) findViewById(R.id.breset);
        display = (TextView) findViewById(R.id.tvDisplay);
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your total is " + counter);
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your total is " + counter);
			}
		});
        reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter = 0;
				display.setText("Your total has been reset to " + counter);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_starting_point, menu);
        return true;
    }
    
}
