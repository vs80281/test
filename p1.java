import java.util.function.predicate;
class employee
{
String name;
int age;
Employee(String name,int age)
{
this.name;
this.age;
}
public String toString()
{
return name;
}
}
class Test
{
Public static void main(String[] args)
{
Employee[] list={new employee("Tarun",211),
                 new employee("Shyaam",119),
                 new employee("Ashok",31),
                 new employee("Sohan:,18),
                 new employee("Gary",226)
                 };
                 Predicate<employee>person=em->em.age>100;
                System.out.print("Age grater than 100 are:");
                for(employee em:list)
                {
                if(person.test(em))
                {
                System.out.println(em+"");
                }
                }
                }
                }
                
             
              
                
     
