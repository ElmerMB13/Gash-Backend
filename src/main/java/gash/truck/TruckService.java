package gash.truck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class TruckService {

    @Autowired
    TruckRepository truckRepository;

    public ArrayList<Truck> getTrucks(){
        ArrayList<Truck> truckList = new ArrayList<>();
        //driversList = driverRepository.findAll();
        for(Truck truck : truckRepository.findAll()){
            truckList.add(truck);
        }
        return truckList;
    }
}