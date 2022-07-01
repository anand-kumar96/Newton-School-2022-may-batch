package com.company.Newton_School.oops;
class Mobile1 {

    /*
    // --->  we can not access private access modiofier from differnt class


    private void ring() {
        System.out.println("mobile ringing");
    }
    }

    public class privateAccessModifier {
    public static void main(String[] args) {
        Mobile1 redmi=new Mobile1();
     //  redmi.ring(); // throwing error
        }
    }

     */
    // we can not access private access modiofier from differnt class

}
  //------->  accessing in same class no error throw
    public class privateAccessModifier {

        private static void ring() {
            System.out.println("mobile ringing");
        }
    public static void main(String[] args) {
        Mobile1 redmi=new Mobile1();
        //  redmi.ring(); // throwing error
        ring();
    }
}


