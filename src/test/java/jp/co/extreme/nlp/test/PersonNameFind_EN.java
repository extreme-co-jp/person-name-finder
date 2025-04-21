package jp.co.extreme.nlp.test;

import java.util.*;
import jp.co.extreme.nlp.*;


/**
 * Searching for English names Example.
 */
public class PersonNameFind_EN extends Object {

  public static void main(String[] args) {
    try {
      String src = "President Donald Trump is urging everyone to keep their cool. But the rollercoaster tariff war is rattling nerves from coast to coast as Americans nervously watch their stock portfolios and 401(k) accounts yo-yo with the wild gyrations of the financial markets."
        + " Economists say consumers have good reason to worry. At midnight Eastern time Wednesday, the White House imposed double-digit rates on dozens of countries. Hours later, Trump reversed course, lowering tariffs on goods from dozens of countries to 10% for 90 days."
        + " The temporary reprieve from global tariffs sparked a historic surge on Wall Street, but uncertainty remains on Main Street. The changes in tariff policy created as many questions as they did answers, Bill Adams, chief economist for Comerica Bank, told USA TODAY.";
 
      NlpAbstractNounFinder nounFinder = NlpFinderBuilder.build_en(null);
      List<NlpNoun> nounList = nounFinder.find(src);
      TestUtil.dispNouns(nounList, src);

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}