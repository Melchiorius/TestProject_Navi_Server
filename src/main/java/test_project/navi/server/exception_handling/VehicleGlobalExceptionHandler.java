package test_project.navi.server.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class VehicleGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<VehicleIncorrectData> HandleException(Exception exception){
        VehicleIncorrectData data = new VehicleIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<VehicleIncorrectData> HandleException(NoSuchVehicleException exception){
        VehicleIncorrectData data = new VehicleIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
