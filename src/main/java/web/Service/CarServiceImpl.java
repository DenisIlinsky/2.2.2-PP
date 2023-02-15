package web.Service;

import org.springframework.stereotype.Service;
import web.Model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getCars(int count) {

        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
