package com.freetour.danang.controllers;

import com.freetour.danang.dto.ElementDTO;
import com.freetour.danang.services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class ToolController {

    @Autowired
    private ToolService toolService;

    @GetMapping(value = "/tool")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("add",new ElementDTO());
        mav.setViewName("tool");
        return mav;
    }
    @GetMapping(value = "/convert")
    public ModelAndView index2(ElementDTO elementDTO){
        ModelAndView mav = new ModelAndView();
        mav.addObject("add", toolService.addCode(elementDTO));
        mav.setViewName("tool2");
        return mav;
    }
    @PostMapping(value = "/admin-addTypeCar-Process")
    public ModelAndView getTypeCarProcess(ElementDTO elementDTO,HttpSession session){
        ModelAndView mav = new ModelAndView();
            mav.addObject("add", toolService.addCode(elementDTO));
            mav.setViewName("redirect:/convert");

        return mav;
    }
}
