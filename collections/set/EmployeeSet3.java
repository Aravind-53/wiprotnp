package set;

import java.util.HashSet;
import java.util.Iterator;
{
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Aravind");
        employees.add("Rahul");
        employees.add("Kiran");
        employees.add("Teja");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}