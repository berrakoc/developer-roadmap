public class Y extends X{
    public void calc(){
        value+=2;
    }
    public void calc(int a){
        calc();
        super.calc();
        value*=a;
    }
}
