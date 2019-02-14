package dao.d.com.livedata.singleton;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import dao.d.com.livedata.R;

public class SingletonActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        setTitle("页面1");
        btn = findViewById(R.id.btn);

        //创建
        final SingletonViewModel viewModel = ViewModelProviders.of(this).get(SingletonViewModel.class);

        //监听
        viewModel.getContent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.e("onChanged", "页面1");
                btn.setText(s);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.changeContent("当前状态是页面1");
                new Handler(getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SingletonActivity.this, Singleton2Activity.class));
                    }
                }, 1000);
            }
        });
    }

    @Override
    protected void onResume() {
        Log.e("onResume", "页面1");
        super.onResume();
    }
}
