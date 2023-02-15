package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
@Controller
public class CarController {
    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "count", required = false)
                                    Integer count) {
        model.addAttribute("cars", carService.getCars(count));
        return "carTable";
    }
}