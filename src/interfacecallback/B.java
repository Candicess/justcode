package interfacecallback;

public class B implements Cloneable {

    public int a = 1;
    public Phoenix p = new Phoenix();

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
    public Object clone(){
        //浅克隆
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
        //深克隆
        try {
            B clone =  (B) super.clone();
            clone.p = new Phoenix();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
