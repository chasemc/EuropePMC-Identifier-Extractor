package ukpmc.scala

import monq.jfa.Xml
import java.util.Map

case class MwtAtts(tagname: String, xmlcontent: String, db: String, valmethod: String, domain: String, context: String, wsize: String)

class MwtParser(val map: java.util.Map[String, String]) {

  // <template><z:acc db="%1" valmethod="%2" domain="%3" context="%4" wsize="%5">%0</z:acc></template>
  def parse = {
    val tagname = map.get(Xml.TAGNAME);
    val xmlcontent = map.get(Xml.CONTENT);

    val db = map.get("db");
    val valmethod = map.get("valmethod");
    val domain = map.get("domain");
    val context = map.get("context");
    val wsize = map.get("wsize");

    MwtAtts(tagname, xmlcontent, db, valmethod, domain, context, wsize)
  }
}
