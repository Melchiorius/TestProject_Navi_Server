package test_project.navi.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Vehicle {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "speed")
    private double speed;
    @Column(name = "owner")
    private String owner;
    @Column(name = "description")
    private String description;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "route_id")
    private int routeId;
    @Column(name = "next_route_point_id")
    private int nextRoutePointId;
    @Column(name = "x")
    private double x;
    @Column(name = "Y")
    private double y;

    public Vehicle() {}

    public Vehicle(String name, String owner, String description, String cargo) {
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", cargo='" + cargo + '\'' +
                ", routeId=" + routeId +
                ", nextRoutePointId=" + nextRoutePointId +
                ", location = (" + x + "," + y + ")" +
                '}';
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public double getSpeed() { return speed; }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public String getCargo() {
        return cargo;
    }

    public int getRouteId() {
        return routeId;
    }

    public int getNextRoutePointId() { return nextRoutePointId; }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) { this.speed = speed; }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRouteId(int routeId) { this.routeId = routeId; }

    public void setNextRoutePointId(int nextRoutePointId) { this.nextRoutePointId = nextRoutePointId; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }


}
