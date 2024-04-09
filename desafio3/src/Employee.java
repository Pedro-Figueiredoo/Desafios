public class Employee {
    public String nomeFuncionario;

    public Double salarioBruto;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nomeFuncionario='" + nomeFuncionario + '\'' +
                '}';
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double taxa;




}