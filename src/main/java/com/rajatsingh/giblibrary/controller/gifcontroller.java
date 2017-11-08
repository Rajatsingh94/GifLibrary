package com.rajatsingh.giblibrary.controller;

import com.rajatsingh.giblibrary.data.CategoryRepository;
import com.rajatsingh.giblibrary.data.GifRepository;
import com.rajatsingh.giblibrary.model.Categories;
import com.rajatsingh.giblibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Rajat on 11/6/2017.
 */
@Controller
public class gifcontroller {

    @Autowired
    private GifRepository gifRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository getCategory;

    @RequestMapping("/")
    public String listgif(ModelMap modelMap) {
        List<Gif> allgif = gifRepository.allgifs();
        modelMap.put("allgif",allgif);
        return "home";
    }


    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {

        Gif gif = gifRepository.findbyname(name);
        modelMap.put("gifs",gif);
        return "gif-details";
    }

    @RequestMapping("/categories")
    public String categorylist(ModelMap modelMap)
    {
        List<Categories> st = categoryRepository.getallcategories();
        modelMap.put("categories",st);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id,ModelMap modelMap)
    {
        Categories categories = categoryRepository.findbyId(id);
        modelMap.put("category",categories);

        List<Gif> categoriesList = getCategory.categorybyId(id);
        modelMap.put("gifs",categoriesList);

        return "category";
    }
}