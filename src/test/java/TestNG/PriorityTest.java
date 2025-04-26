package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    public void testLogin(){
        System.out.println("Login");
        Assert.assertEquals("1", "1");

    }
    @Test(priority = 2)
    public void testCreate(){
        System.out.println("Create");
    }
    @Test(priority = 3, enabled = false)
    public void testEdit(){
        System.out.println("Edit");
    }
    @Test(priority = 4)
    public void testDelete(){
        System.out.println("Delete");
    }
    @Test(priority = 5)
    public void testLogout(){
        System.out.println("Logout");
    }

}
