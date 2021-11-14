package dtos;

import java.util.ArrayList;

public class AdvicesDTO {
    private ArrayList<AdviceDTO> slip;

    public AdvicesDTO(ArrayList<AdviceDTO> slip) {
        this.slip = slip;
    }

    public ArrayList<AdviceDTO> getAdvices() {
        return slip;
    }

    public void setAdvices(ArrayList<AdviceDTO> slip) {
        this.slip = slip;
    }
}
