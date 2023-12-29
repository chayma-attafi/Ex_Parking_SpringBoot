package tn.esprit.spring.ServiceImplementation;

import tn.esprit.spring.Entitie.Personnel;
import tn.esprit.spring.Repesotry.PersonnelReposotory;
import tn.esprit.spring.ServiceInterface.PersonnelInterface;

import java.util.List;
import java.util.Optional;

public class PersonnelServiceImpl implements PersonnelInterface {
    PersonnelReposotory personnelReposotory; //1 er injection avec instance
    @Override
    public List<Personnel> retrieveAllFoyers() {
        return personnelReposotory.findAll();
    }

    @Override
    public Personnel addFoyer(Personnel p) {
        return personnelReposotory.save(p);
    }

    @Override
    public Personnel updateFoyer(Personnel p) {
        return personnelReposotory.save(p);
    }

    @Override
    public Personnel retrieveFoyer(Integer idPersonnel) {
        return personnelReposotory.findById(idPersonnel).orElse(null);

    }

    @Override
    public void removeFoyer(Integer idPersonnel) {
        personnelReposotory.deleteById(idPersonnel);

    }
}
