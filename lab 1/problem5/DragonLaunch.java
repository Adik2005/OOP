package problem5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> kidnapped;

    public DragonLaunch() {
        kidnapped = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    // true -> dragon will eat (someone left)
    // false -> no one left after disappearing pairs
    public boolean willDragonEatOrNot() {
        int top = -1; // index of last "kept" person in the same vector

        for (int i = 0; i < kidnapped.size(); i++) {
            Person current = kidnapped.get(i);

            if (top >= 0) {
                Person lastKept = kidnapped.get(top);

                // if we have BOY then GIRL -> they disappear
                if (lastKept.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    top--; // remove lastKept logically
                    continue;
                }
            }

            // keep current person (overwrite position top+1)
            top++;
            kidnapped.set(top, current);
        }

        int remaining = top + 1;
        return remaining > 0;
    }

    // optional: show current line
    public String lineAsString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : kidnapped) {
            sb.append(p.getGender() == Gender.BOY ? "B" : "G");
        }
        return sb.toString();
    }
}

