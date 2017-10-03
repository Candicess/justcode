package innerclass;

public class InnerClass {

    public void drinkTea(){
        class BlackTea{

        }
    }

    public void main(String[] args) {
        new NonStaticClass().doSth();
    }


    static class Tea{

    }

    class NonStaticClass{
        public void doSth() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(300000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}


