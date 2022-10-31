package test_project.navi.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "points")
@IdClass(RoutePointId.class)
public class RoutePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="x")
    private double x;
    @Column(name="y")
    private double y;

    @Id
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    public RoutePoint() {
    }

    public RoutePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "RoutePoint{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getRouteId() { return route.getId(); }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
