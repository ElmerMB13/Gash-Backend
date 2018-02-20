package gash.driver;

import org.h2.util.BitField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@RestController
public class DriverController extends SimpleFormController
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

    @RequestMapping(value = "/create-schedule", method = RequestMethod.GET)
    @ModelAttribute("alldrivers")
    public List<Driver> getDrivers()
    {
        List<Driver> driverList = new List();
        try
        { 
            driverList = driverService.getDrivers();
        }
        catch(Exception e)
        {
            throw e;
        }
        return driverList;
    }
}