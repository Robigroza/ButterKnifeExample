package com.example.robertvargic.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;

/**
 * Created by robigroza on 21/09/16.
 */

public class ResourcesExample extends AppCompatActivity {

    @BindView(R.id.resources_example_button_1)
    public Button button1;

    @BindView(R.id.resources_example_button_2)
    public Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources_example);


    }

}
