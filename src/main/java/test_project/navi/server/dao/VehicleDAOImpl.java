package test_project.navi.server.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test_project.navi.server.entity.Vehicle;

import java.util.List;

@Repository
public class VehicleDAOImpl implements VehicleDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Vehicle> getAllVehicles() {
        Session session = sessionFactory.getCurrentSession();
        Query<Vehicle> query = session.createQuery("from Vehicle",Vehicle.class);
        List<Vehicle> allVehicle = query.getResultList();
        return allVehicle;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(vehicle);
    }

    @Override
    public Vehicle getVehicle(int id) {
        Session session = sessionFactory.getCurrentSession();
        Vehicle vehicle = session.get(Vehicle.class,id);
        return vehicle;
    }

    @Override
    public void deleteVehicle(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Vehicle> query = session.createQuery("delete from Vehicle where id=:vehicleId");
        query.setParameter("vehicleId",id);
        query.executeUpdate();
    }
}
