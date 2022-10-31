package test_project.navi.server.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "route", fetch = FetchType.EAGER)
    private List<RoutePoint> points;

    public Route() {
    }

    public Route(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", points=" + points +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<RoutePoint> getPoints() {
        return points;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addPoint(RoutePoint point) {
        if(points == null){
            points = new ArrayList<>();
        }
        this.points = points;
    }

    public void setPoints(List<RoutePoint> points) {
        this.points = points;
    }
}
