package gash.driver;

import org.h2.util.BitField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class DriverController
{
    @Autowired
    private DriverService driverService;
    
    @RequestMapping("/addDriver")
    public ModelAndView addDriver(@RequestParam(value="driverName") String driverName, @RequestParam String nationalId, @RequestParam String birthDate, @RequestParam String telephoneNumber)
    {
        ModelAndView modelAndView = new ModelAndView("driver");
        Driver driver = new Driver(nationalId,driverName,birthDate, telephoneNumber);
        try
        { 
            driver=driverService.addDriver(driver);
            modelAndView.addObject("message","Driver added: "+ driver.driverName);
        }
        catch(Exception e)
        {
            modelAndView.addObject("message", "Failed to add driver: "+ driver.driverName);
            throw e;
        }
        return modelAndView;
    }
}