

public class Project {
    private int io;
    private String name;
    private double approvedValue;
    private double availabelValue;
    private double spentValue;
    private double commitmentValue;
    private double execution;
    private int step = 0;

    public int getIo() {
        return io;
    }

    public void setIo(Integer io) {
        this.io = io;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getApprovedValue() {
        return approvedValue;
    }

    public void setApprovedValue(Double approvedValue) {
        this.approvedValue = approvedValue;
    }

    public Double getAvailabel() {
        return availabelValue;
    }

    public void setAvailabel(Double availabelValue) {
        this.availabelValue = availabelValue;
    }

    public Double getSpentValue() {
        return spentValue;
    }

    public void setSpentValue(Double spentValue) {
        this.spentValue = spentValue;
    }

    public Double getCommitmentValue() {
        return commitmentValue;
    }

    public void setCommitmentValue(Double commitmentValue) {
        this.commitmentValue = commitmentValue;
    }

    public Double getExecution() {
        return execution;
    }

    public void setExecution(Double execucao) {
        this.execution = execucao;
    }

    public void toProgress(double valueEscop) {
        if (step == 0) {
            this.commitmentValue = valueEscop;
            this.availabelValue = this.approvedValue - this.commitmentValue;
            step++;
        } else {
            this.spentValue = this.commitmentValue;
            this.execution = (100 * this.spentValue) / this.approvedValue;
            this.commitmentValue += valueEscop;
            this.availabelValue = this.approvedValue - this.commitmentValue;
            if (this.availabelValue < 0) {
                System.out.println("Saldo indisponível no projeto! Valor de compromisso excede em R$" + (this.commitmentValue - this.approvedValue) + " no saldo do projeto.");
                System.out.println("Por favor, revise o escopo que está sendo contratado.");    
            } else {
                step++;
            }    
        }
        
    }
}
