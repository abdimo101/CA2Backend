package dtos;

public class AdviceDTO {
    private String id;
    private String advice;

    public AdviceDTO(String id, String advice) {
        this.id = id;
        this.advice = advice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
