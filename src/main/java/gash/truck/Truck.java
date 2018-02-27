package gash.truck;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;



@Entity
@Table(name="truck", schema = "public")
public class Truck
{
    @Id
    @GeneratedValue
    private Integer truckId;
    private String truckNumber;
    private String truckMake;
    private String truckModel;
    private int truckYear;
    @Column(nullable = true)
    private Date lastUpdatedDateTime;

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getTruckMake() {
        return truckMake;
    }

    public void setTruckMake(String truckMake) {
        this.truckMake = truckMake;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public int getTruckYear() {
        return truckYear;
    }

    public void setTruckYear(int truckYear) {
        this.truckYear = truckYear;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

     public Truck(){}
     public Truck(String truckNumber, String truckMake, String truckModel, int truckYear, Date lastUpdatedDateTim)
     {
         this.truckNumber = truckNumber;
         this.truckMake = truckMake;
         this.truckModel = truckModel;
         this.truckYear = truckYear;
     }
}
