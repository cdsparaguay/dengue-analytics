package daee.learner.framework.dto;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrainerDTO {

    private List<ParamDTO> params;
    private String dataset;
    private List<TrainingVariableDTO> variables;
    private Long traniningId;
    private URL dataUrl;

    public List<ParamDTO> getParams() {
        return params;
    }

    public void setParams(List<ParamDTO> params) {
        this.params = params;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public List<TrainingVariableDTO> getVariables() {
        return variables;
    }

    public void setVariables(List<TrainingVariableDTO> variables) {
        this.variables = variables;
    }

    public Long getTraniningId() {
        return traniningId;
    }

    public void setTraniningId(Long traniningId) {
        this.traniningId = traniningId;
    }

    public String[] getTargetVariablesName() {
        List<String> toRet = new ArrayList<>();
        for (TrainingVariableDTO trainingVariableDTO: this.getVariables()) {
            if(trainingVariableDTO.getTarget()) {
                toRet.add(trainingVariableDTO.getName());
            }
        }
        return toRet.toArray(new String[0]);
    }

    public String[] getFeatureVariablesName() {
        List<String> toRet = new ArrayList<>();
        for (TrainingVariableDTO trainingVariableDTO: this.getVariables()) {
            if(!trainingVariableDTO.getTarget()) {
                toRet.add(trainingVariableDTO.getName());
            }
        }
        return toRet.toArray(new String[0]);
    }

    public URL getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(URL dataUrl) {
        this.dataUrl = dataUrl;
    }
}
