package com.fiap.mob.netflixproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView videosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // casting (ListView)
        videosList = (ListView) findViewById(R.id.list_videos);

        List<Video> lista = VideoDAO.listar();

        ListAdapter adapter = new ArrayAdapter<Video>(this, android.R.layout.simple_list_item_1, lista);

        videosList.setAdapter(adapter);
    }
}
