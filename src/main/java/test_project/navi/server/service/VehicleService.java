package test_project.navi.server.service;

import test_project.navi.server.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    public List<Vehicle> getAllVehicles();
    public void saveVehicle(Vehicle vehicle);
    public Vehicle getVehicle(int id);
    public void deleteVehicle(int id);
}
