package gash.monitoring;



import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="monitoring", schema="public")
public class Monitoring
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int monitoringId;
    private Integer statusId;
    private Integer driverId;
    private Integer routeId;
    private Integer truckId;
    private Date monitoringLastUpdatedDateTime;

    /**
     * @return the driverId
     */
    public Integer getDriverId() {
        return driverId;
    }
    /**
     * @return the monitoringId
     */
    public int getMonitoringId() {
        return monitoringId;
    }
    /**
     * @return the monitoringLastUpdatedDateTime
     */
    public Date getMonitoringLastUpdatedDateTime() {
        return monitoringLastUpdatedDateTime;
    }
    /**
     * @return the routeId
     */
    public Integer getRouteId() {
        return routeId;
    }
    /**
     * @return the statusId
     */
    public Integer getStatusId() {
        return statusId;
    }
    /**
     * @return the truckId
     */
    public Integer getTruckId() {
        return truckId;
    }

    /**
     * @param driverId the driverId to set
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * @param monitoringId the monitoringId to set
     */
    public void setMonitoringId(int monitoringId) {
        this.monitoringId = monitoringId;
    }

    /**
     * @param monitoringLastUpdatedDateTime the monitoringLastUpdatedDateTime to set
     */
    public void setMonitoringLastUpdatedDateTime(Date monitoringLastUpdatedDateTime) {
        this.monitoringLastUpdatedDateTime = monitoringLastUpdatedDateTime;
    }

    /**
     * @param routeId the routeId to set
     */
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    /**
     * @param statusId the statusId to set
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * @param truckId the truckId to set
     */
    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }
}