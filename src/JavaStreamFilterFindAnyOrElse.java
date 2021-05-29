import java.util.Arrays;
import java.util.List;

public class JavaStreamFilterFindAnyOrElse
{
    public static void main(String[] args)
    {
        List<Customer> customerList = Arrays.asList(
                new Customer("Avinash",27),
                new Customer("Biswajeet", 27),
                new Customer("Ritesh",26),
                new Customer("Sanjay",28));

        //1. filter-findAny
        Customer customer =
                customerList
                        .stream() //convert List to Stream
                        .filter(ele -> "Biswajeet".equals(ele.getName())) //filter it with Biswajeet only
                        .findAny() //if it finds then return
                        .orElse(null);

        System.out.println("Name : "+customer.getName()+", Age : "+customer.getAge());
        System.out.println("----------------------------------------------------------");

        //2. working with multiple conditions
        Customer customer1 =
                customerList
                .stream()
                .filter(ele -> "Biswajeet".equals(ele.getName()) && 27 == ele.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer1.getName()+" is found!!");
    }
}
