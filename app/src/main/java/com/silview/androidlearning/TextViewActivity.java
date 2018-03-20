package com.silview.androidlearning;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.silview.androidlearning.R;

//TextView控件基础
public class TextViewActivity extends AppCompatActivity {

    private TextView myTextView1;
    private TextView myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        myTextView1 = findViewById(R.id.textView1);
        myTextView2 = findViewById(R.id.textView2);

        myTextView1.setText("今天天气好吗？");
        myTextView1.setTextColor(Color.YELLOW);
        myTextView1.setBackgroundColor(Color.BLUE);
        myTextView1.setTextSize(60);

        myTextView2.setText("今天上班吗？");
        myTextView2.setTextColor(Color.GREEN);
        myTextView2.setBackgroundColor(Color.BLACK);
        myTextView2.setTextSize(80);

        // 富文本标签
        String s = "<font color = 'red'>I love Android.</font><br>";
        s += "<font color = '#0000FF'><big><i>I love Android.</i></big></font><br>";
        s += "<font color = '@" + android.R.color.holo_red_dark + "'>";
        s += "<tt><b><big><u>I love Android.</u></big></b></tt><p>";
        s += "<big><a href = 'http://www.silview.com'>首为信息技术有限公司</a></big>";

        CharSequence charSequence = Html.fromHtml(s);
        myTextView1.setText(charSequence);
        myTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        String text = "我的url: http://www.silview.com\n";
        text += "我的E-mail:zhuhongtao@silview.com\n";
        text += "我的电话：+86 0755-12345678";

        myTextView2.setText(text);
        myTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        // 使用<img>标签在TextView控件中实现图文混合效果
        // Key-Value模式装载图像

    }
}
