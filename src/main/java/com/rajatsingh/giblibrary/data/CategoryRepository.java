package com.rajatsingh.giblibrary.data;

import com.rajatsingh.giblibrary.model.Categories;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rajat on 11/8/2017.
 */

@Component
public class CategoryRepository {

    private List<Categories> categories = Arrays.asList(

            new Categories(1,"Technology"),
            new Categories(2,"Education"),
            new Categories(3,"Sports")
    );


    public List<Categories> getallcategories()
    {
        return categories;
    }

    public Categories findbyId(int id)
    {
        for (Categories cat: categories  ) {
            if(cat.getId()== id)
            {
                return cat;
            }
        }
        return null;
    }

}
