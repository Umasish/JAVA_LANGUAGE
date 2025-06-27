public class Oops2Interface {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatNonVeg();
        b.eatVeg();
    }
}

interface Harbivore {
    void eatVeg();
}
interface Carnivore {
    void eatNonVeg();
}

class Bear implements Harbivore,Carnivore {
    public void eatVeg(){
        System.out.println("eat veg");
    }
    public void eatNonVeg(){
        System.err.println("eat non veg");
    }
}
