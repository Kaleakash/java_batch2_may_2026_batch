package com.executorframework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//class Restaurant {
//    private ReentrantLock lock = new ReentrantLock();
//    private Condition foodReady = lock.newCondition();
//
//    private boolean isFoodPrepared = false;
//
//    public void orderFood() {
//        lock.lock();
//
//        try {
//            while (!isFoodPrepared) {
//                System.out.println("Customer: Waiting for food...");
//                foodReady.await(); // wait
//            }
//
//            System.out.println("Customer: Food received!");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void prepareFood() {
//        lock.lock();
//
//        try {
//            System.out.println("Chef: Preparing food...");
//            Thread.sleep(3000);
//
//            isFoodPrepared = true;
//
//            System.out.println("Chef: Food is ready!");
//            foodReady.signal(); // notify one waiting thread
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }
//}



class Restaurant {
//    private ReentrantLock lock = new ReentrantLock();
//    private Condition foodReady = lock.newCondition();

    private boolean isFoodPrepared = false;

    public synchronized void orderFood() {
        //lock.lock();

        try {
            while (!isFoodPrepared) {
                System.out.println("Customer: Waiting for food...");
                ///foodReady.await(); // wait
                wait();
            }

            System.out.println("Customer: Food received!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //lock.unlock();
        }
    }

    public synchronized void prepareFood() {
        //lock.lock();

        try {
            System.out.println("Chef: Preparing food...");
            Thread.sleep(3000);

            isFoodPrepared = true;

            System.out.println("Chef: Food is ready!");
           // foodReady.signal(); // notify one waiting thread
            	notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
           // lock.unlock();
        }
    }
}
public class ConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Restaurant restaurant = new Restaurant();

        Thread customer =new Thread(() -> restaurant.orderFood());

        Thread chef =new Thread(() -> restaurant.prepareFood());

        customer.start();
        chef.start();

	}

}
