package gash.schedule;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javassist.compiler.ast.Stmnt;

@Service
public class ScheduleService
{

    @Autowired
    ScheduleRepository scheduleRepository;
    Connection conn= null;
    
    public Schedule addSchedule(Schedule schedule, int driverId) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:~/GashDB", "sa","");
        Statement st= conn.createStatement();
        //String getLastId="select top(1) scheduleid from schedule";
        //int scheduleId=0;
        scheduleRepository.save(schedule);
        
        /*ResultSet rs= st.executeQuery(getLastId);
        while(rs.next())
        {
            scheduleId= rs.getInt("schedule_Id");
        }*/
        //rs.close();
        String updateDriver= "update Driver set schedule_id="+schedule.scheduleId+"where driver_id="+driverId;
        st.executeUpdate(updateDriver);
        return schedule;
    }   
}

