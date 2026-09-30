package Collections.foodordermanagementsystem;

import java.util.*;
class Orders
{
    Integer orderId;
    String name;
    String location;
    String foodItem;
    Integer Quantity;
    Double amt;  //wrapper class

    public Orders(Integer orderId,String name,String location,String foodItem,Integer Quantity,Double amt)
    {
        this.orderId = orderId;
        this.name = name;
        this.location = location;
        this.foodItem = foodItem;
        this.Quantity = Quantity;
        this.amt = amt;
    }

    @Override
    public String toString()
    {
        return orderId.toString() +" " + name.toString() +" "+ location.toString() +" "+ foodItem.toString() +" "+ Quantity.toString() +" "+ amt.toString();
    }
}
public class ManageOrders {
    public static void main(String[] args)
    {
        List<String> menu = new ArrayList<>(Arrays.asList("dosai","biriyani","burger","pizza"));
        List<Orders> listOrders = new ArrayList<>(1000);
        listOrders.add(new Orders(101,"kishore","Tpr","Biriyani",1,250.0));
        listOrders.add(new Orders(102,"arun","chennai","dosai",2,40.0));
        listOrders.add(new Orders(103,"suga","Bangalore","burger",3,90.0));
        listOrders.add(new Orders(104,"sudhan","mysore","parotta",5,30.0));

//        for(Orders x : listOrders)  //all are iterating their references so , we need to access them with field names
//        {
//            if(menu.contains(x.foodItem.toLowerCase()))
//            {
//                System.out.print(x.foodItem+" is now available ");
//                System.out.print("Order ID ==> " + x.orderId + "\n");
//            }
//            else {
//                listOrders.remove(Integer.valueOf(x.orderId));
//                System.out.println(x.foodItem.toLowerCase() + " is not available" + "\n");
//            }
//        }
        //bi-directional
        //ListIterator<Orders> it = listOrders.listIterator(listOrders.size());  hasPrevious() and previous

        //uni-directional
        Iterator<Orders> it = listOrders.iterator();

        while(it.hasNext())
        {
            //System.out.println(it.next().orderId);
            Orders x = it.next();
            if(menu.contains(x.foodItem.toLowerCase()))
            {
                System.out.print(x.foodItem+" is now available ");
                System.out.print("Order ID ==> " + x.orderId + "\n");
            }
            else {
                it.remove();
                System.out.println(x.foodItem.toLowerCase() + " is not available " + x.orderId + " order is not accepted");
            }
            //concurrentmodificationexception is below ..
            //listOrders.add(new Orders(106,"aman","Covai","pizza",1,400.0));
            //System.out.println(it.next());  //it.next().orderId;  //it needs the string representation of a it.next() object and String.valueOf(object).
        }
//        System.out.println("Taken orders List ..............");
//        for(Orders x : listOrders)
//        {
//            System.out.println(x);
//        }
    }
}
