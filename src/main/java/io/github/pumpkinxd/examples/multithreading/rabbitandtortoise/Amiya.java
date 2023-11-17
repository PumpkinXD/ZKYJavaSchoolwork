package io.github.pumpkinxd.examples.multithreading.rabbitandtortoise;

import java.util.concurrent.CountDownLatch;

/*
 *  @author PumpkinXD
 *  Seems Cautuses(RABBITS/HARES) in arknights are not quite healthy?(kinda... weak?)
 *
 * Amiya were collab'd to musedash so...
 * @see <a href="https://musedash.fandom.com/wiki/Collab_Muses#Leader_of_Rhodes_Island">Musedash wiki(EN)</a> and <a href="https://prts.wiki/w/%E9%98%BF%E7%B1%B3%E5%A8%85">PTRS wiki(ZH)</a>
 *
 */
public class Amiya implements Operator  {

    CountDownLatch countDownLatch;
    @Override
    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //System.out.println("Hi Doctor");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("roger");
        //codes here
        try {
            Thread.sleep(10000);//I want the rabbit win
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Amiya reached Finishing line");
    }
}
