package fr.uvsq.cprog.mvnjunit;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    @Test
    public void FractionTest(){

        // Testing the first constructor
        // The d = 0 case
        Assert.assertThrows(IllegalArgumentException.class, ()-> new Fraction(1,0));

        Fraction f = new Fraction(1,2);
        Fraction testFraction = new Fraction(1,2);
        Assert.assertEquals(testFraction.getNominateur(), f.getNominateur());
        Assert.assertEquals(testFraction.getDenominateur(), f.getDenominateur());

        f = new Fraction(-1,2);
        testFraction = new Fraction(-1,2);
        Assert.assertEquals(testFraction.getNominateur(), f.getNominateur());
        Assert.assertEquals(testFraction.getDenominateur(), f.getDenominateur());

        // Testing the second constructor
        f = new Fraction(2);
        testFraction = new Fraction(2,1);
        Assert.assertEquals(testFraction.getNominateur(), f.getNominateur());
        Assert.assertEquals(testFraction.getDenominateur(), f.getDenominateur());

        // Testing the third constructor
        f = new Fraction();
        testFraction = new Fraction(0,1);
        Assert.assertEquals(testFraction.getNominateur(), f.getNominateur());
        Assert.assertEquals(testFraction.getDenominateur(), f.getDenominateur());

        f = new Fraction();
        testFraction = new Fraction(0);
        Assert.assertEquals(testFraction.getNominateur(), f.getNominateur());
        Assert.assertEquals(testFraction.getDenominateur(), f.getDenominateur());
    }

    @Test
    public void toStringTest(){

        Fraction f = new Fraction(1,2);
        String fString = f.toString();
        String fStringTest = "1/2";
        Assert.assertEquals(fStringTest, fString);
    }

    @Test
    public void toDoubleTest(){

        Fraction f = new Fraction(1,3);
        Double fToDouble = f.toDouble();
        Assert.assertTrue((double)1/3==fToDouble);

        f = new Fraction(1,2);
        fToDouble = f.toDouble();
        Assert.assertTrue(0.5==fToDouble);

        f = new Fraction(-1,2);
        fToDouble = f.toDouble();
        Assert.assertTrue(-0.5==fToDouble);

        f = new Fraction(1,-2);
        fToDouble = f.toDouble();
        Assert.assertTrue(-0.5==fToDouble);

        f = new Fraction(-1,-2);
        fToDouble = f.toDouble();
        Assert.assertTrue(0.5==fToDouble);

        f = new Fraction(2,1);
        fToDouble = f.toDouble();
        Assert.assertTrue(2.0==fToDouble);
    }

    @Test public void pgcdTest(){

        int pgcd = Fraction.pgcd(10,20);
        Assert.assertEquals(pgcd,10);

        pgcd = Fraction.pgcd(2,3);
        Assert.assertEquals(pgcd, 1);

        pgcd = Fraction.pgcd(1,0);
        Assert.assertEquals(pgcd, 1);

        pgcd = Fraction.pgcd(0, 0);
        Assert.assertEquals(pgcd, 1);

        pgcd = Fraction.pgcd(5, 7);
        Assert.assertEquals(pgcd, 1);

        pgcd = Fraction.pgcd(320, 180);
        Assert.assertEquals(pgcd, 20);
    }

    @Test
    public void hashCodeTest(){
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,2);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(1,2);
        f2 = new Fraction(2,4);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(1,2);
        f2 = new Fraction(-1,-2);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(1,2);
        f2 = new Fraction(2,3);
        Assert.assertNotEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(1,2);
        f2 = new Fraction(-1,2);
        Assert.assertNotEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(0);
        f2 = Fraction.ZERO;
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

        f1 = new Fraction(1);
        f2 = Fraction.UN;
        Assert.assertEquals(f1.hashCode(), f2.hashCode());

    }

    @Test
    public void equalsTest(){

        // ASSERT EQUALS
        Fraction f = new Fraction(1,2);
        Assert.assertEquals(f,f);

        Fraction f1 = new Fraction(1,2);
        Assert.assertEquals(f,f1);

        f = new  Fraction (1);
        f1 = new Fraction(1,1);
        Assert.assertEquals(f, f1);

        f = new Fraction();
        f1 = new Fraction(0,1);
        Assert.assertEquals(f, f1);

        f = new Fraction(-1,2);
        f1 = new Fraction(-1,2);
        Assert.assertEquals(f, f1);

        f = new Fraction(-1,2);
        f1 = new Fraction(1,-2);
        Assert.assertEquals(f, f1);

        f = new Fraction(2,2);
        f1 = new Fraction(3,3);
        Assert.assertEquals(f, f1);

        f = new Fraction(-2,-2);
        f1 = new Fraction(-3,-3);
        Assert.assertEquals(f, f1);

        f = new Fraction(-2,2);
        f1 = new Fraction(-3,3);
        Assert.assertEquals(f, f1);

        f = new Fraction(-2,2);
        f1 = new Fraction(3,-3);
        Assert.assertEquals(f, f1);

        f = new Fraction(2,2);
        Assert.assertEquals(Fraction.UN, f);

        f = new Fraction(-2,-2);
        Assert.assertEquals(Fraction.UN, f);

        f = new Fraction(-2,2);
        f1 = new Fraction(-1,1);
        Assert.assertEquals(f1, f);

        f = new Fraction(0,1);
        Assert.assertEquals(Fraction.ZERO, f);

        f = new Fraction(0,2);
        Assert.assertEquals(Fraction.ZERO, f);

        f = new Fraction(-1,-1);
        Assert.assertEquals(Fraction.UN, f);

        f = new Fraction(-2,-2);
        Assert.assertEquals(Fraction.UN, f);

        f = new Fraction(1,2);
        f1 = new Fraction(-1,-2);
        Assert.assertEquals(f1, f);

        f = new Fraction(-3,2);
        f1 = new Fraction(3,-2);
        Assert.assertEquals(f1, f);

        // ASSERT NOT EQUALS
        f = new Fraction(1,2);
        f1 = new Fraction(-1,2);
        Assert.assertNotEquals(f,f1);

        f = new Fraction(-1,-2);
        f1 = new Fraction(-1,2);
        Assert.assertNotEquals(f,f1);

        f = new Fraction(1,2);
        f1 = new Fraction(2,1);
        Assert.assertNotEquals(f,f1);

        f = new Fraction(-1,-2);
        f1 = new Fraction(-2,-1);
        Assert.assertNotEquals(f,f1);

    }

    @Test
    public void addTest(){

        Fraction f = new Fraction(1,2);
        Fraction f1 = new Fraction(1,2);
        Fraction expected = new Fraction(1,1);
        Fraction result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(1,2);
        f1 = new Fraction(1,2);
        result = f.add(f1);
        Assert.assertEquals(Fraction.UN, result);

        f = new Fraction(1,2);
        f1 = new Fraction(-1,2);
        expected = new Fraction(0,1);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(1,2);
        f1 = new Fraction(-1,2);
        result = f.add(f1);
        Assert.assertEquals(Fraction.ZERO, result);

        f = new Fraction(-1,2);
        f1 = new Fraction(-1,2);
        expected = new Fraction(-1,1);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(2,3);
        f1 = new Fraction(3,2);
        expected = new Fraction(13,6);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(1,2);
        f1 = new Fraction(-1,-2);
        expected = new Fraction(1,1);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(5,2);
        f1 = new Fraction(-5,-2);
        expected = new Fraction(5);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        expected = Fraction.UN;
        result = Fraction.UN.add(Fraction.ZERO);
        Assert.assertEquals(expected, result);

        f = new Fraction(-5,-5);
        expected = new Fraction(2);
        result = f.add(Fraction.UN);
        Assert.assertEquals(expected, result);

        f = new Fraction(5,2);
        f1 = new Fraction(2,5);
        expected = new Fraction(29,10);
        result = f.add(f1);
        Assert.assertEquals(expected, result);

        f = new Fraction(2,5);
        f1 = new Fraction(-5,2);
        expected = new Fraction(-21,10);
        result = f.add(f1);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void compareToTest(){

        Fraction f = new Fraction(1,2);
        Fraction f1 = new Fraction(3);
        Assert.assertEquals(-1, f.compareTo(f1));

        f = new Fraction(1,2);
        f1 = new Fraction(2,1);
        Assert.assertEquals(-1, f.compareTo(f1));

        f = new Fraction(-2,1);
        f1 = new Fraction(1,2);
        Assert.assertEquals(-1, f.compareTo(f1));

        f = new Fraction(-2,1);
        f1 = new Fraction(-1,2);
        Assert.assertEquals(-1, f.compareTo(f1));

        f = new Fraction(2,1);
        f1 = new Fraction(1,2);
        Assert.assertEquals(1, f.compareTo(f1));

        f = new Fraction(1,2);
        f1 = new Fraction(-2,1);
        Assert.assertEquals(1, f.compareTo(f1));

        f = new Fraction(-1,2);
        f1 = new Fraction(-2,1);
        Assert.assertEquals(1, f.compareTo(f1));

        f = new Fraction(2,2);
        f1 = new Fraction(2,2);
        Assert.assertEquals(0, f.compareTo(f1));

        f = new Fraction(2,2);
        f1 = new Fraction(-1,-1);
        Assert.assertEquals(0, f.compareTo(f1));

        f = new Fraction(-5,3);
        Assert.assertEquals(1, Fraction.ZERO.compareTo(f));

        f = new Fraction(-6,-5);
        Assert.assertEquals(-1, Fraction.UN.compareTo(f));
    }
}
