package racingcar.view;

import java.util.List;

public class OutputView {
    public static void printError(String message){
        System.out.println("[ERROR] " + message);
    }

    public static void printCarPosition(int position){
        StringBuilder carPosition = new StringBuilder();
        for (int i = 0; i < position; i++) {
            carPosition.append("-");
        }
        System.out.println(carPosition);
    }
    public static void printCarName(String carName){
        System.out.print(carName + ": ");
    }

    public static void printNextLine(){
        System.out.println();
    }


    public static void printWinner(List<String> winners) {
        StringBuilder message = new StringBuilder();
        for (String winner : winners) {
            if(winners.size() >= 2) {
                message.append("최종 우승자 : ").append(winner).append(", ");
            }
            message.append("최종 우승자 : ").append(winner);
        }
        System.out.println(message);
    }

}
