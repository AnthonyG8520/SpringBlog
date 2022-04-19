package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String rollDice(){
        return "rolldice";
    }

    @GetMapping("/roll-dice/{num}")
    public String rollDice(@PathVariable int num, Model model){
        double random = Math.floor(((Math.random() * (7 - 1)) + 1));
        model.addAttribute("random", random);
        model.addAttribute("guess", num);
        return "rolldiceanswer";
    }


}
