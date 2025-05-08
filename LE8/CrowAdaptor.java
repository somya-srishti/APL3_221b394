public class CrowAdaptor implements Swan{
    private Crow crow;
    public CrowAdaptor(Crow crow){
        this.crow = crow;
    }
    public void eat(){
        crow.eat();
    }
    public void sing(){
        crow.cry();
    }
    public void swim(){
        crow.fly();
    }
}