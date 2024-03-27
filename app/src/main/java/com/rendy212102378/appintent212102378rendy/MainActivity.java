package com.rendy212102378.appintent212102378rendy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view) {
        Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
        if (teleponIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(teleponIntent);
        } else {
            // Tampilkan notifikasi bahwa aplikasi tidak ditemukan
            showToast("Aplikasi telepon tidak ditemukan");
        }
    }
    public void tampilSms(View view){
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }
    public void tampilKalender(View view){
        Intent kalenderIntent = new Intent(Intent.ACTION_MAIN);
        kalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(kalenderIntent);
    }
    public void tampilkalkulator(View view){
        Intent kalkulatorIntent = new Intent(Intent.ACTION_DIAL);
        if (kalkulatorIntent.resolveActivity(getPackageManager()) != null) {
            kalkulatorIntent.addCategory(Intent.);
            startActivity(kalkulatorIntent);
        } else {
            // Tampilkan notifikasi bahwa aplikasi tidak ditemukan
            showToast("Aplikasi telepon tidak ditemukan");
        }
    }
    public void tampilBrowser(View view){
        Intent browserIntent = new Intent(Intent.ACTION_MAIN);
        browserIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(browserIntent);
    }
    public void tampilKontak(View view){
        Intent kontakIntent = new Intent(Intent.ACTION_MAIN);
        kontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(kontakIntent);
    }
    public void tampilGaleri(View view){
        Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
        galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(galeriIntent);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}