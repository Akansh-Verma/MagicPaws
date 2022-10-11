package magicpaws.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import magicpaws.backend.model.store;

@Repository
public interface storeRepository extends JpaRepository<store, Integer>{
    
}
