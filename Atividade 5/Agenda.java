public class Agenda {
    private String data;
    private String hora;

    public Agenda() {}

    public Agenda(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public void consultar() {
        System.out.println("Agenda [data=" + data + ", hora=" + hora + "]");
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
}
