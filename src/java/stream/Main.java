package stream;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static stream.CreatingStream.show;

public class Main {
    public static void main(String[] args) {


        Iterable<Path> iterable = FileSystems.getDefault().getRootDirectories();
        Stream<Path> rootDirectories = StreamSupport.stream(iterable.spliterator(), false);
        show("rootDirectories", rootDirectories);

        Iterator<Path> iterator = Paths.get("/src/java/stream").iterator();
        Stream<Path> pathComponents = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
        show("pathComponents", pathComponents);

        List<String> loremIpsum = DataCollections.getLoremIpsum();

        Stream<Stream<String>> stream = loremIpsum.stream().map(DataCollections::codePoints);

        stream.collect(Collectors.toList())
                .forEach(s -> System.out.println(s.collect(Collectors.toList())));


//        List<Stream<String>> collect = stream.collect(Collectors.toList());
//                for (Stream result:collect) {
//            System.out.println(result.collect(Collectors.toList()));
//        }

        List<String> stream1 = loremIpsum.stream().flatMap(DataCollections::codePoints)
                .collect(Collectors.toList());
        System.out.println(stream1);

    }
}
