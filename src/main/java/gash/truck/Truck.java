package gash.truck;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import gash.driver.Driver;
import javax.persistence.OneToOne;



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



	/**
	* Returns value of truckId
	* @return
	*/
	public Integer getTruckId() {
		return truckId;
	}

	/**
	* Sets new value of truckId
	* @param
	*/
	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}

	/**
	* Returns value of truckNumber
	* @return
	*/
	public String getTruckNumber() {
		return truckNumber;
	}

	/**
	* Sets new value of truckNumber
	* @param
	*/
	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	/**
	* Returns value of truckMake
	* @return
	*/
	public String getTruckMake() {
		return truckMake;
	}

	/**
	* Sets new value of truckMake
	* @param
	*/
	public void setTruckMake(String truckMake) {
		this.truckMake = truckMake;
	}

	/**
	* Returns value of truckModel
	* @return
	*/
	public String getTruckModel() {
		return truckModel;
	}

	/**
	* Sets new value of truckModel
	* @param
	*/
	public void setTruckModel(String truckModel) {
		this.truckModel = truckModel;
	}

	/**
	* Returns value of truckYear
	* @return
	*/
	public int getTruckYear() {
		return truckYear;
	}

	/**
	* Sets new value of truckYear
	* @param
	*/
	public void setTruckYear(int truckYear) {
		this.truckYear = truckYear;
	}

	/**
	* Returns value of lastUpdatedDateTime
	* @return
	*/
	public Date getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}

	/**
	* Sets new value of lastUpdatedDateTime
	* @param
	*/
	public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}
}
