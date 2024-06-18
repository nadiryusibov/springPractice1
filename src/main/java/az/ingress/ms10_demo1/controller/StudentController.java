package az.ingress.ms10_demo1.controller;

import az.ingress.ms10_demo1.controller.dto.StudentDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    // create student method yani Post method
    // postda requestbody annotation dan istifade edirik
    // responsdan hansi status kodu qayidacag


    @GetMapping("/get")
    public StudentDto getStudent(){
        return new StudentDto(1,"Kenan","Talibov");
    }



    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDto studentDtoPost){
        System.out.println(studentDtoPost);
    }

    // update edek PatchMapping

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody StudentDto studentDtoPost){
        System.out.println("update student with id " + id + " to " + studentDtoPost);
    }

    // delete method

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id){
        System.out.println("delete student with id " + id);
    }

    @GetMapping("/list")
    public List<StudentDto> getStudents(){
        List list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(new StudentDto(32,"Tural","Kerimov"));
        }
        return list;
    }
}
