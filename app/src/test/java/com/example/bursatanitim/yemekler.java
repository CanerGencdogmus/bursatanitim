package com.example.bursatanitim.;
import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    class yemekler { }
    @Override
    public void onClick(View view) {
        Intent yemeklergecis;
        yemeklergecis = new
            Intent(MainActivity.this, yemekler.class);
        startActivity(yemeklergecis); }
    private void startActivity(Intent yemeklergecis) {
                }
            });
         }
    }
}