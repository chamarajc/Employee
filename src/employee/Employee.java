package employee;

import static employee.TestEmployee.ml;
//import java.util.Objects;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;   

    public Employee(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age; } 
    
        public void addEmployee(Employee e){            
           // boolean check = ml.contains(e);
            //int i;
            //boolean b;
            /*boolean check ;//= ml.get(i).equals(e);
            for(int i=0;i<ml.size();i++){
                
                check = ml.get(i).equals(e);
            
            if (check == true){
//            if (ml.equals(e)){
                System.out.println("Already Exists.Please Enter Different Values");
                break;} 
            else {
                ml.add(new Employee(firstName,lastName,age));
                System.out.println("Employee "+firstName+" "+lastName+" of "+age+" years added to database");
                break;}}*/
            boolean b=false;
            for(int i=0;i<ml.size();i++){
//                    if((e.firstName==ml.get(i).firstName) && (e.lastName==ml.get(i).lastName) && (e.age==ml.get(i).age) )
                    if((e.firstName.equals(ml.get(i).firstName)) && (e.lastName.equals(ml.get(i).lastName)) && (e.age==ml.get(i).age) )
                        b = true;
                    else                        
                        b = false; }                       
                         
            if(b == true)                
                {System.out.println("Already Exists.Please Enter Different Values");
                        }
            else{
                ml.add(new Employee(firstName,lastName,age));
                        System.out.println("Employee "+firstName+" "+lastName+" of "+age+" years added to database");}
            
            System.out.println(b);
            
            int ls = ml.size()-1;
                System.out.println(ls);
            
//            for (int i: ls) {
//                System.out.println(i);
//            }
    }
 
/*    @Override
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
    }   
    public void sortByname(){
        
    }
    
    @Override
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
