package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    List<Car> cars;
    List<Car> maxCars = new ArrayList<>();

    public Winner(List<Car> cars){
        this.cars = cars;
    }

    public List<Car> whoIsWinner(){
        int max = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if(car.getDistance() > max){
                max = car.getDistance();
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if(car.getDistance()==max){
                maxCars.add(car);
            }
        }

        return maxCars;
    }
}