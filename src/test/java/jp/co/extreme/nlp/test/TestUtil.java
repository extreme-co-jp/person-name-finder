package jp.co.extreme.nlp.test;

import java.util.*;
import jp.co.extreme.nlp.*;


/**
 * TestUtil
 */
public class TestUtil extends Object {

  /** dispNouns */
  public static void dispNouns(Collection<NlpNoun> nounCollection, String src) {
    System.out.println("Number of nouns=" + nounCollection.size());
    for (NlpNoun noun : nounCollection) {
      System.out.println("text=" + noun.text + " reading=" +noun.reading + " index=" + noun.beginIndex +"-"+ noun.endIndex);
    }
  }

}