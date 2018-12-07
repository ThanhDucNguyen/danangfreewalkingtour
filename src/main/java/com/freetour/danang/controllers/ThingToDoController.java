package com.freetour.danang.controllers;

import com.freetour.danang.dto.CategoryDTO;
import com.freetour.danang.dto.Reponse.Response;
import com.freetour.danang.services.ThingToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ThingToDoController {
    @Autowired
    private ThingToDoService thingToDoService;

    @GetMapping(value = "/")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    //=======================================EAT===========================================//
    @GetMapping(value = "/catalog-eat")
    public ModelAndView getCatalogEat(Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getListRes", thingToDoService.getListResEat());
        mav.addObject("getMenuRes", thingToDoService.getMenuResEat());
        mav.setViewName("eat");
        return mav;
    }
    //=====================================DRINK===========================================//
    @GetMapping(value = "/catalog-drink")
    public ModelAndView getCatalogDrink(Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getListRes", thingToDoService.getListResDrink());
        mav.addObject("getMenuRes", thingToDoService.getMenuResDrink());
        mav.setViewName("drink");
        return mav;
    }
    //======================================PARTNER========================================//
    @GetMapping(value = "/partnerInfo-{id}")
    public ModelAndView getPartnerInfo(@PathVariable(value = "id") Long id, Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getPartNer", thingToDoService.getPartNer(id));
        mav.addObject("getListMenu", thingToDoService.getPartNerMenu(id));
        mav.addObject("getFeatured", thingToDoService.getFeatured(id));
        mav.setViewName("partnerInfo");
        return mav;
    }
    //========================================MENU===========================================//
    @GetMapping(value = "/catalog-{id}")
    public ModelAndView getResMenuEat(@PathVariable(value = "id") Long id){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getPartNer", thingToDoService.getPartNer(id));
        mav.addObject("getListMenuFood", thingToDoService.getMenuFood(id));
        mav.addObject("getListMenuDrink", thingToDoService.getMenuDrink(id));
        mav.setViewName("menu");
        return mav;
    }
}
