package MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    @Test
    void moveZeroesSuccess() {

    MoveZeroes exercicio = new MoveZeroes();

    int[] imput = {0,1,0,2,3,4};
    int[] esperado = {1,2,3,4,0,0};

    exercicio.moveZeroes(imput);

    assertArrayEquals(esperado, imput);

    }
}