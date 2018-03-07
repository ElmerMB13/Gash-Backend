package gash.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Connection; 

@Service
public class RouteService
{
    @Autowired
    RouteRepository routeRepository;  

    public Route addRoute(Route route)
    {
        try
        {
            routeRepository.save(route);
        }
        catch(Exception e)
        {
            throw e;
        }
        return route;
    }
}