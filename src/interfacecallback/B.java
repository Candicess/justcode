package interfacecallback;

public class B implements Cloneable {

    public int a = 1;

    private ICallback listener;

    public void setCallback(ICallback listener) {
        this.listener = listener;
    }

    public void doSth() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                listener.onCallback("sendheart");
            }
        }).start();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
