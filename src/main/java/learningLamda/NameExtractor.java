package learningLamda;

import learningLamda.pojo.Person;

public interface NameExtractor<T extends Person> {
    String getName(T type);


}
