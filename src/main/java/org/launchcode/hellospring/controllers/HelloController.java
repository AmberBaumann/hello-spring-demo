package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    /*public String getGreeting(String name, String language){
        String greeting = "";
        if(language.equals("english")){
            greeting = "Hello";
        }
        else if (language.equals("french")){
            greeting = "Bonjour";
        }
        else if (language.equals("spanish")){
            greeting = "Hola";
        }
        else if (language.equals("italian")){
            greeting = "Bonjourno";
        }
        else if (language.equals("norwegian")){
            greeting = "Hallo";
        }
        return greeting + " " + name;
    }*/

    /*// /hello
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloGet(@RequestParam String name, @RequestParam String language){
        if (name == null){
            name = "World";
        }
        return getGreeting(name, language);
    }*/

   /* @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language){
        return getGreeting(name, language);
    }*/

    // /form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

}

//String html = "<form method = 'get' action= '/hello/hello'>" +
//                "<input type='text' name='name' />" +
//                "\n\n" +
//                "<select name = 'language'>" +
//                "<option value = 'english'>English</option>" +
//                "<option value = 'french'>French</option>" +
//                "<option value = 'spanish'>Spanish</option>" +
//                "<option value = 'italian'>Italian</option>" +
//                "<option value = 'norwegian'>Norwegian</option>" +
//                "</select>" +
//                "\n\n" +
//                "<input type = 'submit' value = 'Greet me!' />" +
//                "</form>";
//        return html;