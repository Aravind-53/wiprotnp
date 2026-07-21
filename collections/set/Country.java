package set;

import java.util.HashSet;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Country c = new Country();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");

        System.out.println(c.getCountry("India"));
        System.out.println(c.getCountry("China"));
    }
}