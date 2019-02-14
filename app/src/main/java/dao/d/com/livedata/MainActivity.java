package dao.d.com.livedata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import dao.d.com.livedata.simple.SimpleActivity;
import dao.d.com.livedata.singleton.SingletonActivity;

public class MainActivity extends AppCompatActivity {


    private Button btnSimple, btnSingleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple = findViewById(R.id.btn_simple);
        btnSingleton = findViewById(R.id.btn_singleton);

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SimpleActivity.class));
            }
        });
        btnSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingletonActivity.class));
            }
        });
    }
}
