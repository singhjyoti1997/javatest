class que2 {
 int c,d;
 que2()
 {
 System.out.println("constructor 1 overloading\n");
 }
 que2(int a, int b){
 System.out.println("CONSTRUCTOR 2 overloding\n");
 c=a;
 d=b;
 }
 public static void main(String[] args) {
 que2 h1=new que2();
 que2 h2= new que2(30,40);
 System.out.println(h2.c);
 System.out.println(h2.d);
 }}