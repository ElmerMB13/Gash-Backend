package gash.status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status", schema="public")
public class Status
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int statusId;
    String status;
}