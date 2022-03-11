package inheritance;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("책을 읽는다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void fly() {
        System.out.println("독수리가 하늘을 난다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 걷습니다.");
    }
}
public class AnimalTest {
    public void moveAnimal(Animal animal) {
        animal.move();
        if (animal instanceof Human) {
            Human human = (Human)animal;
            human.readBook();
        }
        //업캐스팅 된것을 다시 다운캐스팅 하면 원래 가려졌던 정보들 다시 사용가능
    }
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Animal());
        test.moveAnimal(new Eagle());



    }
}
