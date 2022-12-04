package TestNG1;

import org.testng.annotations.Test;

public class SecondTestNG {

    @Test
    public void test1()
    {
        System.out.println("test1 was tested successfully");
    }

    @Test
    public void test2()
    {
        System.out.println("test2 was tested successfully");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 was tested successfully");
    }
    @Test
    public void test4()
    {
        System.out.println("test4 was tested successfully");
    }

//include methodu sadece include içine yazilanı çalıstırıp test eder fakat exclude methodu yazılanın haricindekileri test
    //eder ve raporlar.
}
