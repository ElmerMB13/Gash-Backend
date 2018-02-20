package gash.driver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {
        void delete(Driver driver);
        List<Driver> findAll();
        Driver findOne(Integer id);
        Driver save(Driver driver);
}