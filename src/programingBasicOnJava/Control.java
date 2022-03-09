package programingBasicOnJava;

public class Control {
    public static void main(String[] args) {
        int age = 9;
        int charge =0;



        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동");

        }
        else if(age < 20){
            System.out.println("중고등학생 ");
        }
        //...

        int rank = 1;

        char medalColor;

        switch(rank) {
            case 1:
                medalColor ='G';
                break;
            case 2:
                medalColor = 'S';
                break;
            default:
                medalColor = 'A';
                break;
        }

    }
}
