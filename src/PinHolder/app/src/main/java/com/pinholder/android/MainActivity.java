package com.pinholder.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNew = (Button)findViewById(R.id.buttonNEW);
    }

    public void onClickNew(View view) {
        Intent intent = new Intent(MainActivity.this, NewFormActivity.class);
        startActivity(intent);
    }
}
