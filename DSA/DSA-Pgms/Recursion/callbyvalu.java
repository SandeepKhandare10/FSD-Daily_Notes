package Recursion;

class callbyvalue{
    int a=50;

    void change(int a){
        a=a+100;
    }

    public static void main(String args[]){
        callbyvalue obj=new callbyvalue();
int num=200;
        System.out.println("before change "+obj.a);
        obj.change(num);
        System.out.println("after change "+obj.a);

    }
}
