package racingcar.model;

import java.util.ArrayList;
import java.util.List;

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
        int maxDistance = Integer.MIN_VALUE;
        for (Car car : cars) {
            maxDistance = Math.max(maxDistance,car.getPosition());
        }
        return maxDistance;
    }

    public List<String> getWinnerNames(Integer maxDistance){
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if(car.isWinner(maxDistance)){
                winners.add(car.getName());
            };
        }
        return winners;
    }



}
