package com.rajatsingh.giblibrary.data;

import com.rajatsingh.giblibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rajat on 11/8/2017.
 */
@Component
public class GifRepository {

    private static final List<Gif> ALL_GIF = Arrays.asList(

            new Gif("compiler-bot",1, LocalDate.of(2017, 2, 13), true),
            new Gif("android-explosion",2, LocalDate.of(2017, 1, 13), true),
            new Gif("book-dominos",2, LocalDate.of(2017, 2, 13), false),
            new Gif("cowboy-coder",1, LocalDate.of(2017, 2, 13), true),
            new Gif("infinite-andrew",2, LocalDate.of(2017, 2, 13), true)




    );

    public Gif findbyname(String name)
    {
        for (Gif gif: ALL_GIF ) {
            if(gif.getName().equals(name))
            {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> allgifs(){
        return ALL_GIF;
    }

    public List<Gif> categorybyId(int id)
    {
        List<Gif> gifs = new ArrayList<>();

        for (Gif gif:ALL_GIF ) {
            if(gif.getCategoryid()==id)
            {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
