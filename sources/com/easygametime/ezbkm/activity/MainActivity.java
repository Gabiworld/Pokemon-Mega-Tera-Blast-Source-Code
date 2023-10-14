package com.easygametime.ezbkm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;
import com.mithrilgame.terablast.ard.R;

public class MainActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "初始化工作可以在这里", 0).show();
        ImageView imageView = (ImageView) findViewById(R.id.img_view_splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.startActivity(new Intent(MainActivity.this, GameShellActivity.class));
                MainActivity.this.finish();
            }
        }, 1500);
    }
}
