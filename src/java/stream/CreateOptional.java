package stream;

import java.util.Optional;

public class CreateOptional {

    public static void main(String[] args) {
        System.out.println(inverse(4.0));
        System.out.println(inverse(0.0));

    }
    public static Optional<Double> inverse(Double x){
        return x==0 ? Optional.empty() : Optional.of(1/x);
    }
}
