 class HashTable {
    private int tableSize;
    private  int size;
    private LinkedHashEntry[] table;

    //constructor
     public HashTable(int ts){
         this.size=0;
         this.tableSize=ts;
         table=new LinkedHashEntry[tableSize];
         for (int i = 0; i < tableSize; i++) {
             table[i]=null;

         }

         }
     // function to get number of key-value pairs
     public int getSize(){
         return size;

     }
     // function to clear hash table
        public void  makeEmpty(){
            for (int i = 0; i <tableSize ; i++) {
                table[i]=null;

            }
        }
        //function to get value of a key
     public  int get(String key){
         int hash=(myhash(key)%tableSize);
         if (table[hash]==null){
             return -1;
         }
         else{
             LinkedHashEntry entry=table[hash];
             while (entry !=null && entry.key.equals(key))
                 entry=entry.next;
             if(entry==null)
                 return -1;
             else return entry.value;
         }
     }
     // function to insert a key value pair
     public void insert(String key,int value){
         int hash=(myhash(key)%tableSize);
         if(table[hash]==null){
             table[hash]= new LinkedHashEntry(key,value);
         }
         else{
             LinkedHashEntry entry=table[hash];
             while (entry.next != null && !entry.key.equals(key))
             {
                 entry=entry.next;
             }
             if (entry.key.equals(key))
                 entry.value=value;
                 else
                     entry.next=new LinkedHashEntry(key,value);

             }
         size++;
         }

     //this function gives a hash value for a given String
     private int myhash(String x){
         int hashVal=x.hashCode();
         System.out.println(hashVal);
         hashVal= hashVal%tableSize;
         System.out.println(hashVal);
         if (hashVal<0)
             hashVal=hashVal+tableSize;
         return hashVal;
     }

     public void dispaly(){
         for (int i = 0; i < tableSize; i++) {
             System.out.println("\nBucket "+ (i+1) + " : ");
             LinkedHashEntry entry=table[i];
             while (entry != null){
                 System.out.println(entry.value + " ");
                 entry=entry.next;
             }

         }
     }

}
