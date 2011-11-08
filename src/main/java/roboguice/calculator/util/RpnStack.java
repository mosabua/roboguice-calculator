package roboguice.calculator.util;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * A Stack of numbers that can be operated on.
 *
 * In addition to maintaining a stack, this class also maintains an accumulator register that
 * can be used to keep track of the digits that a user is typing up until they hit 'enter'
 * to push the accumulated digits onto the stack.
 *
 * Persists itself to shared preferences.
 *
 * Is a singleton.
 */
public class RpnStack extends Stack<BigDecimal> {

    String digitAccumulator = "";



    public String getDigitAccumulator() {
        return digitAccumulator;
    }

    public void setDigitAccumulator(String digitAccumulator) {
        this.digitAccumulator = digitAccumulator;
    }

    public void appendToDigitAccumulator(CharSequence text) {
        digitAccumulator += text;
    }

    public void pushDigitAccumulatorOnStack() {
        if( digitAccumulator.length()>0 ) {
            push(new BigDecimal(digitAccumulator));
            digitAccumulator="";
        }
    }


}


