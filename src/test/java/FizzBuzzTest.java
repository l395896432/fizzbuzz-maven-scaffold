import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
     public void sould_Void_Fizz_by3(){
      int number =3;
      String result=FizzBuzz.to(number);
      Assert.assertEquals("Fizz",result);
  }
}
