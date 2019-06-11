package pw;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CompetitiorList implements Iterable<Competitor> {
    private Competitor[] list;

    public Competitor[] getList() {
        return list;
    }

    @Override
    public Iterator<Competitor> iterator() {
        return new Iterator<Competitor>() {
            private int i = 0;
            private Competitor[] copy = Arrays.copyOf(list, list.length); //Doesn't have to be a copy

            @Override
            public boolean hasNext() {
                return i < copy.length;
            }

            @Override
            public Competitor next() {
                if (hasNext())
                    return copy[i++];
                else
                    throw new NoSuchElementException();
            }
        };
    }

    public void setList(Competitor[] list) {
        this.list = list;
    }

    public CompetitiorList(Competitor[] list) {
        this.list = list;
    }
}
