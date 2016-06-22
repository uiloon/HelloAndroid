package com.example.uiloon.newtest;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // 為ListView元件設定三筆資料
//        String[] data = {
//                "關於Android Tutorial的事情",
//                "一隻非常可愛的小狗狗!",
//                "一首非常好聽的音樂！"};
//        int layoutId = android.R.layout.simple_list_item_1;
//        ArrayAdapter<String> adapter =
//                new ArrayAdapter<String>(this, layoutId, data);
//        ListView item_list = (ListView) findViewById(R.id.item_list);
//        item_list.setAdapter(adapter);
        // 讀取在畫面配置檔已經設定好名稱的元件
        TextView show_app_name = (TextView) findViewById(R.id.show_app_name);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showAbout(v);
            }
        };
        // 註冊點擊監聽物件


        View.OnLongClickListener n = new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                showAbout(v);
                return false;
            }
        };
        show_app_name.setOnClickListener(listener);
        show_app_name.setOnLongClickListener(n);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void showAbout(View v) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle(R.string.app_name).setMessage("123456").show();
    }

}
