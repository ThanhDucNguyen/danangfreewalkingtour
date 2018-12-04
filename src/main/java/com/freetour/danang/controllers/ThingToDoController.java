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

    //==================================================================================//

    @GetMapping(value = "/catalog-eat")
    public ModelAndView getCatalogEat(Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getListRes", thingToDoService.getListResEat());
        mav.setViewName("eat");
        return mav;
    }
    @GetMapping(value = "/catalog-drink")
    public ModelAndView getCatalogDrink(Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getListRes", thingToDoService.getListResDrink());
        mav.setViewName("drink");
        return mav;
    }

    @GetMapping(value = "/partnerInfo-{id}")
    public ModelAndView getPartnerInfo(@PathVariable(value = "id") Long id, Model model){
        ModelAndView mav = new ModelAndView();
        mav.addObject("getPartNer", thingToDoService.getPartNer(id));
        mav.setViewName("partnerInfo");
        return mav;
    }
    @GetMapping(value = "/detailPartnerInfo")
    public ModelAndView getDetailPartnerInfo(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("detailPartnerInfo");
        return mav;
    }

}
