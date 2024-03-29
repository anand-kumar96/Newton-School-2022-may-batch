//https://my.newtonschool.co/playground/code/fs309t4tlgix/



// class Employee{
//     String name;
//     double salary;
//     public Employee(String name , double salary){
//         this.name=name;
//         this.salary=salary;
//     }
// }

class Solution{
    public void sumSalary(List<Employee> list){
    double sum=0;
    for(Employee i:list){
        sum+=i.salary;
    }
    System.out.println(sum);
    }
}


/* 
sum of salary
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a list of employees, print the sum of salary of employee using java Stream functions.
Input
Don't input anything just complete the function sumSalary.

constraints
1 <= number of employee <= 105
1<= salary <= 5 x 10 4
sum of salary can be stored in double datatype
Output
print the required sum.
Example
Input:
4
Tyrion 20000
Jon 15000
Arya 30000
Ramsay 40000

Output:
105000
*/
