package hello.core.singleton;

public class StatefulService {
    private int price;//상태를 유지하는 필드

    public void order(String name, int price){
        System.out.println("name = " + name + "price = " + price);
        this.price = price;//여기가 문제!
    }

    public int getPrice(){
        return price;
    }
}

//해결법
/*public class StatefulService {
    public void order(String name, int price){
        System.out.println("name = " + name + "price = " + price);
        return price;--> 이렇게 하면 지역변수가 되어 버리기 때문에 각각의 사용자의 price를 반환해 준다
    }
}*/
