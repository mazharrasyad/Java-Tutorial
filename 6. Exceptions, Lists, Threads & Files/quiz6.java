public class quiz6
{

// No 1
void myFunc(int a, int b){
    try{
        System.out.println(a/b);
    }
    catch(Exception e){
        System.out.println("Error");
    }
}

// No 2
void myFunc(int arg) throws IllegalArgumentException{
    if (arg < 0)
    throw new IllegalArgumentException();
}

//
}

// No 3
class B implements Runnable{
   public void run(){
       System.out.println("B");
   } 
}

class A extends Thread{
    public void run(){
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }

    public static void main(String[] args) {
        A object = new A();
        object.start();
    }
}

// No 4
// extend the Thread class
// implement Runnable

public class quiz6
{
    public static void main(String [] args)
    {

// No 5
ArrayList<Integer> list = new ArrayList<Integer>();

for(int i = 0; i < 6; i++){
    list.add(i);
}

int x = 0;
Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    x += it.next();
}
System.out.println(x);

// No 6
int f=1, i=2;
while(++i < 5)
    f *= i;
System.out.println(f);

// -----
    }
}