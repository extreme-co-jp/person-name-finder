package jp.co.extreme.nlp.test;

import java.util.*;
import jp.co.extreme.nlp.*;


/**
 * Searching for Japanese names Example.
 */
public class PersonNameFind_JA extends Object {

  public static void main(String[] args) {
    try {
      String src = "（セ・リーグ、DeNA3－6巨人、2回戦、巨人1勝1分け、9日、横浜）　巨人は連敗を3でストップ。4番の岡本和真内野手（28）が四回、左翼席へ決勝の3号ソロを放った。"
       + "2試合連続の3安打猛打賞で、球団の4番打者としては1959年の長嶋茂雄以来、66年ぶりの開幕11試合連続安打をマークした主砲の活躍に、阿部慎之助監督（46）も「すごくいい姿を見せてくれているので、これを続けていってほしいなと思うし、チームの周りも、その姿を見て何かを感じてほしいなというのは思いました」とたたえた。";

      NlpAbstractNounFinder nounFinder = NlpFinderBuilder.build_jp(null);
      List<NlpNoun> nounList = nounFinder.find(src);
      TestUtil.dispNouns(nounList, src);

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}