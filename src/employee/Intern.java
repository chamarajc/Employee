package employee;

import java.util.List;

public class Intern  extends Employee {

    public Intern(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }    
    
        public void addIntern(Intern i,List<Employee> ml){
            
            boolean b=true;
            for(int j=0;j<ml.size();j++){
                if((i.firstName.equals(ml.get(j).firstName)) && (i.lastName.equals(ml.get(j).lastName)) && (i.age==ml.get(j).age) )
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

               
    }

