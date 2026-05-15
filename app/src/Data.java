public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        boolean valido = validarDiaData();

        if (valido){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("A data está inválida, alterando data para 01/01/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    boolean verificaAnoBissexto() {
        boolean bissexto = false;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                } else {
                    bissexto = false;
                }
            } else {
                bissexto = true;
            }
        } else {
            bissexto = false;
        }

        return bissexto;
    }

    boolean validarDiaData() {
        boolean valido = false;

        if (mes == 1 && dia >= 1 && dia <=31) {
            valido = true;
        } else if (mes == 2 && dia >= 1 && dia <= 27) {
            valido = true;
        } else if (mes == 2 && dia == 28) {
            if (verificaAnoBissexto()) {
                valido = true;
            } else {
                valido = false;
            }
        } else if (mes == 3 && dia >= 1 && dia <= 31) {
            valido = true;
        } else if (mes == 4 && dia >= 1 && dia <= 30) {
            valido = true;
        } else if (mes == 5 && dia >= 1 && dia <= 31) {
            valido = true;
        } else if (mes == 6 && dia >= 1 && dia <= 30) {
            valido = true;
        } else if (mes == 7 && dia >= 1 && dia <= 31) {
            valido = true;
        } else if (mes == 8 && dia >= 1 && dia <= 31) {
            valido = true;
        } else if (mes == 9 && dia >= 1 && dia <= 30) {
            valido = true;
        } else if (mes == 10 && dia >= 1 && dia <= 31) {
            valido = true;
        } else if (mes == 11 && dia >= 1 && dia <= 30) {
            valido = true;
        } else if (mes == 12 && dia >= 1 && dia <= 31) {
            valido = true;
        } else {
            valido = false;
        }

        return valido;
    }



    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
