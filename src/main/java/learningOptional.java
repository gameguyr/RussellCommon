import java.util.Optional;

public class learningOptional {
    public static void main(String[] args) {
        new learningOptional().doStuff();
    }

    private void doStuff() {
        Optional<String> optional1;
        Optional<String> optional2 = Optional.of("some value");

        String myString = "foo";

        ///

        optional1 = Optional.ofNullable(myString);

        String optionalStr = optional1.or(() -> {
            Optional<String> strOpt = Optional.of("from lambda");
            return strOpt;
        }).get();
        String optionalStr2 = optional1.orElseGet(()->"alternate value");

        System.out.println(optionalStr);

    }

    private Optional<String> optionalMethod(String param) {

        Optional<String> retVal;

        if ("foo".equals(param)) {
            retVal = Optional.empty();
        } else {
            retVal = Optional.of(param);
        }

        return retVal;
    }

}