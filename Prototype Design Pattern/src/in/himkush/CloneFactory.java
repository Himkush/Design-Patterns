package in.himkush;

public class CloneFactory {

    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
