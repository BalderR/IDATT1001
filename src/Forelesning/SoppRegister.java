package Forelesning;

import java.sql.Array;

public class SoppRegister {
    private Soppart[] soppRegister;
    private int teller = 0;
    private final int hoi = 10;

    public SoppRegister() {
        this.soppRegister = new Soppart[10];
    }

    public void nySoppart(Soppart s) {
        for (Soppart soppart : soppRegister) {
            if (soppart.equals(s)) {
                throw new IllegalArgumentException("Soppen finnes allerede");
            } else {
                soppRegister[teller] = s;
            }
        }

    }
}
