package gash.driver;

import org.h2.util.BitField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class DriverController
{

    @RequestMapping("/addDriver")
    public ModelAndView addDriver(@RequestParam String name, @RequestParam String nationalId, @RequestParam Date birthDate, @RequestParam String telephoneNumber)
    {
        ModelAndView modelAndView = new ModelAndView("driver");
        DriverService driverService = new DriverService();
        Driver driver = new Driver(nationalId,name,birthDate, telephoneNumber);
        try
        {
            driver=driverService.addDriver(driver);
            modelAndView.addObject("message","Driver added: "+ driver.driverName);
        }
        catch(Exception e)
        {
            modelAndView.addObject("message", "Failed to add driver: "+ driver.driverName);
        }
        return modelAndView;
    }
}