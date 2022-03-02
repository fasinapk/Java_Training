package Java8Features;

interface MyInterfacee{
default void newDefaultMethod(){
System.out.println("New default method");
}
static void newStaticMethod(){
System.out.println("New static method");
}
void existingMethod(String str);
}
public class DefaultStaticMethd implements MyInterfacee{
//existing method implementation
public void existingMethod(String str){
System.out.println("String : "+str);
}
//There is no need to implement the other methods
public static void main(String args[]){

	DefaultStaticMethd obj =new DefaultStaticMethd();

	obj.newDefaultMethod();
	MyInterfacee.newStaticMethod();
	obj.existingMethod("This is the new java 8 feature");
}
}

