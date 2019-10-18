package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface PeopleTest {
    @BeforeAll
    default void beforeAll(){
        System.out.println("This is the before all in the interface");
    }

}
