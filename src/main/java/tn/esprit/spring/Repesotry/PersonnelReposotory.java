package tn.esprit.spring.Repesotry;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entitie.Personnel;

import java.util.Optional;

public interface PersonnelReposotory extends JpaRepository<Personnel,Integer> {


}
