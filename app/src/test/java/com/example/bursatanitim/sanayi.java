package com.example.bursatantmproje;
import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    class sanayi { }
    @Override
    public void onClick(View view) {
        Intent sanayigecis=new
            Intent(MainActivity.this, sanayi.class);
        startActivity(sanayigecis); }
    private void startActivity(Intent sanayigecis) {
    }
});
}
}
}