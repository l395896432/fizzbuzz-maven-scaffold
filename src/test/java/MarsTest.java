import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MarsTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
   public void should_move(){
        String area="10,10";
        Mars mars = new Mars();
        mars.land (area,"5,5,E");
        mars.move();
        String point=mars.getPoint();
        Assert.assertEquals(point,"65E");
   }
   @Test
   public void should_move_on(){
        String collection="20,25,15,22,E,M,L,M,R,R,M,R,M,M,R,M,M,M,M,L,R,M,L,M";
        Mars mars = new Mars();
        mars.collection(collection);
        String point= mars.getPoint();
       expectedException.expect(RuntimeException.class);
       expectedException.expectMessage("已超出范围，不能再继续移动");
        Assert.assertEquals(point,"55S");
   }
}
