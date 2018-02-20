package gash.driver;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


//@OneToMany(mappedBy="match_participant_id")
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Entity
@Table(name="driver", schema = "public")
public class Driver
{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     int driverId;
     Integer scheduleId;
     Integer truckId;
     Integer routeId;
     Integer invoiceId;
     String driverNationalId;
     String driverName;
     String driverTelephoneNumber;
     String driverBirthDate;
     Date lastUpdatedDateTime;

     public Driver(){}
     public Driver(String driverNationalId, String driverName, String birthDate, String telephoneNumber)
     {
         this.driverNationalId=driverNationalId;
         this.driverName= driverName;
         this.driverBirthDate=birthDate;
         this.driverTelephoneNumber=telephoneNumber;
         this.scheduleId=null;
         this.truckId=null;
         this.routeId=null;
         this.invoiceId=null;
         
     }
}