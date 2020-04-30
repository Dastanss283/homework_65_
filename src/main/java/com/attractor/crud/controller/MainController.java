package com.attractor.crud.controller;

import com.attractor.crud.model.FoodType;
import com.attractor.crud.repository.FoodTypeRepository;
import com.attractor.crud.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    FoodTypeRepository repo;
    PlaceRepository placeRepo;

    @RequestMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("foodTypes", repo.findAll());
        return "index";
    }

    @RequestMapping("/jql/{name}")
    public String getMainPageJql(Model model, @PathVariable("name") String name) {
        model.addAttribute("foodTypes", repo.getByName(name));
        return "index";
    }

    @RequestMapping("/places")
    public String getMainPagePlaces(Model model) {
        model.addAttribute("places", placeRepo.findAll());
        return "index";
    }

}
