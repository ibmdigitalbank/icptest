package org.ibm.icptest.web;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HomeController {

    @GetMapping("/home")
    public String index(){
        System.out.println("WELCOME HOME");
        return "Hello ICP";
    }
}
