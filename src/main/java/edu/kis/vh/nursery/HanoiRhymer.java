package edu.kis.vh.nursery;
//Option + -> pozwala na przesunięcie kursora pomijając wyrazy. Jedno kliknięcie jest równe przesunięciu kursora o jednemu wyrazowi.
//Zmieniono tabulacje przed totalRejected oraz dla składni if...else...

public class HanoiRhymer extends defaultCountingOutRhymer {
    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
