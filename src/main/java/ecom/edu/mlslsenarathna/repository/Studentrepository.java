package ecom.edu.mlslsenarathna.repository;

import ecom.edu.mlslsenarathna.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<StudentEntity,String> {
}
