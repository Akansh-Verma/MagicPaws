package magicpaws.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magicpaws.backend.repository.storeRepository;

@Service
public interface storeService {
    @Autowired 
    private storeRepository storerepository;
    
}
