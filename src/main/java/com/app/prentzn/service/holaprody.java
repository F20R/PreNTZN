package com.app.prentzn.service;

import com.app.prentzn.model.hola;
import com.app.prentzn.repository.holarepy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class holaprody {

    @Autowired
    private holarepy holarepy2;

    public List<hola> obtenersaludo(){
        return holarepy2.findAll();
    }
}
