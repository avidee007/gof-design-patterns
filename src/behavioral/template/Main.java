package behavioral.template;

public class Main {
  public static void main(String[] args) {

    //Online Order
    OnlineOrderProcessTemplate online = new OnlineOrderProcessTemplate();
    online.processOrder();

    //In store order
    InStoreOrderProcessTemplate inStore = new InStoreOrderProcessTemplate();
    inStore.processOrder();
  }
}