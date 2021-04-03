package tr.com.somera.helloworld.common;

import java.util.Scanner;

public class ScannerProvider implements MessageProvider {
    @Override
    public String getMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message:");
        String message = scanner.nextLine();
        return message;
    }
}
