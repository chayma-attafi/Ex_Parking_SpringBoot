package tn.esprit.spring.ServiceImplementation;

import tn.esprit.spring.Entitie.Parking;
import tn.esprit.spring.Repesotry.ParkingReposotory;
import tn.esprit.spring.ServiceInterface.ParkingInterface;

import java.util.List;
import java.util.Optional;

public class ParkingServiceImpl implements ParkingInterface {
    ParkingReposotory parkingReposotory;
    @Override
    public List<Parking> retrieveAllFoyers() {
        return parkingReposotory.findAll();
    }

    @Override
    public Parking addFoyer(Parking p) {
        return parkingReposotory.save(p);
    }

    @Override
    public Parking updateFoyer(Parking p) {
        return parkingReposotory.save(p);
    }

    @Override
    public Parking retrieveFoyer(Integer idParking) {
        return parkingReposotory.findById(idParking).orElse(null);
    }

    @Override
    public void removeFoyer(Integer idParking) {
        parkingReposotory.deleteById(idParking);
    }
}
