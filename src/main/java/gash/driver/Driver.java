package gash.driver;

import gash.truck.Truck;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.MapsId;

import java.util.Date;


@Entity
@Table(name="driver", schema = "public")
public class Driver
{
    @Id
    @GeneratedValue
    int driverId;
    @Column(nullable = true)
    Integer scheduleId;
    @OneToOne
    @JoinColumn(name="truckId")
    @MapsId
    Truck truck;
    @Column(nullable = true)
    Integer routeId;
    @Column(nullable = true)
    Integer invoiceId;
    String driverNationalId;
    String driverName;
    String driverTelephoneNumber;
    String driverBirthDate;
    @Column(nullable = true)
    Date lastUpdatedDateTime;

     public Driver(){}
     public Driver(String driverNationalId, String driverName, String birthDate, String telephoneNumber)
     {
         this.driverNationalId = driverNationalId;
         this.driverName = driverName;
         this.driverBirthDate = birthDate;
         this.driverTelephoneNumber = telephoneNumber;
         this.scheduleId = null;
         this.truck = null;
         this.routeId = null;
         this.invoiceId = null;

     }
}
