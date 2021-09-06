package edu.wctc.lab3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/")
    public String showHomePage() {
        return "pages/index";
    }

    @GetMapping("step1")
    public String showPage1() {
        return "pages/step1";
    }

    @RequestMapping("step2")
        public String showPage2(){
        return "pages/step2";
    }

    @RequestMapping("step3")
        public String showPage3(){
            return "pages/step3";
        }
     }


