package gmbs.view;

import java.util.Scanner;

public class InputView {
    private static final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputCarNames() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        return SCANNER.next();
    }

    public static String inputTryCount() {
        System.out.println(INPUT_TRY_NUMBER_MESSAGE);
        return SCANNER.next();
    }
}