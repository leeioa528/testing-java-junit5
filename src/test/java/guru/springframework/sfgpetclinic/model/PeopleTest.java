package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class PeopleTest  implements guru.springframework.sfgpetclinic.PeopleTest {

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}" )
    @DisplayName("This is Lee Test")
    void myRepeatedTest() {
        //todo - impl
    }
}
