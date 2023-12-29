package tn.esprit.spring.ServiceInterface;

import tn.esprit.spring.Entitie.Personnel;

import java.util.List;
import java.util.Optional;

public interface PersonnelInterface {
    List<Personnel> retrieveAllFoyers();
    Personnel addFoyer (Personnel p);

    Personnel updateFoyer (Personnel p);

    Personnel retrieveFoyer (Integer idPersonnel);

    void removeFoyer (Integer idPersonnel);
}
