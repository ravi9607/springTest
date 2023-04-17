package com.example.test001.Controller;

import com.example.test001.Model.AllEmploy;
import com.example.test001.Model.Employ;
import com.example.test001.Model.TotalEmploy;
import com.example.test001.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping("/post")
    public Employ addEmploy(@RequestBody Employ employ) {
        return myService.addEmploy(employ);
    }
    @GetMapping("/get1")
    public List<Employ> getAllEmploy() {
        return myService.getEmploy();
    }
    @GetMapping("/get2")
    public AllEmploy getAllEmployObj() {
        return myService.getEmployObjects();
    }

    @GetMapping("/get3")
    public TotalEmploy getTootalEmploy() {
        return myService.getTotalEmploy();
    }
    @PutMapping("/put")
    public Employ updateEmploy(@RequestBody Employ employ) {
        return myService.updateEmploy(employ);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmploy(@PathVariable("id") Integer id) {
        myService.deleteEmploy(id);
    }
}