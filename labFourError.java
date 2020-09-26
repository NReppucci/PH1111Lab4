/**
 * Author: Nate Reppucci
 * PH1111 Lab 4 Error Propagation
 */
public class labFourError
{
    public static void main(String[] args)
    {
        // Initializes all variables needed for program as double type
        double slowestVelocityInit, slowestVelocityFinal, slowestVelocityStDevFinal, slowestVelocityStDevInit, slowerVelocityInit, slowerVelocityFinal, slowerVelocityStDevFinal, slowerVelocityStDevInit, slowVelocityInit, slowVelocityFinal, slowVelocityStDevFinal, slowVelocityStDevInit;
        double slowestMomentum, slowestMomentumFinal, slowestMomentumInit, slowerMomentum, slowerMomentumFinal, slowerMomentumInit, slowMomentum, slowMomentumFinal, slowMomentumInit;
        double massCart, massUncertainty, slowestUncertainty, slowestUncertaintyFinal, slowestUncertaintyInit, slowerUncertainty, slowerUncertaintyFinal, slowerUncertaintyInit, slowUncertainty, slowUncertaintyFinal, slowUncertaintyInit;

        // Measured data from mass of cart
        massCart = (499.5/1000); // gram to kilogram conversion
        massUncertainty = (0.01/1000); // gram to kilogram conversion

        // Data from LoggerPro for slowest run
        slowestVelocityInit = 0.2940; // m/s 
        slowestVelocityFinal = -0.2381; // m/s
        slowestVelocityStDevFinal = 0.02615; // m/s 
        slowestVelocityStDevInit = 0.01008; // m/s

         // Data from LoggerPro for slower run
        slowerVelocityInit = 0.5976; // m/s
        slowerVelocityFinal = -0.5542; // m/s
        slowerVelocityStDevFinal = 0.02277; // m/s
        slowerVelocityStDevInit = 0.01274; // m/s

         // Data from LoggerPro for slow run
        slowVelocityInit = 0.8341; // m/s
        slowVelocityFinal = -0.7877; // m/s
        slowVelocityStDevFinal = 0.02306; // m/s
        slowVelocityStDevInit = 0.01518; // m/s

        /**Calculates momentum and uncertainty for slowest run with a mix of the multiplication/division and addition/subtraction rules
         * for working with values with uncertainties.
         */
        slowestMomentumFinal = (massCart*slowestVelocityFinal);
        slowestMomentumInit = (massCart*slowestVelocityInit);
        slowestUncertaintyFinal = (( (massUncertainty/massCart) + (slowestVelocityStDevFinal/slowestVelocityFinal) ) * slowestMomentumFinal);
        slowestUncertaintyInit = (( (massUncertainty/massCart) + (slowestVelocityStDevInit/slowestVelocityInit) ) * slowestMomentumInit);
        slowestMomentum = (slowestMomentumFinal - slowestMomentumInit);
        slowestUncertainty = (slowestUncertaintyFinal + slowestUncertaintyInit);
        
        // Result is printed
        System.out.println("The impulse for the slowest collision is: " + slowestMomentum + " kg*m/s" + "\n The uncertainty is: ±" + slowestUncertainty + " kg*m/s \n" );

        /**Calculates momentum and uncertainty for slower run with a mix of the multiplication/division and addition/subtraction rules
         * for working with values with uncertainties.
         */
        slowerMomentumFinal = (massCart*slowerVelocityFinal);
        slowerMomentumInit = (massCart*slowerVelocityInit);
        slowerUncertaintyFinal = (( (massUncertainty/massCart) + (slowerVelocityStDevFinal/slowerVelocityFinal) ) * slowerMomentumFinal);
        slowerUncertaintyInit = (( (massUncertainty/massCart) + (slowerVelocityStDevInit/slowerVelocityInit) ) * slowerMomentumInit);
        slowerMomentum = (slowerMomentumFinal - slowerMomentumInit);
        slowerUncertainty = (slowerUncertaintyFinal + slowerUncertaintyInit);

        // Result is printed
        System.out.println("The impulse for the slower collision is: " + slowerMomentum + " kg*m/s" +  "\n The uncertainty is: ±" + slowerUncertainty + " kg*m/s \n" );

        /**Calculates momentum and uncertainty for slow run with a mix of the multiplication/division and addition/subtraction rules
         * for working with values with uncertainties.
         */
        slowMomentumFinal = (massCart*slowVelocityFinal);
        slowMomentumInit = (massCart*slowVelocityInit);
        slowUncertaintyFinal = (( (massUncertainty/massCart) + (slowVelocityStDevFinal/slowVelocityFinal) ) * slowMomentumFinal);
        slowUncertaintyInit = (( (massUncertainty/massCart) + (slowVelocityStDevInit/slowVelocityInit) ) * slowMomentumInit);
        slowMomentum = (slowMomentumFinal - slowMomentumInit);
        slowUncertainty = (slowUncertaintyFinal + slowUncertaintyInit);

        // Result is printed
        System.out.println("The impulse for the slow collision is: " + slowMomentum + " kg*m/s" + "\n The uncertainty is: ±" + slowUncertainty + " kg*m/s");

    }
}
