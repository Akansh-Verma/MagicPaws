package magicpaws.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import magicpaws.backend.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{
    
}
