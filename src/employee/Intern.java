package employee;

import static employee.TestEmployee.ml;

public class Intern  extends Employee {

    public Intern(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }    
    
        public void addIntern(Intern i){
            
            for(int j=0;j<ml.size();j++){
//                    if((e.firstName==ml.get(i).firstName) && (e.lastName==ml.get(i).lastName) && (e.age==ml.get(i).age) )
                    if((i.firstName.equals(ml.get(j).firstName)) && (i.lastName.equals(ml.get(j).lastName)) && (i.age==ml.get(j).age) )
                         {System.out.println("Already Exists.Please Enter Different Values");
                            break;}
                    else
                        {
                        ml.add(new Intern(firstName,lastName,age));
                        System.out.println("Intern "+firstName+" "+lastName+" of "+age+" years added to database");
                        break;}
            }

               
    }
}
