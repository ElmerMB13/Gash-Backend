package gash.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController
{
    @Autowired
    private RouteService routeService;
    
    @RequestMapping("/addRoute")
    public void addRoute()
    {
        
    }
}