package com.example.aplikasiprofilrestosa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void email(View v){
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:111202113543@mhs.dinus.ac.id"));
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Tanya Seputar Resto");
////        startActivity(intent);
//
//        if (intent.resolveActivity(getPackageManager()) != null){
//            startActivity(intent);
//        }

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"111202113543@mhs.dinus.ac.id"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Tanya Seputar Resto");
        intent.putExtra(Intent.EXTRA_TEXT, "Isi pesan email Anda di sini.");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void call(View v){
        String nomor = "085227338132";
        Uri url = Uri.parse("tel:"+nomor);
        Intent implicitIntent = new Intent(Intent.ACTION_DIAL, url);
        startActivity(implicitIntent);
    }

    public void maps(View v){
        String url = "https://maps.app.goo.gl/EePDnDXdSkN5RXy27?g_st=ic";
        Intent it = new Intent(Intent.ACTION_VIEW);
        it.setData(Uri.parse(url));
        startActivity(it);
    }
}