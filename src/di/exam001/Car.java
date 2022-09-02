package di.exam001;

public class Car {

    Tire tire;

    public Car(){
        this.tire = new KoreaTire(); //의존관계가 일어나는 부분, Car의 생성자 코드에서 tire 속성에 새로운 타이어를 생성해서 참조할 수 있게 해주었다.
        //this.tire = new AmericaTire(); // Car 생성자가 직접 생성한다면 Car 생성자의 코드를 매번 바꿔야줘야 함. 코드의 확장성이 좋지 않음
    }

    public String getTireBrand(){
        return "This tire is get " + tire.getBrand();
    }
}
