package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>C#</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'form'>" +
                        "Name: " +
                        "<input type = 'text' name = 'name'/> </br>" +
                        "My Favorite language: " +
                        "<select name = optionOne>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select></br>" +
                        "My Second Favorite Language: " +
                        "<select name = optionTwo>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select></br>" +
                        "My Third Favorite Language: " +
                        "<select name = optionThree>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select></br>" +
                        "<input type = 'submit' value = 'Submit' /> </br>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String skillsFormSubmit(@RequestParam String name, String optionOne, String optionTwo, String optionThree){
        String html = "" +
                "<html>" +
                "<body>" +
                "<h1> Skills for "+ name + "</h1>" +
                "<ol>" +
                "<li>"+optionOne+"</li>" +
                "<li>"+optionTwo+"</li>" +
                "<li>"+optionThree+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;

    }
}
