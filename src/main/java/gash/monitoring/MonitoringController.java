package gash.monitoring;

import java.util.ArrayList;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class MonitoringController
{
    @Autowired
    private MonitoringService monitoringService;

    @RequestMapping("/getMonitoring")
    public String getMonitoring() throws Exception
    {
        String jsonArray;
        try 
        {
            jsonArray = monitoringService.getMonitoring();
            return jsonArray;
        } 
        catch (Exception e) {
            throw e;
        }
    }
}