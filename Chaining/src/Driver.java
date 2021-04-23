import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hash Table test\n\n");
        System.out.println("Enter size");
        HashTable ht= new HashTable(scan.nextInt());
        char ch;
        /* Hash table operation*/
        do{
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert");
            System.out.println("2. get");
            System.out.println("3.  clear");
            System.out.println("4.  size");
            int choice=scan.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter key and value");
                    ht.insert(scan.next(),scan.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter key");
                    System.out.println("Value =" + ht.get(scan.next()));
                    break;
                case 3:
                    ht.makeEmpty();
                    System.out.println("Hash Table cleared\n");
                    break;
                case 4:
                    System.out.println("Size = " + ht.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* Dispaly Hash table*/
            ht.dispaly();

            System.out.println("\nDo you want to continue (type y or n) \n");
            ch=scan.next().charAt(0);
        }while (ch=='y' || ch =='Y');
    }
}
