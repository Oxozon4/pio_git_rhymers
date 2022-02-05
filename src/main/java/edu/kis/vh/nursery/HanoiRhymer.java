package edu.kis.vh.nursery;

/**
 * HanoiRhymer class that extends DefaultCountingOutRhymer 
 * @see HanoiRhymer
 * @see DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * public getter function to get totalRejected variable value
     * @return value of totalRejected variable
     * @see HanoiRhymer
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * public countIn function to increment totalRejected variable or call countIn method
     * from DefaultCountingOutRhymer class
     * @return value of totalRejected variable
     * @see HanoiRhymer
     * @see DefaultCountingOutRhymer
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// Kombinacja klawiszy Alt + -> przenosi do następnego otwartego pliku, a Alt + <- przenosi do poprzedniego otwartego pliku.