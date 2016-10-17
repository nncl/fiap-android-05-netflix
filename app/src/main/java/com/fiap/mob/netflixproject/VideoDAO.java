package com.fiap.mob.netflixproject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RM30917 on 17/10/2016.
 */
public class VideoDAO {

    public static List<Video> listar () {
        List<Video> lista = new ArrayList<Video>();

        lista.add(new Video(1, "HIMYM", 50));
        lista.add(new Video(2, "Regular Show", 50));
        lista.add(new Video(3, "Adventure Time", 50));
        lista.add(new Video(4, "Stranger Things", 50));
        lista.add(new Video(5, "Famton Works", 50));
        lista.add(new Video(6, "Friends", 50));

        return lista;
    }

}
