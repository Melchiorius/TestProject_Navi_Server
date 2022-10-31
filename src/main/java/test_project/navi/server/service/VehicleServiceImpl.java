package test_project.navi.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test_project.navi.server.dao.VehicleDAO;
import test_project.navi.server.entity.Vehicle;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Override
    @Transactional
    public List<Vehicle> getAllVehicles() {
        return vehicleDAO.getAllVehicles();
    }

    @Override
    @Transactional
    public void saveVehicle(Vehicle vehicle) {
        vehicleDAO.saveVehicle(vehicle);
    }

    @Override
    @Transactional
    public Vehicle getVehicle(int id) {
        return vehicleDAO.getVehicle(id);
    }

    @Override
    @Transactional
    public void deleteVehicle(int id) {
        vehicleDAO.deleteVehicle(id);
    }
}
