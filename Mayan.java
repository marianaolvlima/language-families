public class Mayan extends Language {

  Mayan(String name, int numSpeakers) {
    super(name, numSpeakers, "Central America", "verb-object-subject.");
  }

  @Override
  public void getInfo() {
    System.out.println(super.name + " is spoken by " + super.numSpeakers + " people mainly in " + super.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + super.wordOrder); 
  }
}
