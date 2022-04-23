package fr.uvsq.cprog.mvnjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  /**
   * Main Class.
   */
  public static void main(String[] args) {

    /*
    System.out.println();
    System.out.println("******************** HELLO **************************");
    System.out.println("* Démonstration des fonctionnalités de la classe Fraction *");
    System.out.println("*****************************************************");
    System.out.println();
    System.out.println("Creation de la fraction 1/3");
    Fraction f1 = new Fraction(1,3);

    System.out.println("Creation de la fraction -1/3");
    Fraction f2 = new Fraction(-1,3);

    System.out.println("Creation de la fraction 2/6");
    Fraction f3 = new Fraction(2,6);

    System.out.println("Creation de la fraction 2");
    Fraction f4 = new Fraction(2);

    System.out.println("Creation de la fraction -1/-3");
    Fraction f5 = new Fraction(-1,-3);

    System.out.println("**********************************************************");
    System.out.println("Conversion des fraction en chaine de caractères toString()");
    System.out.println("f1 = " + f1.toString());
    System.out.println("f2 = " + f2.toString());
    System.out.println("f3 = " + f3.toString());
    System.out.println("f4 = " + f4.toString());

    System.out.println("*********************************************************");
    System.out.println("Conversion des fraction en nombres à virgules flottantes toDouble()");
    System.out.println("f1 = " + f1 + " = " + f1.toDouble());
    System.out.println("f2 = " + f2 + " = " + f2.toDouble());
    System.out.println("f3 = " + f3 + " = " + f3.toDouble());
    System.out.println("f4 = " + f4 + " = " + f4.toDouble());

    System.out.println("**********************************************************");

    System.out.println("Addition des fraction f1 et f2");
    System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));

    System.out.println("Addition des fraction f1 et f4");
    System.out.println(f1 + " + " + f4 + " = " + f1.add(f4));

    System.out.println("Addition des fraction f1 et f3");
    System.out.println(f1 + " + " + f3 + " = " + f1.add(f3));

    System.out.println("**********************************************************");

    System.out.println("Test d'égalité entre les fractions f1 et f3:");
    System.out.println(f1 + "==" + f3 + " : " + f1.equals(f3));
    System.out.println("Test d'égalité entre les fractions f1 et f2:");
    System.out.println(f1 + "==" + f2 + " : " + f1.equals(f2));
    System.out.println("Test d'égalité entre les fractions f1 et f2:");
    System.out.println(f1 + "==" + f5 + " : " + f1.equals(f5));

    System.out.println("**********************************************************");

    System.out.println("Hash code des fraction");
    System.out.println("Hash code de f1=" + f1 + " : " + f1.hashCode());
    System.out.println("Hash code de f2=" + f2 + " : " + f2.hashCode());
    System.out.println("Hash code de f3=" + f3 + " : " + f3.hashCode());
    System.out.println("Hash code de f4=" + f4 + " : " + f4.hashCode());

    System.out.println("**********************************************************");
    System.out.println("0: pour l'égalité, -1: pour < , 1: pour >");
    System.out.println("Comparaison entre fraction f1=1/3 et f2=-1/3 :");
    System.out.println(f1.compareTo(f2));
    System.out.println("Comparaison entre fraction f1=1/3 et f4=2 :");
    System.out.println(f1.compareTo(f4));
    System.out.println("Comparaison entre fraction f1=1/3 et f3=2/6 :");
    System.out.println(f1.compareTo(f3));

    System.out.println("**********************************************************");
    */

    Logger logger = LoggerFactory.getLogger(Main.class);
    logger.info("");
    logger.info("************************ HELLO ****************************");
    logger.info("* Démonstration des fonctionnalités de la classe Fraction *");
    logger.info("***********************************************************");
    logger.info("");

    logger.info("Creation de la fraction 1/3");
    Fraction f1 = new Fraction(1,3);

    logger.info("Creation de la fraction -1/3");
    Fraction f2 = new Fraction(-1,3);

    logger.info("Creation de la fraction 2/6");
    Fraction f3 = new Fraction(2,6);

    logger.info("Creation de la fraction 2");
    Fraction f4 = new Fraction(2);

    logger.info("Creation de la fraction -1/-3");
    Fraction f5 = new Fraction(-1,-3);

    logger.info("******************************************************");
    logger.info("Conversion des fractions en chaine de caractères toString()");
    logger.info("f1 = " + f1.toString());
    logger.info("f2 = " + f2.toString());
    logger.info("f3 = " + f3.toString());
    logger.info("f4 = " + f4.toString());

    logger.info("******************************************************");
    logger.info("Conversion des fractions en nombres à virgules flottantes toDouble()");

    logger.info("f1 = " + f1 + " = " + f1.toDouble());
    logger.info("f2 = " + f2 + " = " + f2.toDouble());
    logger.info("f3 = " + f3 + " = " + f3.toDouble());
    logger.info("f4 = " + f4 + " = " + f4.toDouble());

    logger.info("******************************************************");
    logger.info("Addition des fractions f1 et f2");
    logger.info(f1 + " + " + f2 + " = " + f1.add(f2));

    logger.info("Addition des fractions f1 et f4");
    logger.info(f1 + " + " + f4 + " = " + f1.add(f4));

    logger.info("Addition des fractions f1 et f3");
    logger.info(f1 + " + " + f3 + " = " + f1.add(f3));

    logger.info("******************************************************");
    logger.info("Test d'égalité entre les fractions f1 et f3:");
    logger.info(f1 + " == " + f3 + " : " + f1.equals(f3));
    logger.info("Test d'égalité entre les fractions f1 et f2:");
    logger.info(f1 + " == " + f2 + " : " + f1.equals(f2));
    logger.info("Test d'égalité entre les fractions f1 et f5:");
    logger.info(f1 + " == " + f5 + " : " + f1.equals(f5));

    logger.info("******************************************************");

    logger.info("Hash code des fractions");
    logger.info("Hash code de f1 = " + f1 + " : " + f1.hashCode());
    logger.info("Hash code de f2 = " + f2 + " : " + f2.hashCode());
    logger.info("Hash code de f3 = " + f3 + " : " + f3.hashCode());
    logger.info("Hash code de f4 = " + f4 + " : " + f4.hashCode());

    logger.info("******************************************************");
    logger.info("0: pour l'égalité, -1: pour < , 1: pour >");
    logger.info("Comparaison entre la fraction f1 = 1/3 et f2 = -1/3 :");
    logger.info(f1.compareTo(f2) + "");
    logger.info("Comparaison entre la fraction f1 = 1/3 et f4 = 2 :");
    logger.info(f1.compareTo(f4) + "");
    logger.info("Comparaison entre la fraction f1 = 1/3 et f3 = 2/6 :");
    logger.info(f1.compareTo(f3) + "");

    logger.info("******************************************************");
  }
}