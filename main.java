// OPGAVE 1//
/*
public class main {
    static class Student {
        String name;
        int age;
        int studentCount;


        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return ("Student name: " + this.name + "\nStudent age: " + this.age);
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student c = new Student("Christian", 23);
        Student f = new Student("Filip", 19);
        Student j = new Student("Jayden", 20);

        students[0] = c;
        students[1] = f;
        students[2] = j;

        for (Student s : students) {
            System.out.println(s);
        }

        Student oldest = students[0];

        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }

        System.out.println("Oldest: " + oldest.name + ", " + oldest.age);

    }
}
*/

/*

// OPGAVE 2 //

public class main {
    public static void main() {
        Product item1 = new Product("Computer", 5000, new String[] {"Sale", "Electronics"});
        Product item2 = new Product("Iphone", 18000, new String[] {"Sale", "New"});
        Product item3 = new Product("M&Ms", 45, new String[] {"Food", "Candy"});
        Product item4 = new Product("Keybaord", 1400, new String[] {"Gaming", "Electronics"});

        Product[] products = {item1, item2, item3, item4};

        System.out.println("Alle produkter");
        for (Product s : products) {
            if (s.hasTags("Sale"))
                s.printInfo();
        }

        Product expensive = products[0];

        for (Product e : products) {
            if (e.price > expensive.price) {
                expensive = e;
                System.out.println("Most expensive: " + e.name + " - " + e.price);
            }
        }
    }
 */

//OPGAVE 3//


public class main {

    void main () {
    BankAccount Christian = new BankAccount ( "Christian", 1000);
    Christian.Deposit(100);
    Christian.Withdraw(200);
    Christian.transactionHistory();
    Christian.getBalance();


    }
}






