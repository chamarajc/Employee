package employee;

import java.util.*;
import java.util.Arrays;


public class TestEmployee {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Employee> ml = new LinkedList<>();
        
        ml.add(new Employee("Akalanka","Senevirathne",30));
        ml.add(new Employee("Nishan","Lasantha",30));
        ml.add(new Intern("Mohamed","Nifraz",25));
        ml.add(new Intern("Mohamed","Firthous",25));
        ml.add(new Intern("Thivya","Mahenthirarasa",23));
        
        List<String> nameList = new LinkedList();
        List<Integer> ageList = new LinkedList();

        ml.stream().forEach((ml1) -> {
            nameList.add((ml1.firstName + " " + ml1.lastName));
        });
        
//        for(int i=0;i<ml.size();i++)
//            {nameList.add(new String(ml.get(i).firstName+" "+ml.get(i).lastName));}
        
        ml.stream().forEach((ml1) -> {
            ageList.add(ml1.age);
        });
        
//        for(int i=0;i<ml.size();i++)
//            {ageList.add(new Integer(ml.get(i).age));}
        
        int[] array = new int[ageList.size()];
        
        for (int i = 0; i < ageList.size(); i++) {
            array[i] = ageList.get(i);
        }
        
        System.out.print("Press \"e\" to add an employee \n"
                + " \"i\" to add an intern \n "
                + "\"g\" to get details \n \"n\" to sort by name or \n "
                + "\"a\" to sort by age: ");
        String s = sc.nextLine();
        char c = s.charAt(0); 
        
        switch (c){
            
            case 'e':                    
                {System.out.println("Enter First Name:");
                String fn=sc.nextLine();
                System.out.println("Enter Last Name:");
                String ln=sc.nextLine();
                System.out.println("Enter Age:");
                int a=sc.nextInt();

                Employee e = new Employee(fn,ln,a);                
                e.addEmployee(e,ml);
                break;}                

            case 'i':                    
                    {System.out.println("Enter First Name:");
                    String fn=sc.nextLine();
                    System.out.println("Enter Last Name:");
                    String ln=sc.nextLine();
                    System.out.println("Enter Age:");
                    int a=sc.nextInt();

                    Intern i = new Intern(fn,ln,a);
                    i.addIntern(i,ml);
                    break;}                      

                case 'g':
                    {System.out.print("Enter the employee index:");
                     int i2 = sc.nextInt();                
                     boolean b = ml.get(i2) instanceof Intern;
                        if (b==true){
                            System.out.println(ml.get(i2).firstName+" "+ml.get(i2).lastName+" of age "+ml.get(i2).age+" is an Intern");}
                        else{
                            System.out.println(ml.get(i2).firstName+" "+ml.get(i2).lastName+" of age "+ml.get(i2).age+" is not an Intern");
                            break;
                        }}

                case 'n':  
                    {   Collections.sort(nameList);
                        System.out.println(nameList);
                    break;}

                case 'a':  
                   Arrays.sort(array); 
                   //Collections.sort(nameList);
//                    for (int number : array) {                        
//                        //System.out.println(nameList.get() + number +" years");
//                        //System.out.println(nameList.get(number) + number +" years");
//                        System.out.println(+ number +" years");}  
//                        for(int i=0;i<ml.size();i++){                            
//                            {if(array[i]==ml.get(i).age)
//                                    System.out.println(ml.get(i).firstName+ml.get(i).lastName+ml.get(i).age);
//                                        ml.remove(i);
//                                        
//                            }}
                    for (int number : array) {                        
                        System.out.println(number +" years");} 
                    int size = ml.size();
                       System.out.println("size = "+size);
                    //sortByAge(size,array);
                    System.out.println(ml.get(size-1).firstName+" "+ml.get(size-1).lastName+" "+ml.get(size-1).age);
                    
                    for(int p=5;p<0;p--)
                    {System.out.println("fff");}
                    
                    for (int i=5;i<0;i--){
                        for(int j=5;j<0;j--){
                            if(size==0)                                
                                System.out.println(ml.get(size).firstName+ml.get(size).lastName+ml.get(size).age);
                            else if (array[size-i]==ml.get(size-j).age)
                                System.out.println(ml.get(size-j).firstName+ml.get(size-j).lastName+ml.get(size-j).age);
                            else
                                System.out.println(size); }}
//                        else    
//                            { ml.remove(size-i);
//                            size=ml.size();                            
//                            array = ArrayUtils.removeElement(array, array[size-i]);}
                           // sortByAge(size,array);
                          //System.out.println(size); 
                    break;
                    

                default:
                    System.out.println("Please enter a valid character");
                    break;}
            
//        ml.clear();       

    } 
//    public static void sortByAge(int size,int[] array){
//        
//            }
}


        


