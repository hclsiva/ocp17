package compatible.method.declarations;

// This compiles since the
public class Bear implements Herbivore,Omnivore{
    @Override
    public void eatPlants() {
        System.out.println("Bear eating Plants");
    }
}
