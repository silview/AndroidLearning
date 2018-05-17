package com.silview.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class RadioButtonActivity extends AppCompatActivity {

    private Button mButton;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        mButton = findViewById(R.id.button);
        mRadioGroup = findViewById(R.id.radioGroup1);
    }

    public void onClick(View view) {
        switch (mRadioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButton1:
                //TODO implement
                mButton.setText("选项1");
                break;
            case R.id.radioButton2:
                mButton.setText("选项2");
                break;
            case R.id.radioButton3:
                mButton.setText("选项3");
                break;
            case -1:
                mButton.setText("未做任何选择");
                break;
            default:
                break;
        }
    }
}
