package com.example.robertvargic.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by robigroza on 21/09/16.
 */

public class ActivityExample extends AppCompatActivity implements View.OnClickListener {

    public EditText mEditText;
    public TextView mTextView;
    public Button mResetButton;
    public Button mUpdateButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        mEditText = (EditText) findViewById(R.id.activity_example_edit_text);
        mTextView = (TextView) findViewById(R.id.activity_example_text_view);
        mResetButton = (Button) findViewById(R.id.activity_example_reset_fields_button);
        mUpdateButton  = (Button) findViewById(R.id.activity_example_update_fields_button);
        mResetButton.setOnClickListener(this);
        mUpdateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(mResetButton)){
            mEditText.setText(null);
            mTextView.setText("Text restarted");
        }
        if(view.equals(mUpdateButton)){
            mTextView.setText(mEditText.getText().toString());
            mEditText.setText(null);
        }
    }
}
