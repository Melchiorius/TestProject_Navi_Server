package test_project.navi.server.service;

import test_project.navi.server.entity.Route;

import java.util.List;

public interface RouteService {
    public List<Route> getAllRoutes();
    public void saveRoute(Route vehicle);
    public Route getRoute(int id);
    public void deleteRoute(int id);
}
