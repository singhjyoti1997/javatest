class que3 {

    int id;
    String name;

    que3(int i, String n) {

        id = i;
        name = n;

    }

    que3(que3 tmp) {

        id = tmp.id;
        name = tmp.name;

    }

    void display() {

        System.out.println("Name : " + name + "\nID : " + id);

    }

    public static void main(String[] args) {

        que3 s1 = new que3(101, "copy constructure");
        que3 s2 = new que3(s1);
        que3 s3 = new que3(234, "copy");
        
        s1.display();
        s2.display();
        
        s3.name = s2.name;
        s3.id = s2.id;

        s3.display();

    }

}
