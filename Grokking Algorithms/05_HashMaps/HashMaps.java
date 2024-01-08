import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    private Map<String, Integer> phoneListMap = new HashMap<>();

    private void printPhoneNumber(String name) {
        if (phoneListMap.containsKey(name)) {
            int phoneNumber = phoneListMap.get(name);
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber); 
        } else {
            System.out.println("Number of '" + name + "' not found in phone list.");
        }
    }

    private void addContact(String name, Integer phoneNumber){
        if (phoneListMap.containsKey(name)) {
            System.out.println(name + " is already in the list."); 
        } else {
            phoneListMap.put(name, phoneNumber);
            System.out.println(name + " added to the list."); 
        }
    }

    public static void main(String[] args) {
        HashMaps myPhoneList = new HashMaps();
        
        myPhoneList.addContact("Jenny", 8675309);
        myPhoneList.addContact("Emergency", 911);

        myPhoneList.printPhoneNumber("Jenny");
        myPhoneList.printPhoneNumber("Emergency");
        myPhoneList.printPhoneNumber("Caio");
    }
    
}
