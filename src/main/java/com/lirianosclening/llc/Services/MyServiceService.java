package com.lirianosclening.llc.Services;

import com.lirianosclening.llc.Repositories.IMyServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.lirianosclening.llc.Models.MyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceService {

    @Autowired
    IMyServiceRepository iMyServiceRepository;

    public List<MyService> getAllServices(){
        return iMyServiceRepository.findAll();
    }

    public MyService getMyServiceById(Long id){
        return iMyServiceRepository.findById(id).orElse(null);
    }

    public void updateMyServiceById(Long id, MyService request){
        Optional<MyService> optionalMyService = iMyServiceRepository.findById(id);
        //if (optionalMyService.isPresent())
    }

    public void saveMyService(MyService service){
        iMyServiceRepository.save(service);
    }

    public void deleteMyServiceById(Long id){
        iMyServiceRepository.deleteById(id);
    }


}
