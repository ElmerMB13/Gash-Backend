package gash.schedule;

import javax.persistence.Id;
import javax.persistence.Entity;
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
    int scheduleId;
    Date shceduleEntrance;
    Date shceduleOut;
    Date lastUpdatedDateTime;

    
}