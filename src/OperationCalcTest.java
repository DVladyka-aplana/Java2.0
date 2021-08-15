import static org.junit.jupiter.api.Assertions.*;
//Задание №8
//
//Покрыть Unit тестами последний проект с калькулятором
class OperationCalcTest {
    @org.junit.jupiter.api.Test
    void getAnswPlus() {
        OperationCalc plus = new OperationCalc(5,10);
        assertEquals(15,plus.getAnswPlus());
    }

    @org.junit.jupiter.api.Test
    void getAnswMinus() {
        OperationCalc minus = new OperationCalc(1,7);
        assertEquals(-6,minus.getAnswMinus());
    }

    @org.junit.jupiter.api.Test
    void getAnswUm() {
        OperationCalc um = new OperationCalc(2,3);
        assertEquals(6,um.getAnswUm());
    }

    @org.junit.jupiter.api.Test
    void getAnswDel() {
        OperationCalc del = new OperationCalc(9,3);
        assertEquals(3,del.getAnswDel());
    }
}