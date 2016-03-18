package employee;

//import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Objects;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;   

    public Employee(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age; } 
    
        public void addEmployee(Employee e,List<Employee> ml){            

            boolean b=true;
            for(int i=0;i<ml.size();i++){
                if((e.firstName.equals(ml.get(i).firstName)) && (e.lastName.equals(ml.get(i).lastName)) && (e.age==ml.get(i).age) )
                    {b = true;
                    break;}
                else                        
                    b = false;                
            }                       
                         
            if(b == true)                
                {System.out.println("Already Exists.Please Enter Different Values");
                        }
            else{
                ml.add(new Employee(firstName,lastName,age));
                        System.out.println("Employee "+firstName+" "+lastName+" of "+age+" years added to database");}
            
    }
 
 /* @Override
    public boolean equals(Object o){
//            int i=0;
            boolean a=true;
//                if (o == this) {
//                    return true;}
//                if (!(o instanceof Employee) || !(o instanceof Intern) ) {
//                    return false;}
                Employee e = (Employee) o;
                for(int i=0;i<ml.size();i++){
                    if((e.firstName==ml.get(i).firstName) && (e.lastName==ml.get(i).lastName) && (e.age==ml.get(i).age) )
                       {a=true;}
                    else{a=false;}}
                 return a;  
    }   */
        
    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        hash = 61 * hash + this.age;
        return hash;
    }*/
}
//        return false;

    
    
//}
