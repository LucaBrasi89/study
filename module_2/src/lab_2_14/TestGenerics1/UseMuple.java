package lab_2_14.TestGenerics1;

/**
 * Created by andrew on 19.03.17.
 */
public class UseMuple {

    public static void main(String[] args) {

        MyTuple<String,Integer,Long> obj1 = new MyTuple<>("str",5,8L);


        MyTuple<Double,String,String> obj2 = new MyTuple(15,55,15.4f);


    }

}
