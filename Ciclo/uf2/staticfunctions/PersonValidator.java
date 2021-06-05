package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;


import java.util.Scanner;

public class PersonValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personName = scanner.next();
        String dni = scanner.next();
        String space = scanner.next();
        String phone = scanner.nextLine();
        String postalCode = scanner.next();
        if (isValidPersonName(personName) && isValidDni(dni) && isValidPhoneNumber(phone) && isValidPostalcode(postalCode)){
            System.out.println("Dades correctes");
        }else {
            System.out.println("Hi ha alguna dada incorrecta");
        }
    }
    /**
     * Returns true if is a valid phone number (composed only by digits, spaces or +)
     * @param phone
     * @return true if valid
     */
    public static boolean isValidPhoneNumber(String phone){
        String regex = "^[\\d\\s]+$";
        return phone.matches(regex);
    }

    /**
     * Returns true if is a valid person name (composed only characters and starts with upper case)
     * @param personName
     * @return true if valid
     */
    public static boolean isValidPersonName(String personName){
        String regex = "^[A-Z][a-z]+$";
        return personName.matches(regex);
    }

    /**
     * Returns true if is a valid dni (including correct letter)
     * @param dni
     * @return true if valid
     */
    public static boolean isValidDni(String dni){
        String regex = "^[0-9]{8}[A-Z]$";
        return dni.matches(regex);
    }

    /**
     * Returns true if is a valid postalCode
     * @param postalCode
     * @return true if valid
     */
    public static boolean isValidPostalcode(String postalCode){
        String regex = "^[0-9]{5}$";
        return postalCode.matches(regex);
    }
}
