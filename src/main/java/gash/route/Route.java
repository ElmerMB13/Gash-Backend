package gash.route;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="route", schema="public")
public class Route
{
    @Id
    @GeneratedValue
    private int routeId;
    private String routeCode;
    private int routeDistance;

}
