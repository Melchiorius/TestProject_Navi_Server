package test_project.navi.server.exception_handling;

public class NoSuchVehicleException extends RuntimeException{

    public NoSuchVehicleException(String message) {
        super(message);
    }
}
