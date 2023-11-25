package com.lirianosclening.llc.Services;

import com.lirianosclening.llc.Models.ServiceProvider;
import com.lirianosclening.llc.Repositories.IServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProviderService {

    @Autowired
    IServiceProviderRepository iServiceProviderRepository;

    public List<ServiceProvider> getAllServiceProvider(){
        return iServiceProviderRepository.findAll();
    }

    public ServiceProvider getServiceProviderById(Long id){
        return iServiceProviderRepository.findById(id).orElse(null);
    }

    public void saveServiceProvider(Long id, ServiceProvider serviceProvider){
        iServiceProviderRepository.save(serviceProvider);
    }

    public ServiceProvider updateServiceProviderById(Long id, ServiceProvider request){
        Optional<ServiceProvider>optionalServiceProvider = iServiceProviderRepository.findById(id);
        if(optionalServiceProvider.isPresent()){
            ServiceProvider serviceProvider = new ServiceProvider();
            //serviceProvider.setName(request.getName());
        }
        return null;
    }

    public void deleteServiceProviderById(Long id){
        if(iServiceProviderRepository.findById(id).isPresent())
            iServiceProviderRepository.deleteById(id);
    }

}
