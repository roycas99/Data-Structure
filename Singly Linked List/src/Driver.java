public class Driver {
    public static void main(String[] args) {
//        LinkList theLinkedList=new LinkList();
//        theLinkedList.insertFirstLink("A tiny Habit",100);
//        theLinkedList.insertFirstLink("outcast",200);
//        theLinkedList.insertFirstLink("The Magicians",500);
//        theLinkedList.display();
//
//        theLinkedList.removeFirst();
//        theLinkedList.display();

        LinkedList2 list=new LinkedList2();
        Link node=new Link("English",2016);
        Link node1=new Link("Chemistry",2014);
        Link node2= new Link("Biology",2012);
        list.Append(list,node);
        list.prepand(list,node2);
        list.insertAfter(list,node2,node1);
        list.removeAfter(list,null);
        System.out.println(list.linkSearch(list,node1));

       list.display();




    }
}
