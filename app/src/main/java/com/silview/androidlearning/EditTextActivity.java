package com.silview.androidlearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {
    private EditText meditText;
    private TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        meditText = findViewById(R.id.editText1);
        mtextView = findViewById(R.id.textView1);
    }

    public void onClick_Button(View view){
        String s = meditText.getText().toString().trim();
        if (s.equals("")){
            mtextView.setText("必须输入内容");
        }
        else {
            mtextView.setText(s);
        }
    }
}
