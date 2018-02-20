package gash.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public Driver addDriver(Driver driver) {
        System.out.println(driverRepository);
        System.out.println(driver.driverName);
        driverRepository.save(driver);
        return driver;
    }

    public Iterable<Driver> getDrivers(){
        return driverRepository.findAll();
    }
}