package com.example.fragmentapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmentapp.R;
import com.example.fragmentapp.fragment.Artist;
import com.example.fragmentapp.fragment.Playlist;
import com.example.fragmentapp.fragment.Song;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnSong, btnArtist, btnPlaylist, btnExit;

    Song fragmentSong;
    Artist fragmentArtist;
    Playlist fragmentPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSong = findViewById(R.id.btn_song);
        btnArtist = findViewById(R.id.btn_artist);
        btnPlaylist = findViewById(R.id.btn_playlist);
        btnExit = findViewById(R.id.btn_exit);

        btnSong.setOnClickListener(this);
        btnArtist.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    void menuSong() {
        fragmentSong = new Song();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentSong);
        ft.commit();
    }

    void menuArtist() {
        fragmentArtist = new Artist();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentArtist);
        ft.commit();
    }

    void menuPlaylist() {
        fragmentPlaylist = new Playlist();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentPlaylist);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnSong) {
            menuSong();
        }
        if (v == btnArtist) {
            menuArtist();
        }
        if (v == btnPlaylist) {
            menuPlaylist();
        }
        if (v == btnExit) {
            menuExit();
        }
    }
}
