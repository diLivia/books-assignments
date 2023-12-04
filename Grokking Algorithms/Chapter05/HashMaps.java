import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> phoneListMap = new HashMap<>();
        
        phoneListMap.put("Jenny", 8675309);
        phoneListMap.put("Emergency", 911);

        System.out.println(printPhoneNumber(phoneListMap, "Jenny"));
        System.out.println(printPhoneNumber(phoneListMap, "Emergency"));
        System.out.println(printPhoneNumber(phoneListMap, "Caio"));
    }

    private static String printPhoneNumber(Map<String, Integer> hashMap, String name) {
        // Verificar se a chave está presente na HashMap
        if (hashMap.containsKey(name)) {
            // Recuperar o valor associado à chave e imprimir
            int phoneNumber = hashMap.get(name);
            return "Name: " + name + ", Phone Number: " + phoneNumber;
        } else {
            return "Number of '" + name + "' not found in phone list.";
        }
    }
    
}
