package gash.route;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route", schema="public")
public class Route
{
    @Id
    private int routeId;
    private String routeCode;
    private int routeDistance;

}