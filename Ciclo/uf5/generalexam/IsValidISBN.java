package cat.itb.martamacias7e4.dam.m03.uf5.generalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> codes = readIsbnCodes(scanner);
        isValidIsbnCode(codes);
    }

    private static void isValidIsbnCode(List<String> codes) {
        String regex = "^(?:978013|013)+(\\d{6})-(?:\\d|X)$";
        Pattern pattern = Pattern.compile(regex);
        for (String code: codes){
            Matcher matcher = pattern.matcher(code);
            if (matcher.matches()){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }

    }

    private static List<String> readIsbnCodes(Scanner scanner) {
        List<String> codes = new ArrayList<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quant; i++) {
            String isbn = scanner.nextLine();
            codes.add(isbn);
        }
        return codes;
    }
}
