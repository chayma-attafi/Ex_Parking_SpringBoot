package tn.esprit.spring.ServiceInterface;

import tn.esprit.spring.Entitie.Zone;

import java.util.List;
import java.util.Optional;

public interface ZoneInterface {
    List<Zone> retrieveAllFoyers();

    Zone addFoyer (Zone z);

    Zone updateFoyer (Zone z);

    Zone retrieveFoyer (Integer idZone);

    void removeFoyer (Integer idZone);
}
