package dtos;

public class CatFactsDTO {
    private String fact;
    private String length;


    public CatFactsDTO(String fact, String length) {
        this.fact = fact;
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
