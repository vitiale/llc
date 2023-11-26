package com.lirianosclening.llc.Controllers;

import com.lirianosclening.llc.Models.Agreement;
import com.lirianosclening.llc.Services.AgreementService;
import com.lirianosclening.llc.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agreement")
public class AgreementController {

    @Autowired
    AgreementService agreementService;

    @GetMapping("/all")
    public List<Agreement> getAllAgreements(){
        return agreementService.getAll();
    }

    @GetMapping("/{id}")
    public Agreement getAgreementById(@PathVariable("id") Long id){
        return agreementService.getAgreementById(id);
    }

    @PutMapping("/{id}")
    public void updateAgreementById(@PathVariable("id") Long id, @RequestBody Agreement agreement){
        agreementService.updateAgreementById(id, agreement);
    }

    @PostMapping("/create")
    public void saveAgreement(@RequestBody Agreement agreement){
        agreementService.saveAgreement(agreement);
    }

    @DeleteMapping("/{id}")
    public void deleteAgreementById(@PathVariable Long id){
        agreementService.deleteAgreementById(id);
    }

}
