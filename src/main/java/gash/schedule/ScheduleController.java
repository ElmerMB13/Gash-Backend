package gash.schedule;

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
    @RequestParam String fridayOut, @RequestParam String saturdayOut, @RequestParam String sundayOut, @RequestParam String  nationalId) throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("driver");
        Schedule schedule = new Schedule();
        schedule.mondayEntrance=mondayEntrance;
        schedule.tuesdayEntrance=tuesdayEntrance;
        schedule.wednesdayEntrance=wednesdayEntrance;
        schedule.thursdayEntrance=thursdayEntrance;
        schedule.fridayEntrance=fridayEntrance;
        schedule.saturdayEntrance=saturdayEntrance;
        schedule.sundayEntrance=sundayEntrance;
        schedule.mondayOut=mondayOut;
        schedule.tuesdayOut=tuesdayOut;
        schedule.wednesdayOut=wednesdayOut;
        schedule.thursdayOut=thursdayOut;
        schedule.fridayOut=fridayOut;
        schedule.saturdayOut=saturdayOut;
        schedule.sundayOut=sundayOut;
        try
        { 
            schedule=scheduleService.addSchedule(schedule, nationalId);
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