package gash.route;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="route", schema="public")
public class Route
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int routeId;
    private String routeCode;
    private int routeDistance;
    private int routeEstimatedTime;

    public Route()
    {

    }
    /**
     * @return the routeCode
     */
    public String getRouteCode() {
        return routeCode;
    }

    /**
     * @return the routeId
     */
    public int getRouteId() {
        return routeId;
    }

    /**
     * @return the routeDistance
     */
    public int getRouteDistance() {
        return routeDistance;
    }

    /**
     * @return the routeEstimatedTime
     */
    public int getRouteEstimatedTime() {
        return routeEstimatedTime;
    }

    /**
     * @param routeCode the routeCode to set
     */
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }
    /**
     * @param routeDistance the routeDistance to set
     */
    public void setRouteDistance(int routeDistance) {
        this.routeDistance = routeDistance;
    }

    /**
     * @param routeEstimatedTime the routeEstimatedTime to set
     */
    public void setRouteEstimatedTime(int routeEstimatedTime) {
        this.routeEstimatedTime = routeEstimatedTime;
    }

    /**
     * @param routeId the routeId to set
     */
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
}

