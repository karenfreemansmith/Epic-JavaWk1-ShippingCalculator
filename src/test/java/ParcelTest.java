import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
   public void volume_calculatesVolume_int() {
     Parcel p = new Parcel();
     assertEquals(1000, p.volume(10,10,10));
   }

   @Test
    public void cost_calculatesCost_int() {
      Parcel p = new Parcel();
      assertEquals(3, p.cost(10,100));
    }

}
