public class MathLibrary {
    public static void main(String[] args) {
        System.out.println(Math.class); //will print name of class
        System.out.println(Math.E); //will print the value of exponential constants
        System.out.println(Math.PI); //will print value of PI
        System.out.println(Math.abs(-15)); //will print absolute value of number
        System.out.println(Math.acos(0.234)); //It is an inverse cosine function and will return the angle in radian. Values[-1,1]
        System.out.println(Math.asin(0.234)); //It is an inverse sine function and will return the angle in radian. Values[-1,1]
        System.out.println(Math.acos(0.234)); //It is an inverse tangent function and will return the angle in radian. Values[-infinity,infinity]
        System.out.println(Math.addExact(5, 8)); //will return exact addition of two numbers
        System.out.println(Math.subtractExact(7, 9)); //will return exact subtraction of two numbers
        System.out.println(Math.cbrt(27)); //Will print cube root
        System.out.println(Math.ceil(3.1)); //Will return value by rounding off to top
        System.out.println(Math.floor(3.1)); //Will return value by rounding off to bottom
        System.out.println(Math.floorDiv(5, 2)); //Will return value by dividing first and second number and rounding off the result to bottom
        System.out.println(Math.floorDiv(3, 2)); //Will return floor value of remainder of division of first and second number
        System.out.println(Math.copySign(3, -5)); //will put the positive/negative sign from right number to left
        System.out.println(Math.cos(1)); //return cosine value for the angle in radians
        System.out.println(Math.sin(1)); //return sine value for the angle in radians
        System.out.println(Math.tan(1)); //return tan value for the angle in radians
        System.out.println(Math.cosh(1)); //return hyperbolic cosine value for the angle in radians
        System.out.println(Math.sinh(1)); //return hyperbolic sine value for the angle in radians
        System.out.println(Math.tanh(1)); //return hyperbolic tan value for the angle in radians
        System.out.println(Math.decrementExact(3)); //return the value after decrementing it by 1
        System.out.println(Math.incrementExact(3)); //return the value after incrementing it by 1
        System.out.println(Math.exp(2)); //return value of (exponential constant)^n
        System.out.println(Math.expm1(2)); //return value of ((exponential constant)^n - 1)
        System.out.println(Math.getExponent(64)); //will return unbiased exponent of given number
        System.out.println(Math.hypot(3, 4)); //will return hypotanuse value of given numbers
        System.out.println(Math.IEEEremainder(3.9, 2.8)); //will return remainder of division of float numbers
        System.out.println(Math.log(1)); //will return log value of numbers
        System.out.println(Math.log10(10)); //will return value of log base 10
        System.out.println(Math.max(5, 3)); //will return maximum of two numbers
        System.out.println(Math.min(5, 3)); //will return minimum of two numbers
        System.out.println(Math.multiplyExact(5, 3)); //will return exact multiplication of numbers
        System.out.println(Math.negateExact(43)); //will turn the number negative
        System.out.println(Math.nextAfter(5.435633, 2)); //returns the floating-point number adjacent to the first argument in the direction of the second argument.
        System.out.println(Math.nextDown(44)); //will return floating point value adjacent to f in the direction of negative infinity.
        System.out.println(Math.nextUp(44)); //will return floating point value adjacent to f in the direction of positive infinity.\
        System.out.println(Math.pow(3,4)); //return exponents a^b
        System.out.println(Math.random()); //return random number between 0 and 1
        System.out.println(Math.rint(4.2)); //will return closest integer value
        System.out.println(Math.round(7.7)); //will return closest integer value
        System.out.println(Math.scalb(3, 4)); //will return a*(2^b)
        System.out.println(Math.signum(5)); //will return 1 for positive number, -1 for negative number and 0 for 0 (Signum function)
        System.out.println(Math.sqrt(9)); //will returm square root
        System.out.println(Math.toDegrees(3.141592653589793)); //will return value after converting angle in radian to degree
        System.out.println(Math.toRadians(180)); //will convert angle in degree to radians
        System.out.println(Math.toIntExact(5L)); //will convert long to integer
        System.out.println(Math.ulp(6.4444)); //Returns the size of an ulp of the argument.
    }
}
