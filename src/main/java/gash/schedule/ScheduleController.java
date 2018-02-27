package gash.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.juli.DateFormatCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ScheduleController
{

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping("/addSchedule")
    public ModelAndView addSchedule(@RequestParam String mondayEntrance, @RequestParam String tuesdayEntrance, @RequestParam String wednesdayEntrance, 
    @RequestParam String thursdayEntrance, @RequestParam String fridayEntrance, @RequestParam String saturdayEntrance, @RequestParam String sundayEntrance, 
    @RequestParam String mondayOut, @RequestParam String tuesdayOut, @RequestParam String wednesdayOut, @RequestParam String thursdayOut, 
    @RequestParam String fridayOut, @RequestParam String saturdayOut, @RequestParam String sundayOut, @RequestParam int  driverId) throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("driver");
        Schedule schedule = new Schedule();
        DateFormat df= new SimpleDateFormat("hh:mm");
        schedule.mondayEntrance=  df.parse(mondayEntrance);
        schedule.tuesdayEntrance= df.parse(tuesdayEntrance);
        schedule.wednesdayEntrance=df.parse(wednesdayEntrance);
        schedule.thursdayEntrance=df.parse(thursdayEntrance);
        schedule.fridayEntrance=df.parse(fridayEntrance);
        schedule.saturdayEntrance=df.parse(saturdayEntrance);
        schedule.sundayEntrance=df.parse(sundayEntrance);
        schedule.mondayOut=df.parse(mondayOut);
        schedule.tuesdayOut=df.parse(tuesdayOut);
        schedule.wednesdayOut=df.parse(wednesdayOut);
        schedule.thursdayOut=df.parse(thursdayOut);
        schedule.fridayOut=df.parse(fridayOut);
        schedule.saturdayOut=df.parse(saturdayOut);
        schedule.sundayOut=df.parse(sundayOut);
        try
        { 
            schedule=scheduleService.addSchedule(schedule, driverId);
            modelAndView.addObject("message","Schedule added: "+ schedule.scheduleId);
        }
        catch(Exception e)
        {
            modelAndView.addObject("message", "Failed to add driver: "+ schedule.scheduleId);
            throw e;
        }
        return modelAndView;
    }
}