public class Calculator {
    double result;
    public void Addition(int x,int y){
        result=x+y;
        System.out.println(x+" + "+y +" = "+result);
    }
    public void Subtraction(int x,int y){
        result=x-y;
        System.out.println(x+" - "+y +" = "+ result);
    }
    public void Multiplication(int x,int y){
        result=x*y;
        System.out.println(x+" * "+y+" = " +result);
    }
    public void Division(int x,int y){
        result=x/y;
        System.out.println(x+" / "+y+" = "+ result);

    }
}
