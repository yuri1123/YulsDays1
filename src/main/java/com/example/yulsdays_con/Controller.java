package com.yuls.yulsdays.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/aboutme")
    public String aboutme() {
        return "aboutme";
    }

    @GetMapping("/coverletter1")
    public String coverletter1() {
        return "coverletter1";
    }

    @GetMapping("/coverletter2")
    public String coverletter2() {
        return "coverletter2";
    }

    @GetMapping("/coverletter3")
    public String coverletter3() {
        return "coverletter3";
    }

    @GetMapping("/skills")
    public String skills() {
        return "skills";
    }

    @GetMapping("/works")
    public String works() {
        return "works";
    }

    @GetMapping("/yulshop")
    public String yulshop() {
        return "yulshop";
    }
    @GetMapping("/kcsa")
    public String kcsa() {
        return "kcsa";
    }
    @GetMapping("/getcode")
    public String getcode() {
        return "getcode";
    }
    @GetMapping("/aha")
    public String aha() {
        return "aha";
    }


    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

}
