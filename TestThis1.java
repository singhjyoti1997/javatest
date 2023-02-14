class TestThis{  
    int rollno;  
    String name;  
    float fee;  
    TestThis(int rollno,String name,float fee){  
    rollno=rollno;  
    name=name;  
    fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
    class TestThis1{  
    public static void main(String args[]){  
    TestThis s1=new TestThis(111,"ankit",5000f);  
    TestThis s2=new TestThis(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }}  