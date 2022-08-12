package it.develhope.deploy01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {

    @Autowired
    Environment environment;

    @Value("${myCustomVarTree.devName}")
    String myCustomVar;



    @GetMapping("/")
    public String getDevName(){
        String var = environment.getProperty("myCustomVarTree.devName");
        return var;
    }


}
