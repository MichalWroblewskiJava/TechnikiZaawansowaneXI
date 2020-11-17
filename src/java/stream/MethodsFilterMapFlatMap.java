package stream;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static stream.DataCollections.codePoints;
import static stream.DataCollections.getLoremIpsum;

public class MethodsFilterMapFlatMap {
    public static void main(String[] args) {

        List<String> loremIpsum = getLoremIpsum();

        loremIpsum.stream()
                .filter(w->w.length()>8)
                .sorted(Comparator.comparingInt(String::length))
                .limit(10)
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Stream<Stream<String>> streamMap = loremIpsum.stream().map(w->codePoints(w));
        streamMap.collect(Collectors.toList())
                .forEach(s -> System.out.println(s.collect(Collectors.toList())));

        List<String> streamFlatMap = loremIpsum.stream().flatMap(DataCollections::codePoints)
                .collect(Collectors.toList());
        System.out.println(streamFlatMap);

    }
}
