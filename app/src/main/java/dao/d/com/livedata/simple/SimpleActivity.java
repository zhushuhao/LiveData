package dao.d.com.livedata.simple;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import dao.d.com.livedata.R;

public class SimpleActivity extends AppCompatActivity {


    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        btn = findViewById(R.id.btn);
        //构建ViewModel对象
        final SimpleViewModel model = ViewModelProviders.of(this).get(SimpleViewModel.class);

        //监听
        model.getContent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.e("SimpleActivity", "onChanged");
                btn.setText(s);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.getContentData();
            }
        });



    }
}
