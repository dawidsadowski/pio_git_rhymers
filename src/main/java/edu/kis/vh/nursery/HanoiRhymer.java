package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

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

// Kombinacja klawiszy alt + strzałki umożliwia przemieszczanie się pomiędzy otwartymi plikami
// Źle sformatowane wiersze w klasie HanoiRhymer: 5, 12, 14, 15