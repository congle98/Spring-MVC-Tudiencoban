package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class DictionaryController {
    private static HashMap<String,String> dictionary = new HashMap();
    static {
        dictionary.put("hello","xin chao");
        dictionary.put("hi","chao xìn");
        dictionary.put("bye","tạm biệt");
        dictionary.put("go","đi");
    }
@GetMapping("/dictionary")
    public ModelAndView dictionary(){
        ModelAndView modelAndView = new ModelAndView("search");
        return modelAndView;
}
@PostMapping("/dictionary")
    public ModelAndView result(String text){
        String result = dictionary.get(text);
        ModelAndView modelAndView = new ModelAndView("search");
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
