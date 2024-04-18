package racingcar.view;

public class OutputView {
    public static void printError(String message){
        System.out.println("[ERROR] " + message);
    }

    public static void printCarPosition(int position){
        StringBuilder carPosition = new StringBuilder();
        for (int i = 0; i < position; i++) {
            carPosition.append("-");
        }
    }
    public static void printCarName(String carName){
        System.out.print(carName + ": ");
    }

    public static void printNextLine(){
        System.out.println();
    }






}
