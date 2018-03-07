package gash.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController
{
    @Autowired
    private RouteService routeService;
    
    @RequestMapping("/addRoute")
    public void addRoute(@RequestParam String routeCode, @RequestParam int routeDistance, @RequestParam int routeEstimatedTime)
    {
        Route route = new Route();
        route.setRouteCode(routeCode);
        route.setRouteDistance(routeDistance);
        route.setRouteEstimatedTime(routeEstimatedTime);
        try
        {
            
        }
        catch(Exception e)
        {

        }

    }
}