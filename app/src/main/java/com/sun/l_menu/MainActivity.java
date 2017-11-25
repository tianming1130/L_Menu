package com.sun.l_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOptionMenu,btnContextMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOptionMenu=(Button)findViewById(R.id.btn_option_menu);
        btnContextMenu=(Button)findViewById(R.id.btn_context_menu);

        btnOptionMenu.setOnClickListener(this);
        btnContextMenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_option_menu:
                startActivity(new Intent(this,OptionMenuActivity.class));
                break;
            case R.id.btn_context_menu:
                startActivity(new Intent(this,ContextMenuActivity.class));
                break;
        }
    }
}
