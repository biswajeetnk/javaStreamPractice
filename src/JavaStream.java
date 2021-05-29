import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream
{
    public static void main(String[] args)
    {
        List<String> productList = Arrays.asList("MacBook","iPhone","Shoes","Battery Charger","Bat");
        System.out.println("List is : "+productList);

        productList.forEach(ele -> System.out.println(ele));

        //Java Stream API :
        System.out.println("---------USING JAVA STREAM API------------");
        List<String> result = productList.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
        result.forEach(ele -> System.out.println(ele));
    }
}
