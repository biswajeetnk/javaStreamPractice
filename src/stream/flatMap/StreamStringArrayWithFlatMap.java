package stream.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayWithFlatMap
{
    public static void main(String[] args)
    {
        String data[][] = new String[][]{
                {"a","b"},
                {"c","d"},
                {"e","f"}};

        //now if I want to write it as :
        //data.stream();
        //cannot write coz its nt a collection, its a static array. - limitation

        //so we have to use Arrays class
        Stream<String[]> dataStream = Arrays.stream(data); //it returns String array

        //since below System.out.println() doesnt print any elements hence we need use flatMap :
        Stream<String> streamFlatMap = dataStream.flatMap(ele -> Arrays.stream(ele)); //now this will print output as "a"

        Stream<String> dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));

        dataStreamFilter.forEach(System.out::println);// nothing is printed, blank output coz we cannot directly apply Stream to Stream<String[]>

        //composite actions AND above one is inidividual actions for flatMap
        Stream<String> finalStream =
                Arrays.stream(data)
                        .flatMap(ele -> Arrays.stream(ele))
                        .filter(ele -> "c".equals(ele.toString()));

                finalStream.forEach(System.out::println);


    }
}
