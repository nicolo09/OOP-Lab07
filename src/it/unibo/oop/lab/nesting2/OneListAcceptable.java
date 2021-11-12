package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

    /**
     * Represents a List-based acceptor which accept a list in his constructor and
     * accepts exactly the sequence of elements contained in that list
     */

    class OneListAcceptor implements Acceptor<T> {

        List<T> acceptorList;
        int index;

        OneListAcceptor(List<T> list) {
            acceptorList = new ArrayList<>(list);
            index = 0;
        }

        @Override
        public void accept(T newElement) throws ElementNotAcceptedException {
            if (Integer.compare(index, acceptorList.size()) < 0 && acceptorList.get(index).equals(newElement)) {
                index++;
            } else {
                throw new ElementNotAcceptedException(newElement);
            }

        }

        @Override
        public void end() throws EndNotAcceptedException {
            if (Integer.compare(index, acceptorList.size()) != 0) {
                throw new EndNotAcceptedException();
            }

        }
    }

    OneListAcceptor acc;

    public OneListAcceptable(List<T> list) {
        acc = new OneListAcceptor(list);
    }

    @Override
    public Acceptor<T> acceptor() {
        return acc;
    }

}
