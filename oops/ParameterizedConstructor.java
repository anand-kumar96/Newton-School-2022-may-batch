package com.company.Newton_School.oops;
class Company1{
    // data members of the class or blueprint of class
    String name;
    int year;


          // method 01
    /*
    Company1(String name,int year){
        this.name=name;
        this.year=year;


    }

}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Company1 my=new Company1("Shanvi",2020);
        System.out.println("company name is: "+my.name);
        System.out.println("company established year is:" +my.year);
    }
}

     */

// method02
    /*
  Company1(String name,int year){
      // we can get direct output by creating same varible using this.
//    this.name=name;
//    this.year=year;
    System.out.println("company name is: "+name);
    System.out.println("company established year is:"+year);

}

}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Company1 my=new Company1("Shanvi",2020);

    }
}

     */

    // method 03

// we can not  create varible with same name of attributes so change variable name
Company1(String companyname,int companyyear){
    name=companyname;
    year=companyyear;

}

}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Company1 my=new Company1("Shanvi",2020);
        System.out.println("company name is: "+my.name);
        System.out.println("company established year is:"+my.year);
    }
}



