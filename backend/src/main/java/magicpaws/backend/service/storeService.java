package magicpaws.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magicpaws.backend.model.Store;
import magicpaws.backend.repository.StoreRepository;

@Service
public class StoreService {
    @Autowired 
    StoreRepository storeRepository;
    
    public void addProduct(Store store) {
        storeRepository.save(store);
    }
   
}
