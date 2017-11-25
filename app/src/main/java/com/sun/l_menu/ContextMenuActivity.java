package com.sun.l_menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        listView = (ListView) findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,
                new String[]{"水果套餐", "蔬菜套餐", "牛排套餐", "甜点套餐"});
        listView.setAdapter(adapter);

        registerForContextMenu(listView);
        
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo
            menuInfo) {
        menu.setHeaderTitle("学院简介");
        // 添加菜单项
        menu.add(0, Menu.FIRST+1, 1, "普通-----60元");
        menu.add(0, Menu.FIRST+2, 2, "精品-----80元");
        menu.add(0, Menu.FIRST+3, 3, "特品-----100元");
    }
    // 菜单单击响应
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // 获取当前被选择的菜单项的信息
        switch (item.getItemId()) {
            case Menu.FIRST+1:
                // 在这里添加处理代码
                Toast.makeText(this,"普通-----60元",Toast.LENGTH_SHORT).show();
                break;
            case Menu.FIRST+2:
                // 在这里添加处理代码
                Toast.makeText(this,"精品-----80元",Toast.LENGTH_SHORT).show();
                break;
            case Menu.FIRST+3:
                // 在这里添加处理代码
                Toast.makeText(this,"特品-----100元",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
