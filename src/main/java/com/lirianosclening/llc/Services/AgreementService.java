package com.lirianosclening.llc.Services;

import com.lirianosclening.llc.Models.Agreement;
import com.lirianosclening.llc.Repositories.IAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AgreementService {

    @Autowired
    IAgreementRepository iAgreementRepository;

    public List<Agreement> getAll(){
        return iAgreementRepository.findAll();
    }

    public Agreement getAgreementById(Long id){
        Optional<Agreement> optionalAgreement = iAgreementRepository.findById(id);
        return optionalAgreement.orElse(null);
    }

    public Agreement updateAgreementById(Long id, Agreement agreement){
        Optional<Agreement>optionalAgreement = iAgreementRepository.findById(id);
        if(optionalAgreement.isPresent())
            iAgreementRepository.save(agreement);
        else {
            System.out.println("That Agreement doesn't exist");
            return null;
        }
        return optionalAgreement.get();
    }

    public void deleteAgreementById(Long id){
        Optional<Agreement>optionalAgreement = iAgreementRepository.findById(id);
        if(optionalAgreement.isPresent()){
            iAgreementRepository.deleteById(id);
        }
    }
}
