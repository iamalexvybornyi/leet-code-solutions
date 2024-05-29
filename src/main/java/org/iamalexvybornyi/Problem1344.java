package org.iamalexvybornyi;

/**
 * Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
 * <p>
 * Answers within 10-5 of the actual value will be accepted as correct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: hour = 12, minutes = 30
 * Output: 165
 * Example 2:
 * <p>
 * <p>
 * Input: hour = 3, minutes = 30
 * Output: 75
 * Example 3:
 * <p>
 * <p>
 * Input: hour = 3, minutes = 15
 * Output: 7.5
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= hour <= 12
 * 0 <= minutes <= 59
 */
public class Problem1344 {

    /*

    30 degrees for an hour hand = 360 degrees for a minute hand ->
        -> 1 degree for an hour hand = 12 degrees for a minute hand

    1 minute = 6 degrees (minute hand)

    30 minutes = 180 degrees for a minute hand and 15 degrees for an hour hand

    1) multiply an hour hand value by 30 to get the initial value (12 will just be 0)
    2) multiply a minute hand value by 6 to get the angle for a minute hand
    3) divide a minute hand value in degrees by 12 to get the hour hand additional value
    4) calculate the angle between the hands by subtracting the hour hand value from the minute hand value and take
        the absolute value
    5) subtract the value from step 4 from 360, compare to the value from step 4 and choose the min out of these two

     */

    public double angleClock(int hour, int minutes) {
        int hourHandInitialValue = hour == 12 ? 0 : hour * 30;
        int minuteHandValue = minutes * 6;
        double hourHandAdditionalValue = (double) minuteHandValue / 12;
        double hourHandValue = hourHandInitialValue + hourHandAdditionalValue;
        double angle = Math.abs(minuteHandValue - hourHandValue);
        return Math.min(angle, 360 - angle);
    }

}
