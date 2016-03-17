package employee;

import java.util.*;

public class TestEmployee {
    
    static Scanner sc = new Scanner(System.in);
    static List<Employee> ml = new LinkedList<>();

    public static void main(String[] args) {
        
        ml.add(new Employee("Akalanka","Senevirathne",30));
        ml.add(new Employee("Nishan","Lasantha",30));
        ml.add(new Intern("Mohamed","Nifraz",25));
        ml.add(new Intern("Mohamed","Firthous",25));
        ml.add(new Intern("Thivya","Mahenthirarasa",23));
        
        List nameList = new LinkedList<String>();
        List<Integer> ageList = new LinkedList<>();        
        
        for(int i=0;i<ml.size();i++)
            {nameList.add(new String(ml.get(i).firstName+" "+ml.get(i).lastName));}
        
        for(int i=0;i<ml.size();i++)
            {ageList.add(new Integer(ml.get(i).age));}
        
        int[] array = new int[ageList.size()];
        
        for (int i = 0; i < ageList.size(); i++) {
            array[i] = ageList.get(i);
        }
        
        System.out.print("Press \"e\" to add an employee \n"
                + " \"i\" to add an intern \n "
                + "\"g\" to get details \n \"n\" to sort by namee or \n "
                + "\"a\" to sort by age: ");
        String s = sc.nextLine();
        char c = s.charAt(0);     
            
                if(c == 'e')                    
                    {System.out.println("Enter First Name:");
                    String fn=sc.nextLine();
                    System.out.println("Enter Last Name:");
                    String ln=sc.nextLine();
                    System.out.println("Enter Age:");
                    int a=sc.nextInt();
                    
                    Employee e = new Employee(fn,ln,a);                
                    e.addEmployee(e);}                
            
                else 
                    if(c == 'i')                    
                        {System.out.println("Enter First Name:");
                        String fn=sc.nextLine();
                        System.out.println("Enter Last Name:");
                        String ln=sc.nextLine();
                        System.out.println("Enter Age:");
                        int a=sc.nextInt();

                        Intern i = new Intern(fn,ln,a);
                        i.addIntern(i);}                      

                    else
                        if(c == 'g')
                        {System.out.print("Enter the employee index:");
                         int i2 = sc.nextInt();                
                         boolean b = ml.get(i2) instanceof Intern;
                            if (b==true){
                                System.out.println(ml.get(i2).firstName+" "+ml.get(i2).lastName+" of age "+ml.get(i2).age+" is an Intern");}
                            else{
                                System.out.println(ml.get(i2).firstName+" "+ml.get(i2).lastName+" of age "+ml.get(i2).age+" is not an Intern");
                            }}
                    
                    else
                        if(c == 'n')   
                        {  Collections.sort(nameList);
                            System.out.println(nameList);}
                        
                    else
                        if(c == 'a')   
                       {Arrays.sort(array);                            
                        for (int number : array) {
                            System.out.println("Number = " + number);}                            
                            }    

                else
                    System.out.println("Please enter a valid character");             
//        ml.clear();
        
//            for (Employee str: ml) {
//                System.out.println(str);
//              }    
    }        
}

        


