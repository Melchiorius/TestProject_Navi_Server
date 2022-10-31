package test_project.navi.server.entity.vehicle;

import test_project.navi.server.entity.Vehicle;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ship")
public class Ship  extends Vehicle {
}
