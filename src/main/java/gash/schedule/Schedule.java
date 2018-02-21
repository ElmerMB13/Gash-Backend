package gash.schedule;

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

@Entity
@Table(name="schedule", schema = "public")
public class Schedule
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int scheduleId;
    String mondayEntrance;
    String tuesdayEntrance;
    String wednesdayEntrance;
    String thursdayEntrance;
    String fridayEntrance;
    String saturdayEntrance;
    String sundayEntrance;
    String mondayOut;
    String tuesdayOut;
    String wednesdayOut;
    String thursdayOut;
    String fridayOut;
    String saturdayOut;
    String sundayOut;
    
    Date lastUpdatedDateTime;
    
    
}