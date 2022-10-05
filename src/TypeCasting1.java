public class TypeCasting1
{
    public static void main(String[]args)
    {
//        int x = 9;
//        //double d = x;
//        double d = (double) x;    //Widening or Implicit TypeCasting
//        System.out.println(d);
//
//        System.out.println();
//        double d1 = 9.5;           //Narrowing or Explicit TypeCasting
//        int i = (int) d1;
//        System.out.println(i);

//        Parent p = new Parent();
//        p.show();
//        p.display();
//        //p.print();              //Case-1  Cannot resolve method 'print' in 'Parent'
//        Child c = new Child();
//        c.print();
//        c.show();
//        c.display();        //Case-2   Cannot resolve method 'display' in 'Child'

//        Parent p = (Parent) new Child();   //Case-3
//        p.show();                           //UpCasting
//        //p.print();
//        p.display();
        //Child c = (Child) new Parent();      //DownCasting

    }
}

  class Parent
{
    void show()
    {
        System.out.println("Parent Class show()");
    }

    void display()
    {
        System.out.println("Parent Class display()");
    }
}

   class Child
   {
       void show()
       {
           System.out.println("Child Class show()");
       }

       void print()
       {
           System.out.println("Chile Class print()");
       }
   }
