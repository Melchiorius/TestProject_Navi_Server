package test_project.navi.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test_project.navi.server.dao.RouteDAO;
import test_project.navi.server.entity.Route;
import test_project.navi.server.entity.Vehicle;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    private RouteDAO routeDAO;

    @Override
    @Transactional
    public List<Route> getAllRoutes() {
        return routeDAO.getAllRoutes();
    }

    @Override
    @Transactional
    public void saveRoute(Route route) {
        routeDAO.saveRoute(route);
    }

    @Override
    @Transactional
    public Route getRoute(int id) {
        return routeDAO.getRoute(id);
    }

    @Override
    @Transactional
    public void deleteRoute(int id) {
        routeDAO.deleteRoute(id);
    }
}
