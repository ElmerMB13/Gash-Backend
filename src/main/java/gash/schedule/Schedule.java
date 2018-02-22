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
    Date mondayEntrance;
    Date tuesdayEntrance;
    Date wednesdayEntrance;
    Date thursdayEntrance;
    Date fridayEntrance;
    Date saturdayEntrance;
    Date sundayEntrance;
    Date mondayOut;
    Date tuesdayOut;
    Date wednesdayOut;
    Date thursdayOut;
    Date fridayOut;
    Date saturdayOut;
    Date sundayOut;
    Date lastUpdatedDateTime;
    
    
}