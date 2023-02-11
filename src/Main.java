public class Main {
    public static void main(String[] args) {
        
        Project project1 = new Project();
        project1.setIo(1004001);
        project1.setName("Personalization of Maintenance module");
        project1.setApprovedValue(300d);
        project1.setAvailabel(300d);
        project1.setSpentValue(0d);
        project1.setCommitmentValue(0d);
        project1.setExecution(0d);

        Project project2 = new Project();
        project2.setIo(1003646);
        project2.setName("New structural server and their system management");
        project2.setApprovedValue(600d);
        project2.setAvailabel(600d);
        project2.setSpentValue(0d);
        project2.setCommitmentValue(0d);
        project2.setExecution(0d);

        project1.toProgress(120);
        System.out.println("Valor de compromisso no projeto 1 R$: " + project1.getCommitmentValue());
        System.out.println("Saldo disponível no projeto 1 R$: " + project1.getAvailabel());
        System.out.println("Valor gasto no projeto 1 é de R$ " + project1.getSpentValue());
        System.out.println("Execução está em: " + project1.getExecution() + "%");
        project1.toProgress(120);
        System.out.println("Valor de compromisso no projeto 1 R$: " + project1.getCommitmentValue());
        System.out.println("Saldo disponível no projeto 1 R$: " + project1.getAvailabel());
        System.out.println("Valor gasto no projeto 1 é de R$ " + project1.getSpentValue());
        System.out.println("Execução está em: " + project1.getExecution() + "%");
        project1.toProgress(120);
        System.out.println("Valor de compromisso no projeto 1 R$: " + project1.getCommitmentValue());
        System.out.println("Saldo disponível no projeto 1 R$: " + project1.getAvailabel());
        System.out.println("Valor gasto no projeto 1 é de R$ " + project1.getSpentValue());
        System.out.println("Execução está em: " + project1.getExecution() + "%");
        
    }
}
