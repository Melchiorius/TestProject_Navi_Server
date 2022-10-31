package test_project.navi.server.dao;

import test_project.navi.server.entity.RoutePoint;
import test_project.navi.server.entity.Route;

import java.util.List;
import java.util.Map;

public interface RouteDAO {

    public List<Route> getAllRoutes();
    public void saveRoute(Route route);
    public Route getRoute(int id);
    public void deleteRoute(int id);
}
