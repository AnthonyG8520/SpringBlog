package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "All blog posts will be here";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String post(@PathVariable String id){
        return "A single post will be shown here.";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "A create form for a blog post will be shown here";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String postCreate(){
        return "A form to create a post will be sent here";
    }


}
