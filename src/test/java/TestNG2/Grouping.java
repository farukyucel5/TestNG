package TestNG2;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Group A"})
    public void test1()
    {

        System.out.println("test1 was tested successfully");
    }

    @Test(groups = {"Group B"})
    public void test2()
    {

        System.out.println("test2 was tested successfully");
    }
    @Test(groups = {"Group A","Group B"})
    public void test3()
    {

        System.out.println("test3 was tested successfully");
    }
    @Test(groups = "Group C")
    public void test4()
    {

        System.out.println("test4 was tested successfully");
    }
}
