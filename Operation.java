public class Operation {
    static int add(int a, int b){
        int c = a + b;
        return c;
    }
    static int sub(int a, int b){
        int c = a - b;
        return c;
    }
    static int mul(int a, int b){
        int c = a * b;
        return c;
    }
    static float div(float a,float b){
        if(b == 0)
            return 0;
        else{
            float c = a / b;
            return c;
        }
    }
}