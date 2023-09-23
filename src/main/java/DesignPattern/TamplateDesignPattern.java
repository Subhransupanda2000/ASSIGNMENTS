package DesignPattern;

abstract class OrderProcessTemplate {
    protected abstract void selectProduct();
    protected abstract void makePayment();
    protected abstract void packProduct();
    protected abstract void deliverProduct();

    // Template method
    public final void processOrder() {
        selectProduct();
        makePayment();
        packProduct();
        deliverProduct();
    }
}

class StoreOrder extends OrderProcessTemplate {
    @Override
    protected void selectProduct() {
        System.out.println("Selecting product in-store");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making payment at the store");
    }

    @Override
    protected void packProduct() {
        System.out.println("Simply packing product");
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Product delivered to the customer");
    }
}

class OnlineOrder extends OrderProcessTemplate {
    private boolean isGiftWrap;

    public OnlineOrder(boolean isGiftWrap) {
        this.isGiftWrap = isGiftWrap;
    }

    @Override
    protected void selectProduct() {
        System.out.println("Selecting product and adding it to the cart");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making payment online");
    }

    @Override
    protected void packProduct() {
        if (isGiftWrap) {
            System.out.println("Gift wrapping product");
        } else {
            System.out.println("Simply packing product");
        }
    }

    @Override
    protected void deliverProduct() {
        System.out.println("Product dispatched");
    }
}

public class TamplateDesignPattern {
    public static void main(String[] args) {
        StoreOrder storeOrder = new StoreOrder();
        storeOrder.processOrder();
        System.out.println();

        OnlineOrder onlineOrder = new OnlineOrder(true); // Gift wrap enabled
        onlineOrder.processOrder();
    }
}
