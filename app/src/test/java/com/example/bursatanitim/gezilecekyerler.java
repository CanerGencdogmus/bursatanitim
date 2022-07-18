package com.example.bursatanitim.;
import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity
        extends AppCompatActivity {
    class gezilecekyerler { }
    @Override
    public void onClick(View view) { Intent gezilecekyerlergecis=new
            Intent(MainActivity.this, gezilecekyerler.class);
        startActivity(gezilecekyerlergecis); }
    public void startActivity(Intent gezilecekyerlergecis) { }
            });
        }
    }
}