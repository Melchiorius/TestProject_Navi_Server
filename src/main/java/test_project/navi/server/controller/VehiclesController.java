package test_project.navi.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test_project.navi.server.entity.Vehicle;
import test_project.navi.server.exception_handling.NoSuchVehicleException;
import test_project.navi.server.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("")
    public List<Vehicle> showAllVehicle(){
        List<Vehicle> allVehicles = vehicleService.getAllVehicles();
        return allVehicles;
    }

    @GetMapping("/{id}")
    public Vehicle showVehicle(@PathVariable int id){
        Vehicle vehicle = vehicleService.getVehicle(id);
        if(vehicle == null){
            throw new NoSuchVehicleException("There is no vehicle with ID = "+ id +" in DataBase");
        }
        return vehicle;
    }

    @PostMapping("")
    public Vehicle addNewVehicle(@RequestBody Vehicle vehicle){
        vehicleService.saveVehicle(vehicle);
        return vehicle;
    }

    @PutMapping("")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle){
        vehicleService.saveVehicle(vehicle);
        return vehicle;
    }

    @DeleteMapping ("/{id}")
    public String deleteVehicle(@PathVariable int id){
        Vehicle vehicle = vehicleService.getVehicle(id);
        if(vehicle == null){
            throw new NoSuchVehicleException("There is no vehicle with ID = "+ id +" in DataBase");
        }
        vehicleService.deleteVehicle(id);
        return "Vehicle with ID = "+id+" was removed from database";
    }
}