package Ravikumar.Sujatha.InitializationLab1;

/**
 * Created by sujatharavikumar on 9/10/16.
 */


public class InitializationLab1 {
    public static void main(String args[]){


        /*BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();*/

        BoringThing[] boringArray = new BoringThing[5];
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.GREEN);
        //ColorfulThing wrongThing = new ColorfulThing();  /* Error */

        System.out.println(colorfulThing1.getColor());
        System.out.println(colorfulThing2.getColor());
        System.out.println(colorfulThing3.getColor());
        System.out.println(colorfulThing4.getColor());
        System.out.println(colorfulThing5.getColor());

    }


}
