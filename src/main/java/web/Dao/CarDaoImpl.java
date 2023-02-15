package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.Model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", "black", "A111AA"));
        carList.add(new Car("BMW", "pink", "A222AA"));
        carList.add(new Car("Mercedes", "yellow", "A333AA"));
        carList.add(new Car("Nissan", "blue", "A444AA"));
        carList.add(new Car("YAZ", "green", "A555AA"));
    }

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}