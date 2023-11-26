package com.lirianosclening.llc.Services;

import com.lirianosclening.llc.Models.Agreement;
import com.lirianosclening.llc.Repositories.IAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    public void saveAgreement(Agreement agreement){
        iAgreementRepository.save(agreement);
    }

    public Agreement updateAgreementById(Long id, Agreement agreement){
        Optional<Agreement>optionalAgreement = iAgreementRepository.findById(id);
        /*if(optionalAgreement.isPresent())
            iAgreementRepository.save(agreement);
        else {
            System.out.println("That Agreement doesn't exist");
            return null;
        }
        return optionalAgreement.get();*/
        return null;
    }

    public void deleteAgreementById(Long id){
        Optional<Agreement>optionalAgreement = iAgreementRepository.findById(id);
        if(optionalAgreement.isPresent()){
            iAgreementRepository.deleteById(id);
        }
    }
}
