package io.github.pumpkinxd.examples.example4interfaces;

public interface AnimalTest {
    public static void main(String[] args) {
        Animal animals[]=new Animal[4];
        animals[0]=new Dog();
        animals[1]=new Goose();
        animals[2]=new Penguin();
        animals[3]=new Human();

        for (Animal a:animals
             ) {
            System.out.println(
                    a.what()+" has "+a.getlegs()+" legs\n"
                    +"noise:"+a.makesound()+"\n"
                    +"how it moves:"+a.move()

            );
        }
    }
}
