package com.lirianosclening.llc.Controllers;

import com.lirianosclening.llc.Models.ServiceProvider;
import com.lirianosclening.llc.Services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service_provider")
public class ServiceProviderController {

    @Autowired
    ServiceProviderService serviceProviderService;

    @GetMapping("/all")
    public List<ServiceProvider> getAllServiceProvider(){
        return serviceProviderService.getAllServiceProvider();
    }

    @GetMapping("/{id}")
    public ServiceProvider getServiceProviderById(@PathVariable("id") Long id){
        return serviceProviderService.getServiceProviderById(id);
    }

    @PutMapping("/{id}")
    public ServiceProvider updateServiceProvide(@PathVariable("id") Long id, @RequestBody ServiceProvider serviceProvider){
        return serviceProviderService.updateServiceProviderById(id, serviceProvider);
    }

    @PostMapping("/create")
    public void saveServiceProvider(@RequestBody ServiceProvider serviceProvider){
        serviceProviderService.saveServiceProvider(serviceProvider);
    }
}
