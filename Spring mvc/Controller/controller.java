package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
    @RequestMapping("/home")
 public String home(){
     System.out.println(" this is home url");
     return "index";
 }

 @RequestMapping("/about")
 public String about(){
     System.out.println("this is about controller");
     return "about";
 }
}
