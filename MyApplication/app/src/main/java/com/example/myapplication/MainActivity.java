package com.example.myapplication;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*上面的内容不用管它，那是页面初始化的内容
        我们也要在页面初始化里面写个内容，以方便展示
        */
        //创建一个TextView对象，通过findViewById方法得到TextView对象id为hello的值，给hello变量
        /*
        TextView hello = findViewById(R.id.hello);
        //使用setText()方法修改文本
        hello.setText("Hello，My World！");
        */

        //创建一个TextView对象，通过findViewById方法得到TextView对象id为hello的值，给hello变量
        /*
        TextView hello = findViewById(R.id.hello);
        //创建一个Button对象，
        Button button1 = findViewById(R.id.button1);
        //对按钮点击事件进行监听,按钮被点击时，改变id为hello的文本内容
        button1.setOnClickListener(v -> {
            //使用setText()方法修改文本
            hello.setText("Hello，My World！");
        });
        */

        //以上内容属于页面初始化

        //点击按钮生成随机数
        TextView hello = findViewById(R.id.hello);
        Button btn_change = findViewById(R.id.btn_change);
        btn_change.setOnClickListener(v -> {
            int num = (int) (Math.random() * 100);
            hello.setText(String.valueOf(num));
        });

        //点击按钮跳转页面
        Button btn_EditViewId = findViewById(R.id.btn_EditViewId);
        btn_EditViewId.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EditViewActivity.class);
            startActivity(intent);
        });

    }
}