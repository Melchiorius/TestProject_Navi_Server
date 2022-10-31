package test_project.navi.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test_project.navi.server.entity.Route;
import test_project.navi.server.exception_handling.NoSuchVehicleException;
import test_project.navi.server.service.RouteService;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping("")
    public List<Route> showAllRoute(){
        List<Route> allRoutes = routeService.getAllRoutes();
        return allRoutes;
    }

    @GetMapping("/{id}")
    public Route showRoute(@PathVariable int id){
        Route route = routeService.getRoute(id);
        if(route == null){
            throw new NoSuchVehicleException("There is no route with ID = "+ id +" in DataBase");
        }
        return route;
    }

    @PostMapping("")
    public Route addNewRoute(@RequestBody Route route){
        routeService.saveRoute(route);
        return route;
    }

    @PutMapping("")
    public Route updateRoute(@RequestBody Route route){
        routeService.saveRoute(route);
        return route;
    }

    @DeleteMapping ("/{id}")
    public String deleteRoute(@PathVariable int id){
        Route route = routeService.getRoute(id);
        if(route == null){
            throw new NoSuchVehicleException("There is no route with ID = "+ id +" in DataBase");
        }
        routeService.deleteRoute(id);
        return "Route with ID = "+id+" was removed from database";
    }
}
