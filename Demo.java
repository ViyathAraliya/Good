
interface Math {
    public int operation(int num1, int num2);
}

class Demo {
    public static void main(String[] args) {
 int a =6;
 int b= 8;
        
    Math add=(x,y)->  x+y;
    Math sub=(x,y)-> x-y;
    Math mul=(x,y)-> x*y;
    Math div=(x,y)-> x/y;


        System.out.println(a + " + " + b + " = " + add.operation(a, b));
        System.out.println(a + " - " + b + " = " + sub.operation(a, b));
        System.out.println(a + " * " + b + " = " + mul.operation(a, b));
        System.out.println(a + " / " + b + " = " + div.operation(a, b));
    }
}
