package lamdabasics;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String args []){
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        MyLambda myLambdaFunction = ()-> System.out.println("Hello World!");
        MyAdd addFunction = (int a, int b)->a+b;
    }
}
/*
interface should have exact same signature as of the lambda function
 */
interface MyLambda{
    void foo();
}
interface MyAdd{
            int add(int x, int y);
        }
