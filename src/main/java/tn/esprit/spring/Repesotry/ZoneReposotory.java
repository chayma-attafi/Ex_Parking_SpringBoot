package tn.esprit.spring.Repesotry;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entitie.Zone;

import java.util.Optional;

public interface ZoneReposotory  extends JpaRepository<Zone,Integer> {

}
