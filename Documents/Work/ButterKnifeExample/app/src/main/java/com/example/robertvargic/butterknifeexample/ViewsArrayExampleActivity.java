package com.example.robertvargic.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by robigroza on 21/09/16.
 */

public class ViewsArrayExampleActivity extends AppCompatActivity {

    @BindViews({R.id.views_array_relative_layout, R.id.views_array_text_view})
    public List<View> nameViews;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.views_array_example_acttivity);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.views_array_button)
    public void hideLayout(){
        ButterKnife.apply(nameViews, DISABLE);
    }

    static final ButterKnife.Action<View> DISABLE = new ButterKnife.Action<View>() {

        @Override
        public void apply(@NonNull View view, int index) {
            view.setEnabled(false);
        }
    };
}
