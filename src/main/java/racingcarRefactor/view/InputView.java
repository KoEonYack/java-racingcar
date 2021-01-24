package racingcarRefactor.view;

import java.util.Scanner;

public class InputView {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static int inputTotalLaps() {
        System.out.println("시도할 횟수를 입력해주세");
        return scanner.nextInt();
    }
}
