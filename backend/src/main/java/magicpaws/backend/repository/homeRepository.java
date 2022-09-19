package magicpaws.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import magicpaws.backend.model.modelHome;

public interface homeRepository extends JpaRepository<modelHome, Long> {
  List<modelHome> findByPublished(boolean published);
  List<modelHome> findByTitleContaining(String title);
}