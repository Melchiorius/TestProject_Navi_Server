package test_project.navi.server.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test_project.navi.server.entity.Route;
import test_project.navi.server.entity.RoutePoint;

import java.util.List;

@Repository
public class RouteDAOImpl implements RouteDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Route> getAllRoutes() {
        Session session = sessionFactory.getCurrentSession();
        Query<Route> query = session.createQuery("from Route", Route.class);
        List<Route> allRoutes = query.getResultList();
        //allRoutes.stream().forEach(route -> {
        //    List<RoutePoint> routePoints = session.createQuery("from RoutePoint where route_id="+route.getId(),RoutePoint.class).getResultList();
        //    routePoints.stream().forEach(e -> {route.addPoint(e);});
        //});
        return allRoutes;
    }

    @Override
    public void saveRoute(Route route) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(route);
    }

    @Override
    public Route getRoute(int id) {
        Session session = sessionFactory.getCurrentSession();
        Route route = session.get(Route.class,id);
        //List<RoutePoint> routePoints = session.createQuery("from RoutePoint where route_id="+id,RoutePoint.class).getResultList();
        //routePoints.stream().forEach(e -> {route.addPoint(e);});
        return route;
    }

    @Override
    public void deleteRoute(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Route> query = session.createQuery("delete from Route where id=:routeId");
        query.setParameter("routeId",id);
        query.executeUpdate();
    }
}
