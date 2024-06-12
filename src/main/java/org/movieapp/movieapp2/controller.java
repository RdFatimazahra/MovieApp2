package org.movieapp.movieapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/show")
    public void show() {
        System.out.println("show");
    }
}
