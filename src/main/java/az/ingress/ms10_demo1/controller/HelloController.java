package az.ingress.ms10_demo1.controller;

import az.ingress.ms10_demo1.controller.dto.StudentDto_get;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    // request headers
    @GetMapping("/en")
    public String sayHello(){
        return "Hello String";
    }

    // request headers
    @GetMapping("/az")
    public String sayHelloaz(){
        return "Salam dunya";
    }

    // query params
    @GetMapping("/name")
    public String sayName(@RequestParam ("name") String studentName,
                          @RequestParam("surname") String lastName){
        return "Hello " + studentName + " " + lastName;
    }


    // object as query params
    @GetMapping("/student")
    public String studentTransfer(StudentDto_get studentDto){
        return "hello " + studentDto;
    }


    // path variables  {} bu sekilde yazilir
    @GetMapping("/age/{age}/size/{size}")
    public String sayHelloAge(@PathVariable Long age,
                              @PathVariable Long size){
        return "Hello world " + age + size;
    }
}
