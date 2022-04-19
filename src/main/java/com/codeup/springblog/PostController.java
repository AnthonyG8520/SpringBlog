package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String index(Model model){
        Post post1 = new Post("helllooo", "im all out of bubblegum");
        Post post2 = new Post("in the livingroom", "in the kitchen");
        ArrayList <Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);
        model.addAttribute("posts", postList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String post(@PathVariable String id, Model model){
        Post post1 = new Post("New title", "hello from this new post");
        model.addAttribute("postTitle", post1.getTitle());
        model.addAttribute("postBody", post1.getBody());
        model.addAttribute("postid", id);
        return "posts/show";
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
