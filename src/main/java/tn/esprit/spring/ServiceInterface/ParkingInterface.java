package tn.esprit.spring.ServiceInterface;

import tn.esprit.spring.Entitie.Parking;

import java.util.List;
import java.util.Optional;

public interface ParkingInterface {
    List<Parking> retrieveAllFoyers();

    Parking addFoyer (Parking p);

    Parking updateFoyer (Parking p);

    Parking retrieveFoyer (Integer idParking);

    void removeFoyer (Integer idParking);
}
