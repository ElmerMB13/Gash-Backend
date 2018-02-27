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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.ui.Model;

@RestController
public class DriverController
{
    @Autowired
    private DriverService driverService;

    @RequestMapping("/addDriver")
    public ModelAndView addDriver(@RequestParam(value="driverName") String driverName, @RequestParam String nationalId,
    @RequestParam String birthDate, @RequestParam String telephoneNumber, @RequestParam Integer truckId)
    {
        System.out.println(truckId);
        ModelAndView modelAndView = new ModelAndView("driver");
        Driver driver = new Driver(nationalId, driverName, birthDate, telephoneNumber);
        driver.truck.setTruckId(truckId);
        try
        {
            driver = driverService.addDriver(driver);
            modelAndView.addObject("message","Driver added: "+ driver.driverName);
        }
        catch(Exception e)
        {
            modelAndView.addObject("message", "Failed to add driver: "+ driver.driverName);
            throw e;
        }
        return modelAndView;
    }

    @RequestMapping(value = "/getDrivers", method = RequestMethod.GET)
    public String getDrivers()
    {
        ArrayList<Driver> driversList = new ArrayList<>();
        try
        {
            Gson gson = new Gson();
            driversList = driverService.getDrivers();
            String json=gson.toJson(driversList);
            return json;
        }
        catch(Exception e)
        {
            throw e;
        }
        ///return driversList;
    }
}
