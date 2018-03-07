package gash.monitoring;


import java.sql.Connection;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement; 

@Service
public class MonitoringService
{
    @Autowired
    MonitoringRepository monitoringRepository;
    Connection conn= null;
    
    public String getMonitoring() throws Exception
    {
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:~/GashDB", "sa","");
        String selectMonitorings= "select m.monitoring_id, m.monitoring_last_updated_date_time, d.driver_name, d.driver_telephone_number, d.driver_national_Id, r.route_code, t.truck_number,t.truck_make, s.MONDAY_ENTRANCE , s.TUESDAY_ENTRANCE , s.WEDNESDAY_ENTRANCE, s.THURSDAY_ENTRANCE, s.FRIDAY_ENTRANCE, s.SATURDAY_ENTRANCE, s.SUNDAY_ENTRANCE, s.MONDAY_OUT, s.THURSDAY_OUT, s.WEDNESDAY_OUT, s.TUESDAY_OUT, s.FRIDAY_OUT , s.SATURDAY_OUT, s.SATURDAY_OUT, s.SUNDAY_OUT, st.status    from Monitoring as m inner join Driver as d on m.driver_id=d.driver_id inner join Schedule as s on s.schedule_Id=d.schedule_Id inner join Truck as t on m.truck_id=t.truck_id inner join Route as r on m.route_id=r.route_id inner join Status as st on m.status_id=st.status_id";
        try {
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery(selectMonitorings);
            String jsonArray= convert(rs);
            return jsonArray;
            //driversList = driverRepository.findAll();
        } 
        catch (Exception e) {
            throw e;
        }
    }

    public static String convert( ResultSet rs )throws SQLException, JSONException
    {
        JSONArray json = new JSONArray();
        ResultSetMetaData rsmd = rs.getMetaData();

        while(rs.next()) {
        int numColumns = rsmd.getColumnCount();
        JSONObject obj = new JSONObject();

        for (int i=1; i<numColumns+1; i++) {
            String column_name = rsmd.getColumnName(i);

            if(rsmd.getColumnType(i)==java.sql.Types.ARRAY){
            obj.put(column_name, rs.getArray(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.BIGINT){
            obj.put(column_name, rs.getInt(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.BOOLEAN){
            obj.put(column_name, rs.getBoolean(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.BLOB){
            obj.put(column_name, rs.getBlob(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.DOUBLE){
            obj.put(column_name, rs.getDouble(column_name)); 
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.FLOAT){
            obj.put(column_name, rs.getFloat(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.INTEGER){
            obj.put(column_name, rs.getInt(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.NVARCHAR){
            obj.put(column_name, rs.getNString(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.VARCHAR){
            obj.put(column_name, rs.getString(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.TINYINT){
            obj.put(column_name, rs.getInt(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.SMALLINT){
            obj.put(column_name, rs.getInt(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.DATE){
            obj.put(column_name, rs.getDate(column_name));
            }
            else if(rsmd.getColumnType(i)==java.sql.Types.TIMESTAMP){
            obj.put(column_name, rs.getTimestamp(column_name));   
            }
            else{
            obj.put(column_name, rs.getObject(column_name));
            }
        }

        json.put(obj);
        }

        return json.toString();
    }

}