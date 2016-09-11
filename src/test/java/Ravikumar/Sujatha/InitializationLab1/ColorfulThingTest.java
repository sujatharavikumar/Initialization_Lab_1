package Ravikumar.Sujatha.InitializationLab1;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class ColorfulThingTest {

    @Test
    public void getColorTest(){

        //Blue color is set using the constructor
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.BLUE);

        //Expected output
        ColorfulThing.Color expectedColor = ColorfulThing.Color.BLUE;

        //Actual color returned from the getColor() method
        ColorfulThing.Color actualColor = colorfulThing.getColor();

        Assert.assertEquals("Both the values should be BLUE", expectedColor, actualColor);
    }
}
