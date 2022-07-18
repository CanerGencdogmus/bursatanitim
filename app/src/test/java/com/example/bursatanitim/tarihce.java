package com.example.bursatanitim.;
import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
        import android.view.View;
        import androidx.appcompat.app.AppCompatActivity;
        public class MainActivity
        extends AppCompatActivity {
    class tarihce { }
            @Override
            public void onClick(View view) {
        Intent tarihcegecis=new
                Intent(MainActivity.this, tarihce.class);
        startActivity(tarihcegecis); }
    public void startActivity(Intent tarihcegecis) { } }); } } }