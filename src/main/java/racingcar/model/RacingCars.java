package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {

    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveRacingCars(){
        for(Car car : cars){
            car.moveCar();
        }
    }

    public List<Car> getRacingCars(){
        return cars;
    }


    public Integer getMaxdistance(){
        Integer maxDistance = Integer.MIN_VALUE;
        for (Car car : cars) {
            maxDistance = Math.max(maxDistance,car.getPosition());
        }
        return maxDistance;
    }

    public List<String> getWinnerNames(Integer maxDistance){
        return cars.stream()
                .filter(car -> car.isWinner(maxDistance))
                .map(Car::getName)
                .collect(Collectors.toList());
    }



}
