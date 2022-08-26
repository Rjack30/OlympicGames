package Entity;
import java.util.HashMap;

class Cities {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("China", "Beijing");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Jamaica", "Kingston");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Russia", "Washington DC");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
