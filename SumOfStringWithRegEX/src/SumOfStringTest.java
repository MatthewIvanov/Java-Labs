import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfStringTest {

    @Test
    void Test1getSumOfNumbers() {
        String line ="mama 10 papa 14";
        assertEquals(24,SumOfString.GetSumOfNumbers(line));
    }

    @Test
    void Test1getSumOfNumbersRegEx() {
        String line ="mama 10 papa 14";
        assertEquals(24,SumOfString.GetSumOfNumbersRegEx(line));
    }
    @Test
    void Test2getSumOfNumbers() {
        String line = "@#$ 4, 4 /< 10 ^^^";
        assertEquals(18,SumOfString.GetSumOfNumbers(line));
    }

    @Test
    void Test2getSumOfNumbersRegEx() {
        String line = "@#$ 4.5 ,4  /< 10  ^^^";
        assertEquals(18.5,SumOfString.GetSumOfNumbersRegEx(line));
    }


    @Test
    void TestIsEqual(){
        String line = "@#$ 4,4/<10^^^";
        boolean bool = false;
        if(SumOfString.GetSumOfNumbers(line)  ==  SumOfString.GetSumOfNumbersRegEx(line)){bool = true;};
        assertEquals(true,bool);
    }


}