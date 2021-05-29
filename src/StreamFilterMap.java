import com.sun.deploy.xml.CustomParser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterMap
{
    public static void main(String[] args)
    {
        List<Customer> customerList = Arrays.asList(
                new Customer("Avinash", 27),
                new Customer("Biswajeet",27),
                new Customer("Ritesh",26),
                new Customer("Sanjay",28)
        );

        String name =
                customerList
                .stream()
                .filter(ele -> "Biswajeet".equals(ele.getName()))
                        //map it with getName
                .map(Customer :: getName)
                .findAny()
                .orElse(null);

        System.out.println(name);
        System.out.println("-----------------------------------------------");

        //print all the names from the list :
        List<String> listOfAllNames =
                customerList
                .stream()
                .map(Customer::getName)
                .collect(Collectors.toList());

        //method reference example for lambda :
        listOfAllNames.forEach(System.out::println);
    }
}
