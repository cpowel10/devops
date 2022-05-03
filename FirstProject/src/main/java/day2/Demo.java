package day2;

public class Demo {

    int num1=10;                //instance variable
   static int num2=20;          //class variable
    public Demo() {
        num1++;
        num2--;
    }
    public Demo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void display(){
        System.out.println("Num 1 : "+num1);
        System.out.println("Num 2 : "+num2);
    }
    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.display();       //11 19
        Demo d2 = new Demo(100,200);
        d2.display();      //100 200
    }
}
