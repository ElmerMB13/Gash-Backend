package gash.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.io.*;


@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public Driver addDriver(Driver driver) {
      try {
        driverRepository.save(driver);
      }catch(Exception ex) {
        System.out.println(ex);
      }
        return driver;
    }

    public ArrayList<Driver> getDrivers(){
        ArrayList<Driver> driversList = new ArrayList<Driver>();
        //driversList = driverRepository.findAll();
        for(Driver driver : driverRepository.findAll()){
            driversList.add(driver);
        }
        return driversList;
    }
}
