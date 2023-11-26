package com.lirianosclening.llc.Controllers;

import com.lirianosclening.llc.Models.MyService;
import com.lirianosclening.llc.Services.MyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/service")
public class ServiceController {

    @Autowired
    MyServiceService myServiceService;

    @GetMapping("/all")
    public List<MyService> getAllServices(){
        return myServiceService.getAllServices();
    }

    @GetMapping("/{id}")
    public MyService getMyServiceById(@PathVariable("id") Long id){
        return myServiceService.getMyServiceById(id);
    }

    @PostMapping("/create")
    public void saveMyService(@RequestBody MyService request){
        myServiceService.saveMyService(request);
    }

    @PutMapping("/{id}")
    public void updateMyService(@PathVariable("id") Long id, @RequestBody MyService request){
        myServiceService.updateMyServiceById(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteMyServiceById(@PathVariable("id") Long id){
        myServiceService.deleteMyServiceById(id);
    }

}
