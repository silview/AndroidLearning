package com.silview.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private CheckBox mCheckBox3;
    private Button mButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCheckBox1 = findViewById(R.id.checkBox1);
        mCheckBox2 = findViewById(R.id.checkBox2);
        mCheckBox3 = findViewById(R.id.checkBox3);
        mButton1 = findViewById(R.id.button);

        mCheckBox1.setChecked(true);
        mCheckBox2.setChecked(true);
    }

    public void onClick_Button(View view){
        String s = "";
        if(mCheckBox1.isChecked()){
            s += "选项1  ";
        }
        if(mCheckBox2.isChecked()) {
            s += "选项2  ";
        }
        if(mCheckBox3.isChecked()){
            s += "选项3  ";
        }
        mButton1.setText(s);
    }
}
