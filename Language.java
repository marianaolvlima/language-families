public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String words) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = words;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args) {
    Language english = new Language("English", 1000000, "USA", "subject + verb + object.");
    english.getInfo();
    Mayan chol = new Mayan("Ch'ol", 254715);
    chol.getInfo();
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();
  }
}