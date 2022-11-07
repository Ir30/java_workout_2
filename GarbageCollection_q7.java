class GarbageCollection_q7{

    static int created = 0;
    static int deleted = 0;

    GarbageCollection_q7()
    {
        created=created+1;
    }

    protected void finalize()throws Throwable
    {
        deleted=deleted+1;
    }

    public static void main(String[] args) 
    {
        GarbageCollection_q7 t1= new GarbageCollection_q7();
        GarbageCollection_q7 t2= new GarbageCollection_q7();    
        GarbageCollection_q7 t3= new GarbageCollection_q7();    
        GarbageCollection_q7 t4= new GarbageCollection_q7();
        GarbageCollection_q7 t5= new GarbageCollection_q7();

        
        t1=null;
        t3=t1;
        // System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Object created : "+created);
        System.out.println("Object deleted : "+deleted);
        System.out.println("Object alive : "+ (created-deleted));

    }
}

