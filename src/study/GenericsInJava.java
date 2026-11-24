package study;

public class GenericsInJava {
    public static void main(String[] args){
        Print<Integer> print = new Print<>(78);
    }
    
}
//now creating a generic class with the constructor of T 
// here T can be anything 
class Print <T> {
    public Print (T thethingT){
        System.out.println(thethingT);
    }
};