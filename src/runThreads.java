/**
 * Created by kamel on 2/14/2017.
 */
public class runThreads extends Thread{



    public runThreads(String str) {
       setName(str);

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + ": " + getName());

            }
        }

    }


