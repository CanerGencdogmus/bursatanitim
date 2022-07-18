package com.example.bursatanitim.;
import static com.example.bursatanitim.R.*;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button tarihce, sanayi, yemekler, gezilecekyerler;
    private static void onClick(View view) { }
    @SuppressLint({"MissingSuperCall", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(layout.activity_main);
    tarihce = findViewById(id.tarihce);
    sanayi = findViewById(id.sanayi);
    yemekler = findViewById(id.yemekler);
    gezilecekyerler = findViewById((id.gezilecekyerler));
    { Button gezilecekyerler;
        gezilecekyerler = findViewById((id.gezilecekyerler));
        gezilecekyerler.setOnClickListener(MainActivity::onClick);
        gezilecekyerler.setOnClickListener(new View.OnClickListener() {
            class gezilecekyerler { }
            @Override
            public void onClick(View view) {
            Intent gezilecekyerlergecis=new Intent(MainActivity.this, gezilecekyerler.class);
            startActivity(gezilecekyerlergecis); } });
        Button tarihce; tarihce = findViewById((id.tarihce)); tarihce.setOnClickListener(MainActivity::onClick);
        tarihce.setOnClickListener(new View.OnClickListener() { class tarihce { }
            @Override
            public void onClick(View view) {
            Intent tarihcegecis = new Intent(MainActivity.this, tarihce.class);
            startActivity(tarihcegecis); } }); Button
                yemekler; yemekler = findViewById((id.yemekler));
        yemekler.setOnClickListener(MainActivity::onClick);
        yemekler.setOnClickListener(new View.OnClickListener() {
            class yemekler { }
            @Override
            public void onClick(View view) {
                Intent yemeklergecis=new
                    Intent(MainActivity.this, yemekler.class);
                startActivity(yemeklergecis); } });
        Button sanayi; sanayi = findViewById((id.sanayi));
        sanayi.setOnClickListener(MainActivity::onClick);
        sanayi.setOnClickListener(new View.OnClickListener() {
            class sanayi { }
            @Override
            public void onClick(View view) {
            Intent sanayigecis=new  Intent(MainActivity.this, sanayi.class);
            startActivity(sanayigecis);
                 }
            });
        }
    }
}
