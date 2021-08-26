package no.kristiania;

public class convertToRoman {
    private final int field;

    String[] numerals = {"I","V","X","L","C","D","M"};
    int [] values= {1,5,10,50,100,500,1000};


    public convertToRoman(int field) {
        this.field = field;
    }

    public String getRoman() {
        String res = "";

        for (int i = 0; i < values.length; i++) {
            if(field == values[i]) return numerals[i];
        }


        return res;
    }
}
