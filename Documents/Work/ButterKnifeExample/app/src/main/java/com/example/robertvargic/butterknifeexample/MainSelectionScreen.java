package com.example.robertvargic.butterknifeexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainSelectionScreen extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_selection_screen);

        mTextView = (TextView) findViewById(R.id.text_view);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.equals(mButton1)){
            Intent i = new Intent(MainSelectionScreen.this, ActivityExample.class);
            MainSelectionScreen.this.startActivity(i);
        } else if(view.equals(mButton2)){
            Fragment fragmentExample = new FragmentExample();
            getSupportFragmentManager().beginTransaction().add(R.id.frame_container, fragmentExample).addToBackStack(null).commit();
        } else if(view.equals(mButton3)){
            Intent i = new Intent(MainSelectionScreen.this, ListViewAdapter.class);
            MainSelectionScreen.this.startActivity(i);
        } else if(view.equals(mButton4)){
            Intent i = new Intent(MainSelectionScreen.this, ResourcesExample.class);
            MainSelectionScreen.this.startActivity(i);
        } else if(view.equals(mButton5)){
            Intent i = new Intent(MainSelectionScreen.this, OnClickListenerExample.class);
            MainSelectionScreen.this.startActivity(i);
        } else if(view.equals(mButton6)){
            Intent i = new Intent(MainSelectionScreen.this, ViewsArrayExampleActivity.class);
            MainSelectionScreen.this.startActivity(i);
        } else if(view.equals(mButton7)){

        }
        mTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (getFragmentManager().getBackStackEntryCount() != 0) {
            getFragmentManager().popBackStack();
        }
    }
}
