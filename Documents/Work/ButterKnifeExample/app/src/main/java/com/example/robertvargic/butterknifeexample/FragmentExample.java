package com.example.robertvargic.butterknifeexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by robigroza on 21/09/16.
 */

public class FragmentExample extends Fragment {

    public View mView;
    public TextView mFragmentTextView;
    public Button mFragmentButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_example, container, false);

        mFragmentTextView = (TextView) mView.findViewById(R.id.fragment_example_text_view);
        mFragmentButton = (Button) mView.findViewById(R.id.fragment_example_button);

        mFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFragmentTextView.setText(R.string.fragment_response);
            }
        });

        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
