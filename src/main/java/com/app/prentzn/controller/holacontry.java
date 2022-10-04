package com.app.prentzn.controller;


import com.app.prentzn.model.hola;
import com.app.prentzn.service.holaprody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class holacontry {

    @Autowired
    private holaprody holaprody2;


    @RequestMapping("/hola")
    public List<hola> obtenersaludo(){
        return holaprody2.obtenersaludo();
    }

    @RequestMapping("/saludo")
    public ModelAndView damesaludo(){
        List<hola> holaList = holaprody2.obtenersaludo();
        ModelAndView modelAndView = new ModelAndView("saludo");
        modelAndView.addObject("saludo", holaList);
        return modelAndView;
    }

}
