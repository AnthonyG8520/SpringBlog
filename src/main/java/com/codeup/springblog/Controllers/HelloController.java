package com.codeup.springblog.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello there";
//    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model){
        model.addAttribute("pathVar", name);
        return "hello";
    }

    @RequestMapping(path = "/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String helloNameAge(@PathVariable String name, @PathVariable int age){


        return "Hey user! Thanks for letting me know your name is " + name + ". You also told me you were " + age + " years old.";
    }


}
