public class LightSpeed {
    public static void main(String[] args) {
        int lightSpeed;
        long days, seconds, distance;

        lightSpeed = 186000; // Approximate speed of light.
        days = 1000; // adjust the number of days.

        seconds = days * 24 * 60 * 60; // Time in seconds.
        distance = lightSpeed * seconds; // Compute distance

        System.out.println("In " + days + " days light will travel about " + distance + " miles." );
    }
}
