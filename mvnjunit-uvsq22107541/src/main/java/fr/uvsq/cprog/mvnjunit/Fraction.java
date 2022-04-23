package fr.uvsq.cprog.mvnjunit;


import java.util.Objects;

public final class Fraction {
  private final int nominateur;
  private final int denominateur;

  public static final Fraction ZERO = new Fraction();
  public static final Fraction UN = new Fraction(1);

  /**
   * Constructor.
   */
  public Fraction(int nominateur, int denominateur) {
    if (denominateur == 0) {
      throw new IllegalArgumentException("Denominator should never be zero");
    }
    if (denominateur < 0) {
      nominateur = nominateur * -1;
      denominateur = denominateur * -1;
    }

    this.nominateur = nominateur;
    this.denominateur = denominateur;
  }

  public Fraction(int nominateur) {
    this.nominateur = nominateur;
    this.denominateur = 1;
  }

  public Fraction() {
    this.nominateur = 0;
    this.denominateur = 1;
  }

  public int getNominateur() {
    return nominateur;
  }

  public int getDenominateur() {
    return denominateur;
  }

  @Override
  public String toString() {
    return nominateur + "/" + denominateur;
  }

  public double toDouble() {
    return nominateur / (double) denominateur;
  }

  /**
   * Calculate pgcd.
   */
  public static int pgcd(int frac1, int frac2) {
    int pgcd = 1;
    int inter;
    for (inter = 1; inter <= frac1 || inter <= frac2; inter++) {
      if (frac1 % inter == 0 && frac2 % inter == 0) {
        pgcd = inter;
      }
    }
    return pgcd;
  }

  /**
   * Adding 2 Fractions Method.
   */
  public Fraction add(Fraction frac) {
    Fraction frac1 = new Fraction(
        (this.nominateur * frac.denominateur) + (frac.nominateur * this.denominateur),
          this.denominateur * frac.denominateur);
    int pgcd = pgcd(frac1.nominateur, frac1.denominateur);
    return new Fraction(frac1.nominateur / pgcd, frac1.denominateur / pgcd);
  }

  @Override
  public int hashCode() {
    int pgcd = pgcd(this.nominateur, this.denominateur);
    Fraction frac = new Fraction(this.nominateur / pgcd, this.denominateur / pgcd);
    return Objects.hash(frac.nominateur, frac.denominateur);
  }

  @Override
  public boolean equals(Object frac) {
    if (this == frac) {
      return true;
    }
    if (frac == null || getClass() != frac.getClass()) {
      return false;
    }
    Fraction fraction = (Fraction) frac;
    int pgcd1 = pgcd(this.nominateur, this.denominateur);
    Fraction f1 = new Fraction(this.nominateur / pgcd1, this.denominateur / pgcd1);
    int pgcd2 = pgcd(fraction.nominateur, fraction.denominateur);
    Fraction f2 = new Fraction(fraction.nominateur / pgcd2, fraction.denominateur / pgcd2);
    return f1.nominateur == f2.nominateur && f1.denominateur == f2.denominateur;
  }

  /**
   * compareTO Method.
   */
  public int compareTo(Object frac) {
    if (frac == null || getClass() != frac.getClass()) {
      throw new IllegalArgumentException();
    }
    if (this == frac || this.equals(frac)) {
      return 0;
    }
    if ((this.nominateur * ((Fraction) frac).denominateur)
            > ((Fraction) frac).nominateur * (this.denominateur)) {
      return 1;
    }
    return -1;
  }
}
