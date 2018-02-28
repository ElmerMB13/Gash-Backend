package gash.truck;

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
public class TruckController 
{
    @Autowired
    private TruckService truckService;

    @RequestMapping(value = "/getTrucks", method = RequestMethod.GET)
    public String getTrucks()
    {
        ArrayList<Truck> truckList = new ArrayList<Truck>();
        try
        { 
            Gson gson = new Gson();
            truckList = truckService.getTrucks();
            String json = gson.toJson(truckList);
            return json;
        }
        catch(Exception e)
        {
            throw e;
        }
        ///return driversList;
    }
}