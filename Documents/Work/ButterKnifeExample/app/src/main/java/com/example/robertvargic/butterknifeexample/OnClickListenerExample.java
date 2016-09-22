package com.example.robertvargic.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by robigroza on 21/09/16.
 */

public class OnClickListenerExample extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclicklistener_example);

        ButterKnife.bind(this);
    }
//
//    @OnClick(/*{*/R.id.activity_onclick_example_button1/*,
//            R.id.activity_onclick_example_button2,
//            R.id.activity_onclick_example_button3,}*/)
//    public void onButtonClick(Button button) {
//        if(button.getId() == R.id.activity_onclick_example_button1){
//            Toast.makeText(this, "Button pressed!", LENGTH_SHORT).show();
//        }
//
//
//    }

    @OnClick(R.id.activity_onclick_example_button1)
    protected void onBtnClick() {
        Toast.makeText(this, "Button pressed!", Toast.LENGTH_SHORT).show();
    }
}
