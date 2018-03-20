package com.silview.androidlearning;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import java.lang.reflect.Field;

    /*Android Studio实用快捷键
    *                                           查看
    *   Ctrl + F12          快速查看当前类的大纲，包括成员变量、方法等。同时可通过输入来快速搜索对应的方法
    *   Ctrl + Shift + I    将光标停在类或者方法名上，在不离开当前位置的前提下，查看某个方法或者类的完整实现代码。等于Ctrl + 单击，好处是不用离开当前位置
    *   Ctrl + F11          将光标所在位置加入书签，神键！当暂时离开此位置，一会还回来时，不妨试试，绝壁好用！
    *   Shift + F11         和上面的键搭配使用，预览加入的书签。结合使用，战斗力翻倍！
    *   Ctrl+Shift+backSpace回到上次编辑的位置，可以一直往追溯！
    *   Ctrl + H            查看当前类的结构（尤其在复杂项目中，对于理解类的继承关系很重要，值得一试）
    *   Ctrl + Alt + H      将光标停在方法名上，查看执行到该方法的所有执行路径（一层层追溯）
    *   Alt + F7            光标停在方法名或变量上，快速查找 调用方法 或 读、写变量的地方（常用，同时要区别于上面的快捷键）
    *   Ctrl + E            查看窗口（左侧）和最近打开的文件（右侧）（尤其是最近打开的文件，十分好用，再也不怕手抖不小心关掉了）
    *   Ctrl + Alt + B      查看接口、抽象方法的实现（或者直接点击左侧的 ↓ 箭头）
    *
    *                                           搜索内容
    *   Ctrl + F            在当前文件查找内容
    *   Ctrl + R            在当前文件查找并替换内容
    *   Ctrl + N            查找类
    *   Ctrl + Shift + N    查找文件（类、布局、资源）
    *   Double Shift        查找任意内容（类、布局、资源，甚至是 窗口Windows、动作Actions、符号Symbols）
    *   Ctrl + Shift + F    直接搜索文件中的内容，注意不是按照文件名搜索（碉堡了，谁用谁知道）
    *
    *                                           调试
    *   右击断点            为断点设置执行条件,或者只是打印一些信息
    *   Alt + 单击          断点过程中，按住Alt并点击想要查看的变量，可查看其详细信息（当然在下方的Debug窗口也可以看）
    *   Alt+f8              断点过程中，调出Evaluate Expression窗口输入Evaluate Expression,来定制自己的调试数据（这个6，在调试过程中根据需要修改数据，模拟不同的执行过程）
    *
    *                                           编辑
    *   Shift + F6          重命名神键
    *   Ctrl + P            调用方法时不知道填哪些参数，不妨一用，快速查看方法的参数
    *   Ctrl + Alt + M      选中一段代码，然后抽取出单独的方法
    *   Alt 或 Ctrl + Shift + ↓ ↑上下移动整行
    *   Ctrl + Y 或 X 或 D  仅删除行、删除并复制行、复制并粘贴行
    *   Ctrl + Alt + T      快速生成结构体（if、try-catch…）
    *   Ctrl + Shift + V    在剪贴板中选择最近的几次内容，进行粘贴（再也不担心重复粘贴）
    *   Ctrl + Alt + L      格式化代码（没事多按按）
    *   Alt + Insert        同样没事多按按，快速生成构造函数、getter和setter方法、覆写方法（Ctrl + O），有些插件入口也会显示在这儿
    *
    *                                           其他
    *   Ctrl + Shift + F12  代码视图 全屏 或者 取消全屏
    *   Enter｜Tab          在代码提示时的区别
    *   Alt + J 或 鼠标拖动  多行、列编辑
    *
    *                                           知道就好
    *   Ctrl + Alt + O      清除无效包引用
    *   Alt + 回车          光标停在类上，导包
    *   Ctrl + W            从光标处开始，逐渐扩大选择范围，反之 Ctrl + Shift + W
    *   Home 或 End         快速定位到 行首 或 行尾
    *   Ctrl + Shift + U    大小写转换
    *   Ctrl + Q            查看光标处的 方法、类、变量等的注释文档
    *   Alt + Q             在任意位置都可以查看 方法或类（两次） 的信息
    *   Alt + ↑ 或↓        在方法间快速切换
    *   Ctrl + F4           关闭当前窗口
    * */

public class MainActivity extends AppCompatActivity {
    private TextView myTextView1;
    private TextView myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
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

        //        富文本标签
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

//        使用<img>标签在TextView控件中实现图文混排效果
//        Key-Value模式装载图像,设计getResourceId方法实现
        String html = "图像1<img src='image1'/>图像2<img src='image2'/>";
        html += "图像3<img src='image3'/><p>";
        html += "图像4<a href='http://www.silview.com'><img src='image4'></a>";
        html += "图像5<img src='image5'/>";

        CharSequence charSequence1 = Html.fromHtml(html, new Html.ImageGetter() {
            @Override
            public Drawable getDrawable(String source) {
                System.out.println(source);
                Drawable drawable = getResources().getDrawable(getResourceId(source),null);
                if (source.equals("image3")){
                    drawable.setBounds(0,0,drawable.getIntrinsicWidth()/2,drawable.getIntrinsicHeight()/2);
                }
                else {
                    drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
                }
                return drawable;
            }
        }, null);

        myTextView1.setText(charSequence1);
        myTextView1.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private int getResourceId (String name){
        try {
            Field field = R.drawable.class.getField(name);
            return Integer.parseInt(field.get(null).toString());
        }
        catch (Exception e){

        }
        return 0;
    }
}