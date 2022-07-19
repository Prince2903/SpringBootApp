package in.prince.FirstSpringBootApp.DemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController{
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome To The World Of Spring Boot!!";
    }

    @GetMapping("/getDate")
    public Date getDate(){
        return new Date();
    }

}