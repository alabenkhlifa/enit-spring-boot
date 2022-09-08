package tn.ensit.spring.car.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.util.Pair;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    public void sizeOf_should_return_the_size_of_a_list() {
        //arrange
        ICarService service = new CarService();
        var list = List.of(1,2,3,4,5);
        //act
        Integer result = service.sizeOf(list);
        //assert
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    public void contains_should_return_true_if_list_contains_number() {
        //arrange
        var list = List.of(1,2,3,4,5);
        var pair1 = Pair.of(3, true);
        var pair2 = Pair.of(6, false);
        var testList = List.of(pair1, pair2);
        ICarService service = new CarService();
        testList.forEach(pair -> {
            //act
            Boolean result = service.contains(list, pair.getFirst());
            //assert
            Assertions.assertThat(result).isEqualTo(pair.getSecond());
        });
    }

}