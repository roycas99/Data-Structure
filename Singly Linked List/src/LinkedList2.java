public class LinkedList2 {
   public Link header;
   public Link tail;
    public LinkedList2(){
       this.header=null;
        this.tail=null;
    }
    public void Append(LinkedList2 list,Link newLink){
        if(list.header==null){
            list.header=newLink;
            list.tail=newLink;
        }
        else{
            list.tail.next=newLink;
            list.tail=newLink;
        }

    }

    public void prepand(LinkedList2 list,Link newNode){
        if (list.header==null){
            list.header=newNode;
            list.tail=newNode;
        }
        else{
            newNode.next=list.header;
            list.header=newNode;
        }
    }

    public void insertAfter(LinkedList2 list,Link current,Link newNode){
        if(list.header==null){
            list.header=newNode;
            list.tail=newNode;
        }
        else if(current==tail){
           list.tail.next=newNode;
            list.tail=newNode;
        }
        else{
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    public void removeAfter(LinkedList2 list ,Link curNode){
        //special case, remove head
        Link sucNode;
        if(curNode==null && list.header !=null){
            sucNode=list.header.next;
            list.header=sucNode;
            if (sucNode==null){  // removed last item
                list.tail=null;
            }
        }
        else if(curNode.next != null){
            sucNode=curNode.next.next;
            curNode.next=sucNode;
            if (sucNode==null){   // removed tail
                list.tail=null;
            }
        }

    }
    public Link linkSearch(LinkedList2 list,Link searchingNode){
        Link currentNode=list.header;
        while (currentNode !=null){
            if (currentNode==searchingNode){
                return currentNode;
            }
            currentNode=currentNode.next;

        }
        return null;
    }

    public void display(){
        Link theLink=header;
        while (theLink!=null){
            theLink.display();
            System.out.println("the NextLink:" + theLink.next);
            theLink=theLink.next;
            System.out.println();
        }


    }
}
