package TestNG3;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    public void test1()
    {

        System.out.println("test1 was tested successfully");
    }

    @Test(priority = 2)
    public void test2()
    {

        System.out.println("test2 was tested successfully");
    }
    @Test
    public void test3()//if any priority is not assigned,it has a value of priority 0 so, it starts first.
    {

        System.out.println("test3 was tested successfully");
    }
    @Test(priority = 3)//priority değeri küçük olan önce çalısır.
    public void test4()
    {

        System.out.println("test4 was tested successfully");
    }

    @Test(enabled = false)//bu şekilde enabled=false ataması yaparsak bu test çalıştırılmaz ve pas geçer.
    public void test5()
    {
        System.out.println("test 5 was tested");
    }


    @Test(priority = 3)
    public void test6()
    {

        System.out.println("test6 was tested successfully");
    }


}
