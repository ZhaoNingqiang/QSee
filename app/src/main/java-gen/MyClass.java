import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) throws Exception {

        testRetainAll();


    }

    private static void testRetainAll(){
        ArrayList<String> lista = new ArrayList<String>(3);
        lista.add("test1");
        lista.add("test2");
        lista.add("test3");
        lista.add("test4");

        ArrayList<String> listb = new ArrayList<String>(3);
        listb.add("test1");
        listb.add("test3");

        listb.add("test9");

        boolean result = lista.retainAll(listb);
        if (result){
            System.out.println("数据发生变化了 lista = "+lista+"   listb = "+listb);
        }else {
            System.out.println("数据没有变化 lista = "+lista+"   listb = "+listb);
        }
    }

    /*****forecah 查看class文件

     int[] a = new int[]{1, 3, 4};
     int[] list = a;
     int var3 = a.length;

     for(int i = 0; i < var3; ++i) {
     int aa = list[i];
     System.out.println(aa);
     }

     ArrayList var6 = new ArrayList();
     var6.add(new Integer(3));
     var6.add(new Integer(56));
     var6.add(new Integer(4));
     Iterator var7 = var6.iterator();

     while(var7.hasNext()) {
     Integer var8 = (Integer)var7.next();
     System.out.println(var8);
     }

     * ****/
    private void forDemo(){
        int[] array = {1,3,4};
        for(int a : array){
            System.out.println(a);
        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(3));
        list.add(new Integer(56));
        list.add(new Integer(4));
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
