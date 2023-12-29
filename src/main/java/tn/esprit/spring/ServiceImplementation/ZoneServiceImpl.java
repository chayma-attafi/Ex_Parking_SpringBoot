package tn.esprit.spring.ServiceImplementation;

import tn.esprit.spring.Entitie.Zone;
import tn.esprit.spring.Repesotry.ZoneReposotory;
import tn.esprit.spring.ServiceInterface.ZoneInterface;

import java.util.List;
import java.util.Optional;

public class ZoneServiceImpl implements ZoneInterface {
    ZoneReposotory zoneReposotory;
    @Override
    public List<Zone> retrieveAllFoyers() {
        return zoneReposotory.findAll();
    }

    @Override
    public Zone addFoyer(Zone z) {
        return zoneReposotory.save(z);
    }

    @Override
    public Zone updateFoyer(Zone z) {
        return zoneReposotory.save(z);
    }

    @Override
    public Zone retrieveFoyer(Integer idZone) {
        return zoneReposotory.findById(idZone).orElse(null);
    }

    @Override
    public void removeFoyer(Integer idZone) {
        zoneReposotory.deleteById(idZone);

    }
}
