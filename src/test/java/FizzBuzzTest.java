import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
     public void sould_Void_Fizz_by3(){
      int number =3;
      String result=FizzBuzz.to(number);
      Assert.assertEquals("Fizz",result);
  }
    @Test
     public void sould_Void_Fizz_by5(){
      int number =5;
      String result=FizzBuzz.to(number);
      Assert.assertEquals("Buzz",result);
  }
  @Test
  public void sould_Void_Fizz_by15(){
      int number =15;
      String result=FizzBuzz.to(number);
      Assert.assertEquals("FizzBuzz",result);
  }
}
