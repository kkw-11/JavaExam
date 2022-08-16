package exam002;

public class Car {

    Tire tire;

    public Car(Tire tire){
        this.tire = tire; //의존관계가 일어나는 부분, Car의 생성자 코드에서 tire 속성에 새로운 타이어를 생성해서 참조할 수 있게 해주었다.
    }

    public String getTireBrand(){
        return "This tire is get " + tire.getBrand();
    }
}
