import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void wasSetMaxParameterInConstr() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void ConstrWithSetSize() {
        Radio radio = new Radio(20);

        int expected = 5;
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(19, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberInSetSize() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(radio.getMinStation() + 15);

        int expected = radio.getMinStation() + 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStationUnderMinStationWithSetSize() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(radio.getMinStation() - 1);

        Assertions.assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }


    @Test
    public void shouldSetMinStationWithSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation() + 1);
        radio.setCurrentStation(radio.getMinStation());

        radio.setCurrentStation(-1);
        Assertions.assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationUnderMaxStationWithSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 1);

        Assertions.assertEquals(radio.getMaxStation(), radio.setCurrentStation(radio.getMaxStation()));

    }

    @Test
    public void shouldSetNumberAboveMinStationWithSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation() + 1);

        Assertions.assertEquals(radio.getMinStation() + 1, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMaxStationWithSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 1);  // установка предпоследнего номера радиостанции в установлен.размере кол-ва станций

        Assertions.assertEquals(radio.getMaxStation() - 1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationWithSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 2);

        Assertions.assertEquals(radio.getMaxStation(), radio.setCurrentStation(radio.getMaxStation()));
    }

    @Test
    public void shouldNotSetStationAboveSetSize() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() + 1);

        Assertions.assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }


    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test15() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test16() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test17() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        radio.setCurrentVolume(radio.getMinVolume() + 20);


        int expected = radio.getMinVolume() + 20;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        radio.setCurrentVolume(radio.getMinVolume() - 1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        radio.setCurrentVolume(radio.getMinVolume() + 1);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMinVolume() + 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setCurrentVolume(radio.getMaxVolume() - 1);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMaxVolume() - 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.setCurrentVolume(radio.getMaxVolume() - 2);
        radio.setCurrentVolume(radio.getMaxVolume());

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeToMaxIfExceeds() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFirstVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setCurrentVolume(radio.getMinVolume() + 1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMinVolume() + 2, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(radio.getMinVolume() + 2);
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setCurrentVolume(radio.getMinVolume() + 1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMaxVolume() - 2, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(radio.getMaxVolume() - 1, radio.getCurrentVolume());
    }

    @Test
    public void test18() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test19() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test20() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test21() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test22() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test23() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test24() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.up();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test25() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.up();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test26() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.up();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test27() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.up();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test28() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.up();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test29() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.down();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test30() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.down();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test31() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.down();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test32() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.down();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test33() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.down();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}



