package gash.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Connection; 

@Service
public class RouteService
{
    @Autowired
    RouteRepository routeRepository;
    Connection conn= null;
}