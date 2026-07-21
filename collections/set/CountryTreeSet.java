import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
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

        CountryTreeSet c = new CountryTreeSet();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");

        System.out.println(c.getCountry("USA"));
        System.out.println(c.getCountry("China"));
    }
}