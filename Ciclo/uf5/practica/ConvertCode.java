package cat.itb.martamacias7e4.dam.m03.uf5.practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertCode {
    String oldCode;
    String newCode;

    public ConvertCode(String oldCode, String newCode) {
        this.oldCode = oldCode;
        this.newCode = newCode;
    }

    public String getOldCode() {
        return oldCode;
    }

    public String getNewCode() {
        return newCode;
    }
    private static File getCodeFile() {
        String userPath = "C:\\Users\\macia\\OneDrive\\Escriptori\\DAM\\martaM03\\dam-m03-uf1-data\\src\\cat\\itb\\martamacias7e4\\dam\\m03\\uf5\\practica\\convertCode.txt";
        return new File(userPath);
    }
    public static List<ConvertCode> getListCodes() throws FileNotFoundException {
        File codeFile = getCodeFile(); // Codes file to list
        Scanner scanCodeFile = new Scanner(codeFile);
        List<ConvertCode> codes = new ArrayList<>();
        while (scanCodeFile.hasNext()){
            codes.add(readCodes(scanCodeFile));
        }
        return codes;
    }

    private static ConvertCode readCodes(Scanner scanCodeFile) {
        String newCode = scanCodeFile.next();
        String oldCode = scanCodeFile.next();
        return new ConvertCode(newCode, oldCode);
    }


}
