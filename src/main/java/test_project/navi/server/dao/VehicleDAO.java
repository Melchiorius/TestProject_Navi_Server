package test_project.navi.server.dao;

import test_project.navi.server.entity.Vehicle;

import java.util.List;

public interface VehicleDAO {
    public List<Vehicle> getAllVehicles();
    public void saveVehicle(Vehicle vehicle);
    public Vehicle getVehicle(int id);
    public void deleteVehicle(int id);

}
