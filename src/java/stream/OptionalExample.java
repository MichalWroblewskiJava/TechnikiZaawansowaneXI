package stream;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static stream.DataCollections.getLoremIpsum;

public class OptionalExample {

    public static void main(String[] args) {

        List<String> loremIpsum = getLoremIpsum();
        String firstletter = "x";
        Optional<String> startsWithN = loremIpsum.stream()
                .filter(s -> s.startsWith(firstletter))
                .findFirst();

        System.out.println(startsWithN.orElse("Brak słowa zaczynającego się na litere " + firstletter));
        startsWithN.orElseGet(() -> String.valueOf(getLoremIpsum()));

        try {
            startsWithN.orElseThrow(IllegalStateException::new);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        startsWithN.ifPresent(System.out::println);

        final Logger logger = LoggerFactory.getLogger(OptionalExample.class);
        startsWithN.ifPresentOrElse(
                v -> System.out.println("Znaleziono: " + v),
                () -> logger.warn("Nic nie ma"));
    }
}
